import java.lang.Math;

//Implemente a remoção com encadeamento e sondagem
//tabela hash 5 primeiros digitos CPF e dois primeiros nomes7



class No{
    int val;
    String nome;
    No prox;

    No(int v, String n){
        this.val=v;
        this.nome=n;
        this.prox=null;
    }
}

class Chain{
    private No[] table;
    private int size;
    //tabela com hashs de tipo No

    public Chain(int cap){
        table=new No[cap];
        size=0; //o tipo inteiro é suficiente aqui; possível usar BigInteger
        //cria uma tabela para o chaining

    }

    //função de hash (usando a chave k)
    private int hash(int k){
        return k % table.length;
    }


    public void insert(int value, String n){
        int index=hash(value); //cada índice recebe um hash
        No novo_no= new No(value, n);

        if(table[index]==null){
            table[index]=novo_no;
        }else {
            novo_no.prox = table[index];
            table[index] = novo_no;
        }
        size++;
    }

    public boolean remove(int v){
        int index=hash(v);
        No atual=table[index];
        No ant=null;

        while(atual!=null) {
            if(atual.val==v){
                if(ant==null) {
                    table[index]=atual.prox;
                }else{
                    ant.prox=atual.prox;
                }
                size--;
                System.out.println("Valor removido da tabela: "+v+"\n");
                return true;
            }
            ant=atual;
            atual=atual.prox;
        }
        return false;
    }

    public int tam(){
            return size;
    }


    public boolean search(int v){
        int index=hash(v);
        No atual=table[index];

        while(atual!=null){
            if(atual.val==v){
                System.out.println("Valor encontrado! "+v+"\n");
                return true;
            }else{
                atual=atual.prox;
            }
           
        }
         return false;
    }

     public void showChain(){
            for(int i=0; i<table.length; i++){
            No atual=table[i];    

        System.out.println("\nIndex: "+i);
            
        if(atual==null) System.out.println(">>> null");
        System.out.print("");

        while(atual!=null){
                System.out.print(atual.val+" - "+atual.nome+(atual.prox != null ? " -> ":""));
                atual=atual.prox;
            }
            System.out.println("");
        }

     }



}

class Sdg{
    private No[] table;
    private int size;

    public Sdg(int cap){
        table = new No[cap];
        size=0;//padrão
    }

    public int hash(int k){
        return k%table.length;
    }

    public boolean linProbing(int v){
        int index=hash(v);
        int original_value=index;

        do{
            if(table[index]!=null && table[index].val==v){
                System.out.println("Valor encontrado! "+v+"\n");
                return true;
            }index=(index+1)%table.length;
        }while(index!=original_value && table[index]!=null);
        //laço opera para encontrar o índice associado ao valor
        
        return false;
    }


    public void insert(int v, String n){
        int index=hash(v);
        while(table[index]!=null){
            index=(index+1)%table.length;
        }
        table[index]=new No(v, n);
        size++;
    }



     public void remove(int v){
        int index=hash(v);
        if(table[index].val==v){
            table[index]=null; 
        }//pesquisa apenas linear pelo elemento
        System.out.println("Elemento "+v+" não encontrado\n");
        //tamanho não diminui!
     }
     //+ em: https://abre.ai/lprobing-quora-rmv 


     public int tam(){
        return size;
     }

     public void showSdg(){
        //int index=hash(v);
        for(int i=0;i<table.length;i++){
            if(table[i]!=null){
                System.out.println("Index "+ i +": "+table[i].val+" "+table[i].nome);
            }else{
                System.out.println("Index "+ i +": "+null);
            }
        }
     }

}



public class chain_sdg {

    public static boolean primeYN(int v){
        double r=Math.sqrt(v);
        int i=3;
        //while()
        if(v%2==0) return false;
        if(v==2) return true;

        for(;i<=r;i++){
            if(v%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args){


       Sdg l1= new Sdg(10);
       Chain l2= new Chain(10);

       l1.insert(58989, "Otávio Guedes");
       l1.insert(19980, "Guilherme Sampaio");
       l1.insert(37989, "Sandra Viana");
       l1.insert(18989, "Vera Fischer");
       l1.insert(55989, "Firmino Getúlio");
       l1.insert(55989, "Túlio Novaes");
       l1.insert(19981, "Natan Filho");
       l1.insert(37097, "Fux da Silva");
       l1.insert(17989, "Alexandre de Moraes");
       l1.insert(56986, "Flávio Dino");

       l1.showSdg();
       System.out.print("\n"); //hashs iguais a 9 → apenas 58989 vai para abaixo de todos
       //indo para última das posições livres
        int count=1;
        for(int k=31;k<200 && l2.tam()<10 ;k++){
            String info="Primo: "+count;
                if(primeYN(k)){
                    l2.insert(k, info);
                    count++;
                }
        }

         l2.showChain(); //cada primo que tenha mod igual fica dentro de uma única lista

        //removal to be used


       }      
}