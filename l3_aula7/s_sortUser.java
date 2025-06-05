//q. 3 - lista 3

import java.util.Arrays;
import java.util.Scanner;

public class s_sortUser{
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
        int[] v= new int[8];

        
        System.out.println("Digite os números do array");
        for(int i=0; i<8; i++){
            Scanner s= new Scanner(System.in);
            int n=s.nextInt();
            v[i]=n;
        }

        System.out.println("\n");
        System.out.println("Vetor v ordenado: ");
        System.out.println(Arrays.toString(sSort(v)));
        System.out.println("\n");

        
    }
}