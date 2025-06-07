//q. 6 - lista 4

import java.util.Arrays;
import java.util.Scanner;

public class inSortUName{
    public static void in_Sort(String[] vetor){
        int tam=vetor.length;
        for(int i=1;i<tam;i++){ //análise a partir do 2o. índice
            String k=vetor[i];
            int j=i-1;
            //            while(j>=0 && vetor[j]>k){
            while(j>=0 && vetor[j].compareTo(k)>0){
                vetor[j+1]=vetor[j];
                j--;
            }
            vetor[j+1]=k; //troca para continuar laço
        }
    }


    public static void main(String... args){
        //String[] r={"Banda", "Artista", "Integrante", "Jazz", "Estilo",
        // "Música", "Cena", "Funk"};
        String[] v=new String[8];
        int tam=v.length;
        
        System.out.println("Digite as palavras para serem ordenadas");
        for(int i=0;i<tam;i++){
            Scanner s=new Scanner(System.in);
            String n=s.nextLine();
            v[i]=n;
        }

        in_Sort(v); 

        System.out.println("\n Array ordenado: ");
        System.out.println(Arrays.toString(v));
    }
}