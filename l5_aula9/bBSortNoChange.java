//q. 5 - lista 5

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
        //int[] n={-30, -7, 192,168,172,139,200,401,404,0,-2};
        int[] v={22,23,24,25,26,27,28,29,30};
        bbsort(v);
        System.out.println(Arrays.toString(v));
    }
}