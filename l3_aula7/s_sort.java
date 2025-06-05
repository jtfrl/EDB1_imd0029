//q. 1 - lista 3

import java.util.Arrays;

public class s_sort{
    public static int[] sSort(int[] vetor){
        int tam=vetor.length;
        for(int i=0; i<tam-1; i++){
            int minIndex=i;
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
        System.out.println("Vetor v ordenado: ");
        System.out.println(Arrays.toString(sSort(v)));
    }
}