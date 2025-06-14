//q. 7 - Revisão (10.6.25)

import java.util.Random;


public class fastSelS{
    public static int[] sSort(int[] v){
        int tam=v.length;
        for(int i=0;i<tam;i++){
            int min=i;
            for(int j=i+1;j<tam;j++){
                if(v[min]>v[j]){
                    min=j;
                }
            }
               int t=v[min];
            v[min]=v[i];
            v[i]=t; 
        }
        return v;

       
    }

    public static void main(String[] args){
        int tam=1000; //quantidade de inteiros por segundo
        int[] data=new int[0]; 

        Random r=new Random();

        //simulando vinda de 1000 inteiros por segundo
        while(true){
            int[] ntam=new int [tam];
            for (int i=0; i<tam;i++){
                ntam[i]=r.nextInt(10000); //inteiros entre 1 e 10000
            }


            sSort(ntam);

            //delay de 1 seg.
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            //vai gerando novas sequencias
            //conforme vão se passando inputs do r.
            System.out.println("Primeiros 10 elementos: ");
            for(int k=0;k<Math.min(10, ntam.length);k++){
                System.out.println(ntam[k]+" ");
            }
            System.out.println();


        }

    }
}