public class ListaSimples{
    No inicio;

    public ListaSimples(){
        this.inicio=null;
    }

    public void insertIni(int valor){
        No novo= new No(valor); //novo objeto criado
        novo.next=inicio;
    }

    public void exibir(){
        No atual=inicio;
        while(atual!=null){
            System.out.println(atual.dado+"-->");
            atual=atual.next;
        }

    }

    public boolean buscar(int valor){
        No atual=inicio;
        while(atual=!null){
            if(atual.dado == valor) return false
        }
    }

    public void remover(int valor){
        No atual=inicio;
        No anterior=null;


    }
}