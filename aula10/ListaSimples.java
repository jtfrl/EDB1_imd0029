public class ListaSimples{
    No inicio;

    public ListaSimples(){
        this.inicio=null; //construtor
    }

    public void insertIni(int valor){
        No novo= new No(valor); //novo objeto criado
        novo.next=inicio;
        inicio=novo; //para estabelecer um novo
    }

    public void exibir(){
        No atual=inicio;
        while(atual!=null){
            System.out.println(atual.dado+"-->"); //'dado' é um atributo em No
            atual=atual.next;
        }
        System.out.println();
    }

    public boolean buscar(int valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.dado == valor) return true;
            atual = atual.next;
        }
    return false;
    }

    public void remover(int valor){
        No atual=inicio;
        No anterior=null;
        while (atual!=null){
            if(atual.dado==valor){
                if(anterior==null){
                    inicio=atual.next; //atualiza o começo da lista
                }else{
                    anterior.next=atual.next;
                }
                return;
            }
        }
        anterior=atual;
        atual=atual.next;

    }
}