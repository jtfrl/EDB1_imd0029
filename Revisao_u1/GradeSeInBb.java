//q. 8 - Revisão (10.6.25)

import java.util.Arrays;
import java.util.Random;

public class GradeSeInBb{
    
    public static void sSort(double[] v){
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
            double t=v[minIndex];
            v[minIndex]=v[i];
            v[i]=t;
        }
    }
    


   
    public static void in_Sort(double[] v){
        int tam=v.length;
        for(int i=0;i<tam;i++){ //instrução única de loop
            double k=v[i];
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
    }


    public static void bbsort (double[] v){
        //int tam=v.length;
        for(int i=0;i<v.length-1;i++){
            for(int j=0;j<v.length-1-i;j++){
                if(v[j]>v[j+1]){
                   // v[i]=v[j+1];
                    double t=v[j];
                    v[j]=v[j+1];
                    v[j+1]=t;
                }
            }
        }
    }

    public static long rtime(double[] v, String s){
        if(s.equals("s")){
            long start=System.nanoTime();
            sSort(v);
            long end=System.nanoTime();
            long d=end-start;
            System.out.println("\n Selection - Tempo de execução: "+d+" ns.");
            return d;
        }

        
        else if(s.equals("i")){
            long start=System.nanoTime();
            in_Sort(v);
            long end=System.nanoTime();
            long d=end-start;
            System.out.println("\nInsertion - Tempo de execução: "+d+" ns.");
            return d;
        }
        else if(s.equals("b")){
            long start=System.nanoTime();
            bbsort(v);
            long end=System.nanoTime();
            long d=end-start;
            System.out.println("\nBubble - Tempo de execução: "+d+" ns.");
            return d;
            
        }
        else{
            System.err.println("Digite o caractere correspondente.");
            return 1;
        }
        
    }


    public static void main(String[] args){
        double[] vNoOrd={9.2, 0.6, 1.1, 6.6, 1.6, 3.0, 3.3, 9.8, 9.9, 9.0, 2.0, 7.3, 6.2, 9.2, 1.2, 7.0, 3.6, 3.0, 0.7, 7.3};
        double[] vOrd={0.6, 0.7, 1.1, 1.2, 1.6, 2.0, 3.0, 3.0, 3.3, 3.6, 6.2, 6.6, 7.0, 7.3, 7.3, 9.0, 9.2, 9.2, 9.8, 9.9};

        //ordenação dos vetores acima
        //rtime() vai mostrar que insertion é o mais efiiciente (sinalizado com '*')
        rtime(vNoOrd, "s"); 
        rtime(vNoOrd, "i"); //* 
        rtime(vNoOrd, "b");

        rtime(vOrd, "s");
        rtime(vOrd, "i"); //* 
        rtime(vOrd, "b");
    }

}