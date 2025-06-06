//q. 7 - lista 3

import java.util.Arrays;

public class s_ComboSSort{
    public static int[] sSort(int[] vetor){
        int tam=vetor.length;
        for(int i=0; i<tam-1; i++){
            int minIndex=i;
                for(int j=i+1; j<tam; j++){
                if(vetor[j]<vetor[minIndex]){
                    minIndex=j;
                }
            }
             //swap
            int t=vetor[minIndex];
            vetor[minIndex]=vetor[i];
            vetor[i]=t;
        }

       
         return vetor;

    }


    public static int buscaBinaria(int[] vetor, int k){
        int b=0;
        int e=vetor.length-1;
            while(b<=e){
                int meio=(b+e)/2;
                if(vetor[meio]==k){
                    return meio;
                }else if(vetor[meio]<k){
                    b=meio+1;
                }else{
                    e=meio-1;
                }
            }

        return -1;
    }



    public static void main(String[] args){
        
        int[] v={1,5,9,35,405,410,419,464,883,1000, 200, 864, 
            400, 805, 44, 14, 6, 20, 21, 22};
        int [] vNovo=sSort(v);
        System.out.println(Arrays.toString(vNovo));
        System.out.println("\n");
        int dado=buscaBinaria(vNovo, 200);
        if(dado==-1) 
            System.out.println("Valor 200 não encontrado.");
        else
            System.out.println("Valor 200 encontrado no array v. Posição: "+dado);
        }

}