//q. 3 - lista 4

import java.util.Arrays;
import java.util.Scanner;

public class inSortUser{
    public static void in_Sort(int[] vetor){
        int tam=vetor.length;
        for(int i=1;i<tam;i++){ //análise a partir do 2o. índice
            int k=vetor[i];
            int j=i-1;
            while(j>=0 && vetor[j]>k){
                vetor[j+1]=vetor[j];
                j--;
            }
            vetor[j+1]=k; //troca para continuar laço
        }
    }


    public static void main(String... args){
        int[] v=new int[8];

        System.out.println("Digite os números do array");
        for(int i=0; i<8; i++){
            Scanner s= new Scanner(System.in);
            int n=s.nextInt();
            v[i]=n;
        }
        in_Sort(v);

        System.out.println("\n");
        System.out.println("Vetor v ordenado: ");
        System.out.println(Arrays.toString(v));
        System.out.println("\n");
    }
}