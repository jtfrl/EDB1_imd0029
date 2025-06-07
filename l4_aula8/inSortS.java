//q. 5 - lista 4

import java.util.Arrays;

public class inSortS{
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
        String[] r={"Banda", "Artista", "Integrante", "Jazz", "Estilo",
         "Música", "Cena", "Funk"};
        in_Sort(r); 
        System.out.println(Arrays.toString(r));
    }
}