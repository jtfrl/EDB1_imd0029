//q. 5 - lista 3

import java.util.Arrays;

public class s_sortString{
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
            String[] t={"Phiona", "Rachel", "Haim", "Romy", "Cícero", "Céu", "Potygura Bardo",
            "Boogarins"};
            System.out.println("Vetor t ordenado: ");
            System.out.println(Arrays.toString(sSortName(t)));
        }
    }

