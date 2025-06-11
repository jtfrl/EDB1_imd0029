//q.2 - Revisão (10.6.25)

import java.util.Arrays;

public class compRandInvS{
    public static void sSort(int[] v){
        int tam=v.length;
        int troca=0;
        int comp=0;
        for(int i=0;i<tam-1;i++){ //para trocar
            //'tam-1' evita percorrer o array inteiro
            int minIndex=i;
            comp++; //comparção começa a executar:
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
            troca+=3;

        }
        //return v;
        imprimir(troca, comp);
        System.out.println("\n"+Arrays.toString(v));
    }


    public static void in_Sort(int[] v){
        int tam=v.length;
        int troca=0;
        int comp=0;
        for(int i=0;i<tam;i++){ //instrução única de loop
            int k=v[i];
            int j=i-1;
            /*
             * o laço a seguir só executa com 
             * condições específicas
            */
            comp++;

            while(j>=0 && v[j]>k){ //permite percorrer todo o array
                v[j+1]=v[j]; 
                j--;
                comp++;
                troca++;
            }
            v[j+1]=k;
            troca++;
        }
        imprimir(troca, comp);
        System.out.println("\n"+Arrays.toString(v));
    }

    public static void bbsort(int[] v){
        int troca=0;
        int comp=0;
        for(int i=0;i<v.length-1;i++){
            for(int j=0;j<v.length-1-i;j++){
                comp++;
                if(v[j]>v[j+1]){
                    int t=v[j];
                    v[j]=v[j+1];
                    v[j+1]=t;
                    troca+=3;
                }
            }
        }
        imprimir(troca, comp);
        System.out.println("\n");
        System.out.println(Arrays.toString(v));

    }

    public static void imprimir(int v, int u){
        System.out.println("\n");
        System.out.println("Trocas: "+v+"| Comparações: "+u);
    }


    public static void main(String[] args){
        int vetor[]={-30, -7, 192,168,172,139,200,401,404,0,-2, -150};
        int vetorOrd[]={0, 1, 2, 3, 4, 7, 7, 7, 8, 10, 10, 12};
        int vetorDro[]={11, 11, 9, 9, 9, 8, 7, 7, 6, 4, 2, 2};
        
        //vetor com ordem aleatória
        bbsort(vetor);
        sSort(vetor);
        in_Sort(vetor);
        System.out.println("\n\n");

        //vetor ordenado
         bbsort(vetorOrd);
        sSort(vetorOrd);
        in_Sort(vetorOrd);
        System.out.println("\n\n");

        //vetor com ordem invertida
         bbsort(vetorDro);
        sSort(vetorDro);
        in_Sort(vetorDro);
        System.out.println("\n\n");

    }



}