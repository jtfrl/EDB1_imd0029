
//Implemente a remoção com encadeamento e sondagem
//tabela hash 5 primeiros digitos CPF e dois primeiros nomes
public class No{
    int val;
    No prox;

    No(int v){
        this.val=v;
        this.prox=null;
    }
}

public class Chain{
    private No[] table;
    private int size;
    //tabela com hashs de tipo No

    public Chain(int cap){
        table=new No[cap];
        size=0;
        //cria uma tabela para o chaining

    }

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

    
}

public class Sdg{
    //impl: linear probing
}



public class chain_sdg {
    public static void main(String[] args){
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}