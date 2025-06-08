//q. 9 - lista 4

import java.util.Arrays;
import java.util.Scanner;

public class inSortGrade{
    public static void in_Sort(double[] vetor){
        int tam=vetor.length;
        for(int i=1;i<tam;i++){ //análise a partir do 2o. índice
            double k=vetor[i];
            int j=i-1;
            while(j>=0 && vetor[j]>k){
                vetor[j+1]=vetor[j];
                j--;
            }
            vetor[j+1]=k; //troca para continuar laço
        }
    }


    public static void main(String... args){
        double[] nota=new double[6];
        //System.out.println(Arrays.toString(v));

        System.out.println("Digite as seis notas (clique em Enter para adicionar cada uma): ");
        for(int i=0;i<nota.length;i++){
            Scanner s=new Scanner(System.in);
            double n=s.nextDouble();
            nota[i]=n;
        }

        in_Sort(nota);
        System.out.println("\n Notas ordenadas: ");
        System.out.println(Arrays.toString(nota));
    }
}