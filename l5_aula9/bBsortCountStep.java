//q. 7 - lista 5

import java.util.Arrays;

public class bBsortCountStep{
    public static void bbsort(int[] v){
        int tam=v.length;
        int pas=0;
        for(int i=0; i<v.length-1;i++){
            for(int j=0;j<v.length-1-i;j++){
                if(v[j]>v[j+1]){
                    int t=v[j];
                    v[j]=v[j+1];
                    v[j+1]=t;
                    pas++;
                }
            }
        }
        System.out.println("Passos: "+(pas));

        System.out.println("\nVetor ordenado: \n");
    }



    public static void main(String[] args){
        int[] n={-30, -7, 192,168,172,139,200,401,404,0,18,36,72,144,-2};

        bbsort(n);
        System.out.println(Arrays.toString(n));
    }
}