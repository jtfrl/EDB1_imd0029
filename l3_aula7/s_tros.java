//q. 4 - lista 3

import java.util.Arrays;

public class s_tros{
    public static int[] sSort(int[] vetor){
        int tam=vetor.length; 
        for(int i=0; i<tam-1; i++){
            int maxIndex=tam-1;
                for(int j=i+1; j<tam; j++){
                if(vetor[j]>vetor[maxIndex]){
                    maxIndex=j;
                }
            }
             //swap
            int t=vetor[maxIndex];
            vetor[maxIndex]=vetor[i];
            vetor[i]=t;
        }

       
         return vetor;

    }
   

    public static void main(String[] args){
        int[] v={28,13,5,18,46,4,6,28,22,20};
        int[] w={-15,-12,-13,-28,3,9,10,1,11,12};
        System.out.println("Vetor v e w ordenados (do maior para o menor): ");
        System.out.println(Arrays.toString(sSort(v)));
        System.out.println(Arrays.toString(sSort(w)));

    }
}