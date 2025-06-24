public class ListaDupla{
    NoDuplo inicio;
    NoDuplo fim;
    public ListaDupla(){
        this.inicio=null;
        this.fim=null;
    }
    public void inserir(int valor) {
        NoDuplo novo = new NoDuplo(valor);
        if (inicio == fim) {
            inicio = fim; //como não há valor, o valor vai ser adotado para o inicio
            fim = novo;
        } else {
            fim.next = novo;
            novo.anterior = fim;
            fim = novo;
        }

        public void remover ( int valor){
            NoDuplo at = inicio;
            NoDuplo ant = null;


            while (atual != null) {
                if (atual.dado == valor) {
                    if (ant == null) {
                        inicio = atual.next;
                        if (inicio != null) {
                            inicio.anterior = null;
                        }
                    } else {
                        ant.proximo = atual.proximo;
                    }
                    if (atual.proximo != null) {
                        atual.proximo.anterior = ant; //atualiza a referencia do próximo no
                    }

                }

            }
            return;
        }
        ant=atual;
        atual=atual.proximo;
        }


     /*
     *   public void remover(int valor){
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
     *
     *
     *
     * */


    }
}