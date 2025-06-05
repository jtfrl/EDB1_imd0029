//q. 2 - lista 3

import java.util.Arrays;

public class s_srtStepbyStep{
    public static int[] sSortSbS(int[] vetor){
        int tam=vetor.length;
        int pas=1;
        for(int i=0; i<tam-1; i++){
            int minIndex=i;
        System.out.println("Passo: " + (pas++) + " | vetor em ordenação: " + 
        Arrays.toString(vetor));
            if(pas==tam){
                System.out.println("\n");
                System.out.println("Vetor ordenado: ");
            }
                for(int j=i+1; j<tam; j++){
                if(vetor[j]<vetor[minIndex]){
                    minIndex=j;
                }
            }
             //swap
            int t=vetor[minIndex];
            vetor[minIndex]=vetor[i];
            vetor[i]=t;
        }

       
         return vetor;

    }
   

    public static void main(String[] args){
        int[] v={28,13,5,18,46,4,6,28,22,20};
        //System.out.println("Vetor v ordenado: ");
        System.out.println(Arrays.toString(sSortSbS(v)));
    }
}