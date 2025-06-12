//q. 3 - Revisão (10.6.25)

import java.util.Arrays;
import java.util.Random;

public class XseInBb{

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
        //imprimir(v);
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
    }

    public static int[] RandomNumbers(int tam){
        int[] num=new int[100];
        int[] num2=new int[1000];
        int[] num3=new int[10000];

        //objeto do tipo 'Random'
        Random rand=new Random();

        for(int i=0;i<num.length;i++){
            num[i]=rand.nextInt(101);
            //1000 numeros aleatórios
            num2[i]=rand.nextInt(1001);
            num3[i]=rand.nextInt(10001);
        }
        if(tam==1) return num; 
        if(tam==2) return num2;
        if(tam==3) return num3;
        else{
            System.out.println("Número inválido para mostrar vetor");
            int[] r={1};
            return r;
        }

    }


     public static void processArray(int[] arr, int n){
        if(n==1){
         System.out.println("\n\n100 números: " + 
         Arrays.toString(Arrays.copyOfRange(arr, 0, 100)));
        }
        if(n==2){
            System.out.println("\n\n1000 números: " + 
            Arrays.toString(Arrays.copyOfRange(arr, 0, 1000)));
        }if(n==3){
            System.out.println("\n\n10000 números: " + 
            Arrays.toString(Arrays.copyOfRange(arr, 0, 10000)));
        }else{
            System.err.println("Número inválido");
        }

    }

    /*
        long start=System.nanoTime();
        f(v);
        long end=System.nanoTime();
        long d=end-start;
        return d;
    }

    */

    public static long rtime(int[] v, String s){
        if(s=="s"){
            long start=System.nanoTime();
            sSort(v);
            long end=System.nanoTime();
            long d=end-start;
            System.out.println("\nSelection - Tempo de execução: "+d+" ns.");
            return d;
        }
        else if(s=="i"){
            long start=System.nanoTime();
            in_Sort(v);
            long end=System.nanoTime();
            long d=end-start;
            System.out.println("\nInsertion - Tempo de execução: "+d+" ns.");
            return d;
        }
        else if(s=="b"){
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
        //tam. = 100
        int ar1[]=RandomNumbers(1);
        int ar1c[]=Arrays.copyOf(ar1, ar1.length);
        int ar1cc[]=Arrays.copyOf(ar1, ar1.length);

        int ar2[]=RandomNumbers(2);
        int ar2c[]=Arrays.copyOf(ar2, ar2.length);
        int ar2cc[]=Arrays.copyOf(ar2, ar2.length);

        int ar3[]=RandomNumbers(3);
        int ar3c[]=Arrays.copyOf(ar3, ar3.length);
        int ar3cc[]=Arrays.copyOf(ar3, ar3.length);

        /*
        bbsort(ar1);
        sSort(ar1c);
        in_Sort(ar1cc);
        */

        rtime(ar1, "s");
        rtime(ar1c, "i");
        rtime(ar1cc, "b");
        System.out.println("\n");
        rtime(ar2, "s");
        rtime(ar2c, "i");
        rtime(ar2cc, "b");
        System.out.println("\n");
        rtime(ar3, "s");
        rtime(ar3c, "i");
        rtime(ar3cc, "b");
        System.out.println("\n");

        //bbsort(arr);
    }



}