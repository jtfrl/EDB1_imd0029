class No<T>{
    T data;
    No<T> prox;

    public No(T d){
        this.data=d;
        this.prox=null;
    }
}

class LQgen<T>{
    private No<T> head, tail;

    public LQgen(){
        this.head=this.tail=null;
    }

    public void enFilagen(T d){
        No<T> novo_no=new No<>(d); //objeto generalizado?
   
        if(this.tail==null){
            this.head=this.tail=novo_no;
            return;
        }

        this.tail.prox=novo_no;
        this.tail=novo_no;
   
    }


    public T dequeue(){
        if(this.head==null){
            throw new IllegalStateException("Não há elementos\n");
        }

        //tipo generico aqui
        T v=this.head.data;
        this.head=this.head.prox;


        //avalia novamente se não está 'null'
        if(this.head==null){
            this.tail=null;
        }
        return v;
    }

    public boolean isEmpty(){
        return this.head==null;
    }

    public void imprimirLQgen(){
        No<T> atual=head;
        while(atual!=null){
            System.out.print(atual.data);
            if(atual.prox!=null){
                System.out.print("-->");
            }
            atual=atual.prox;

        }
            System.out.println();

    }

}



public class MainLQgen{
    public static void main(String[] args){
        LQgen<String> f=new LQgen<>(); //tipo não pode ser generico aqui

        f.enFilagen("Banana");
        f.enFilagen("Papel toalha");
        f.enFilagen("Sabonete");
        f.enFilagen("Nutella");
        f.enFilagen("Queijo");
        f.enFilagen("Pão");

        f.imprimirLQgen();
    }

}