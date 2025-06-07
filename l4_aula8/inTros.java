//q. 4 - lista 4
import java.util.Arrays;

public class inTros{
    public static void in_Sort(int[] vetor){
        int tam=vetor.length;
        for(int i=1;i<tam;i++){ //análise a partir do 2o. índice
            int k=vetor[i];
            int j=i-1;
            while(j>=0 && vetor[j]<k){
                vetor[j+1]=vetor[j];
                j--;
            }
            vetor[j+1]=k; //troca para continuar laço
        }
    }


    public static void main(String... args){
        int[] v={18,9,2,11,20,38,47,45,56,36,-6,-12};
        int[] w={64,32,2,16,128,1024,4,2048,4096};
        in_Sort(v);
        in_Sort(w);
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(w));

    }
}