//q. 9 - Revisão (10.6.25)

import java.util.Arrays;

public class InSortStepByStepS{
    public static void in_Sort(String[] vetor){
        int tam=vetor.length;
        int pas=1;
        for(int i=1;i<tam;i++){ //análise a partir do 2o. índice
            String k=vetor[i];
            int j=i-1;
            while(j>=0 && vetor[j].compareTo(k)>0){
                vetor[j+1]=vetor[j];
                j--;
                System.out.println("Passo: "+(pas++)+" | Vetor em ordenação: "+Arrays.toString(vetor));
                System.out.println("\n");
            }
            vetor[j+1]=k; //troca para continuar laço
        }
        System.out.println("\n Vetor ordenado: ");
    }


    public static void main(String... args){
        String[] v={"Alfredo", "Edurado", "Alberto", "Zenom", "Adriano", "Melissa", "Ana",
    "Joaquina", "Aimée", "Fernanda", "Sandra", "Betânia", "Ester", "Letícia", "Jefferson", "Marcos",
    "Elen","Acácia", "Laura", "Angélica"};
        in_Sort(v);
        System.out.println(Arrays.toString(v));
    }
}