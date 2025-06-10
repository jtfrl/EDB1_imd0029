//q.1 - Revisão (10.6.25)

import java.util.Arrays;
//import rnum;

public class seInBb{
    public static void sSort(int[] v){
        int tam=v.length;
        for(int i=0;i<tam-1;i++){ //para trocar
            //'tam-1' evita percorrer o array inteiro
            int minIndex=i;
            for(int j=i+1; j<tam;j++){ //localiza o menor
                if(v[j]<v[minIndex]){
                    minIndex=j; //indice do menor recebe 
                    //o valor de j
                }
            }
            //swap
            int t=v[minIndex];
            v[minIndex]=v[i];
            v[i]=t;
        }
        //return v;
        imprimir(v);
    }


    public static void in_Sort(int[] v){
        int tam=v.length;
        for(int i=0;i<tam;i++){ //instrução única de loop
            int k=v[i];
            int j=i-1;
            /*
             * o laço a seguir só executa com 
             * condições específicas
             */
            while(j>=0 && v[j]>k){ //permite percorrer todo o array
                v[j+1]=v[j]; 
                j--;
            }
            v[j+1]=k;
        }
        imprimir(v);
    }

    public static void bbsort(int[] v){
        //int tam=v.length;
        for(int i=0;i<v.length-1;i++){
            for(int j=0;j<v.length-1-i;j++){
                if(v[j]>v[j+1]){
                   // v[i]=v[j+1];
                    int t=v[j];
                    v[j]=v[j+1];
                    v[j+1]=t;
                }
            }
        }
        imprimir(v);
    }

    public static void imprimir(int[] v){
        System.out.println("\n");
        System.out.println(Arrays.toString(v));
    }


    public static void main(String[] args){
        int vetor[]={-30, -7, 192,168,172,139,200,401,404,0,-2};
        //int arr[]=RandomNumbers();

        bbsort(vetor);
        sSort(vetor);
        in_Sort(vetor);

        //bbsort(arr);
    }



}