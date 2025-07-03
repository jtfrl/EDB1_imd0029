public class Pilha{
    private int[] pilha;
    private int topo=0;

    public Pilha(int tam){
        pilha=new int[tam];
        topo=-1;
    }

    public void empilhar(int val){
        if(topo==pilha.length-1){
            throw new RuntimeException("Pilha cheia\n");
        }
        topo++;
        pilha[topo]=val;
    }

    public int desempilhar(){
        if(isEmpty()){
            throw new RuntimeException("Pilha vazia\n");
        }
        return pilha[topo]; //exibe o valor que está no topo
    }

    public boolean isEmpty(){
        return topo==-1; //se não houver elementos, o tamanho ficará "negativo"
    }

    public int tam(){
        return pilha.length;
        //return topo-1;
    }
}