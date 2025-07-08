class No{
    int v;
    No prox;
    No(int new_v){
        this.v=new_v;
        this.prox=null;
    }
}

class LinkedQ{
    private No head, tail;

    public LinkedQ(){
        this.head=this.tail;
    }

    public void enfila(int v){
        No novo_no=new No(v);

        if(this.tail==null){
            this.tail=this.head=novo_no;
            return;
        }


        this.tail.prox=novo_no;
        this.tail=novo_no;
    }


    //remover item de fila
    public int foraFila(){
        if(this.head==null){
            throw new IllegalStateException("Fila vazia\n");
        }

        int v=this.head.v; //assume o valor que fica no início
        this.head=this.head.prox; //aponta para o próximo na fila

        return v;
    }

    public boolean empty(){
        return this.head == null;
    }


    public void imprimirFila(){
        No atual=head;
        while(atual!=null){
            System.out.println(atual.v);
            if(atual.prox!=null){
                System.out.println("-->");
            }
            atual=atual.prox;
        }
        System.out.println(); //pula linha
    }
}


public class MainLQ{
    public static void main(String[] args){
        LinkedQ f = new LinkedQ();

        f.enfila(8);
        f.enfila(14);
        f.enfila(22);
        f.enfila(30);
        f.enfila(52);


        f.imprimirFila();
    }
}