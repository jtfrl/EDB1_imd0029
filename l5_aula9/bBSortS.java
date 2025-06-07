//q. 4 - lista 5

import java.util.Arrays;

public class bBSortS{
    public static void bbsorts(String[] v){
        int tam=v.length;
        for(int i=0; i<v.length-1;i++){
            for(int j=0;j<v.length-1-i;j++){
                if(v[j].compareTo(v[j+1])>0){
                    String t=v[j];
                    v[j]=v[j+1];
                    v[j+1]=t;
                }
            }
        }
    }



    public static void main(String[] args){
        String[] r={"Banda", "Artista", "Integrante", "Jazz", "Estilo",
         "Música", "Cena", "Funk"};
        bbsorts(r);
        System.out.println(Arrays.toString(r));
    }
}