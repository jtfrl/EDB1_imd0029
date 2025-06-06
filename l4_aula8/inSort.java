//q. 1 - lista 4

import java.util.Arrays;

public class inSort{
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
        int[] v={18,9,2,11,20,38,47,45,56,36,-6,-12};
        in_Sort(v); //tipo void: não é possível colocar na linha abaixo
        System.out.println(Arrays.toString(v));
    }
}