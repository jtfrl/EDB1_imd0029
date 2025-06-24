//q. 1: Lista de Exercícios – Listas Encadeadas

/* >>> REQUISITOS <<<
 * Operações necessárias:
a) Inserir paciente. OK
b) Chamar próximo paciente. A SER IMPLEMENTADO 
c) Listar pacientes aguardando IDEM
 * 
 */

public class ls_atendimento{
    private ls_atNo inicio;
    private ls_atNo fim; //inicio e fim da fila


    //fila
    public void inLine(int senha, int idade, int arrival){
        ls_atNo novo_no= new ls_atNo(senha, idade, arrival, nome);


        if(inicio==null){
            inicio=novo_no;
            fim=novo_no; //fila com uma só pessoa
        }else{
                ls_atNo atual=inicio;
                ls_atNo anterior=null;

            while(atual!=null && atual.idade>=60 && idade<60){
                //idade toma o dado sobre um novo paciente
                anterior=atual;
                atual=atual.prox;
            }

            if(anterior==null){
                novo_no.prox=inicio; //paciente anterior vai ser o começo da fila
                inicio=novo_no;
            }else{
                anterior.prox=novo_no;
                novo_no.prox=atual;
            }

            if(newNode.prox==null){
                fim=novo_no;
            }

        }
    }

    public void inFim(int senha, int idade, int arrival, String nome){
        ls_atNo no_pessoa = new ls_atNo(senha, idade, arrival, nome);
       if(inicio=null){
        inicio=no_pessoa; //assumindo que a fila não tenha ninguem
       }else{
        fim.prox=no_pessoa;
       }

       fim=no_pessoa; //final assume a próxima pessoa que chega
    }





}

