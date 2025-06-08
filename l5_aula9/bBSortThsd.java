//q. 9 - lista 5

import java.util.Arrays;
import java.util.Random;


public class bBSortThsd{
    public static int in_Sort(int[] vetor){
        int tam=vetor.length;
        int pas=0;
        for(int i=1;i<tam;i++){ //análise a partir do 2o. índice
            int k=vetor[i];
            int j=i-1;
            pas++;
            while(j>=0 && vetor[j]>k){
                pas+=2;
                vetor[j+1]=vetor[j];
                j--;
                pas++;
            }
            vetor[j+1]=k;
             //troca para continuar laço
             pas++;
        }
        return pas;
    }

    public static int bBSort(int[] v){
        int tam=v.length;
        int pas=1;
        for(int i=0; i<tam; i++){
            pas++;
            for(int j=0; j<tam-i-1; j++){
                pas++;
                if(v[j]>v[j+1]){
                    int t=v[j];
                    v[j]=v[j+1];
                    v[j+1]=t;
                    pas+=3; //três passos de troca
                }
            }
        }

        return pas;
    }

    //gerador de arrays em números aleatórios;

    public static int[] RandomNumbers(){
        int[] num=new int[1000];
        Random rand=new Random();

        for(int i=0; i<num.length;i++){
            num[i]=rand.nextInt(1001);
        }
        return num;
    }


    public static void processArray(int[] arr){
        System.out.println("\n\n 1000 números: "+
        Arrays.toString(Arrays.copyOfRange(arr,0,1000)));
    }

    

    public static void main(String[] args){
        int[] v1=RandomNumbers();
        int[] v2=Arrays.copyOf(v1, v1.length);

        System.out.println("\n\nArray original: ");
        processArray(v1);

        //comparando:
        System.out.println("\n\n Bubble: ");
        int bb=bBSort(v1);
        processArray(v1);
        System.out.println("\n\n\n Quantidade de passos: "+bb);

        System.out.println("\n\n  Inserção: ");
        int is=in_Sort(v2);
        processArray(v2);
        System.out.println("\n\n\n Quantidade de passos: "+is);
        
        //Bubble Sort toma mais de 120 mil passos

        //Inserção toma mais de 700 mil passos
    }

}