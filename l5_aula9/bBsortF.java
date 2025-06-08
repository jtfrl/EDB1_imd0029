//q. 8 - lista 5

import java.util.Arrays;

public class bBsortF{
    public static void bbsortf(double[] v){
        int tam=v.length;
        for(int i=0; i<v.length-1;i++){
            for(int j=0;j<v.length-1-i;j++){
                if(v[j]>v[j+1]){
                    double t=v[j];
                    v[j]=v[j+1];
                    v[j+1]=t;
                }
            }
        }
    }



    public static void main(String[] args){
        double[] n={-30.12, -7.6, 192.48,168.12,172.29,139.31,200.2,-200.3,-200.4};

        bbsortf(n);
        System.out.println(Arrays.toString(n));
    }
}