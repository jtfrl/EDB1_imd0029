//q. 5 - lista 3

import java.util.Arrays;

public class s_sortS{
    public static String[] sSortName(String[] vetor){
        int tam=vetor.length;
        for (int i=0;i<tam;i++){
            int minIndex=i;
            for(int j=i+1; j<tam; j++){
                if(vetor[j].compareTo(vetor[minIndex])<0){
                    minIndex=j;
                }
            }

            //swap

            String t=vetor[minIndex];
            vetor[minIndex]=vetor[i];
            vetor[i]=t;
             
            }


            return vetor;
        }


        public static void main(String[] args){
            String[] r={"Samuel L. Jackson", "Uma Thurman", "Tim Roth", "Christoph Waltz", "Harvey Keitel"};
            System.out.println("Vetor r ordenado: ");
            System.out.println(Arrays.toString(sSortName(r)));

        }
    }

