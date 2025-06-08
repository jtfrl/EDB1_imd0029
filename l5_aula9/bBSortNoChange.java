//q. 5 e 6 - lista 5
//Obs.: o algoritmo atende às duas questões
/*
 * - verifica com 'swap' quando não há troca (5)
 * - não realiza nenhuma roca, já que swap vai para o condicional e aponta 'false'
 * levando a saída: "Vetor já ordenado". 
 * 
 */

import java.util.Arrays;

public class bBSortNoChange{
    public static void bbsort(int[] v){
        int tam=v.length;
        for(int i=0; i<v.length-1;i++){
            boolean swap=false;
            for(int j=0;j<v.length-1-i;j++){
                        if(v[j]>v[j+1]){
                            int t=v[j];
                            v[j]=v[j+1];
                            v[j+1]=t;
                            swap=true;
                            }
                        }
                    if(!swap){
                        System.out.println("Vetor já ordenado");
                        break;
                    } 
                }
                                       
            }
            

    public static void main(String[] args){
        int[] v={22,23,24,25,26,27,28,29,30};
        bbsort(v);
        System.out.println(Arrays.toString(v));
    }
}