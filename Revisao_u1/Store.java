package Revisao_u1; //nome da pasta: troque antes de compilar

//q. 6 (parte 1) - Revisão em 10.6.25
//Esse arquivo, junto a parte 2, precisa estar em uma única
//pasta para funcionar


//executar com 

/*
 * javac -cp . <diretorio>/Store.java <diretorio>/pplStore.java
 * java -cp . <diretorio>.pplStore
 */

public class Store{
    private String[] prod=new String[100];
    private int prodCount=0;

    public void addProduct(String nome_u, double preco_u){
        if(prodCount<100){
            prod[prodCount]=nome_u+"(R$ "+preco_u+" )";
            prodCount++;
            System.out.println("Adicionado: "+prod[prodCount-1]);
        }else{
            System.out.println("Erro! Já há 100 produtos registrados. Não é possível adicionar.");
        }
    }

    public static void in_Sort(String[] vetor, int count){
        //count vai assumir o tamanho
        for(int i=1;i<count;i++){ //análise a partir do 2o. índice
            String k=vetor[i];
            int j=i-1;
            while(j>=0 && vetor[j].compareTo(k)>0){
                vetor[j+1]=vetor[j];
                j--;
            }
            vetor[j+1]=k; //troca para continuar laço
        }
    }

    public void sortProd(){
        in_Sort(prod, prodCount);
    }

    public void displayProd(){
        for (int i = 0; i < prodCount; i++) {
            System.out.println(prod[i]);
        }
    }

//ver restante da implementacao no email
}