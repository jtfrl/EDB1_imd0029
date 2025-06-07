//q. 3 - lista 5

import java.util.Arrays;

public class bBTros{
    public static void bbtros(int[] v){
        int tam=v.length;
        for(int i=0; i<v.length-1;i++){
            for(int j=0;j<v.length-1-i;j++){
                if(v[j]<v[j+1]){
                    int t=v[j];
                    v[j]=v[j+1];
                    v[j+1]=t;
                }
            }
        }
    }



    public static void main(String[] args){
        int[] n={-30, -7, 192,168,172,139,200,401,404,0,-2};

        bbtros(n);
        System.out.println(Arrays.toString(n));
    }
}