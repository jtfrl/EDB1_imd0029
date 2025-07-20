//Implemente a remoção com encadeamento e sondagem
//tabela hash 5 primeiros digitos CPF e dois primeiros nomes
class No{
    int val;
    No prox;

    No(int v){
        this.val=v;
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


    public void insert(int value){
        int index=hash(value); //cada índice recebe um hash
        No novo_no= new No(value);

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

     public void remove(int v){
        int index=hash(v);
        if(table[index].val==v){
            table[index]=null; 
        }//pesquisa apenas linear pelo elemento
        System.out.println("Elemento "+v+" não encontrado\n");
     }
     //+ em: https://abre.ai/lprobing-quora-rmv 


     public int tam(){
        return size;
     }

     public void showSdg(){
        //int index=hash(v);
        for(int i=0;i<table.length;i++){
            if(table[i]!=null){
                System.out.println("Index "+ i +": "+table[i].val);
            }else{
                System.out.println("Index "+ i +": "+null);
            }
        }
     }

}



public class chain_sdg {
    public static void main(String[] args){
        System.out.println("Hello and welcome!");

       Sdg l1= new Sdg(10);
       Chain l2= new Chain(10);

       /*    problema de inserção aqui!!!!
       l1.insert(5);
       l1.insert(19);
       l1.insert(37);
       l1.insert(18);
       l1.insert(55);
       l1.insert(55);
       l1.insert(19);
       l1.insert(370);
       l1.insert(17);
       l1.insert(56);
        */

       l1.showSdg();



    }
}