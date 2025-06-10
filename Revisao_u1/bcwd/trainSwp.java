//beecrowd 1162
import java.util.Arrays;
import java.util.Scanner;
/*
  * 
INPUT

N - NUMERO DE CASOS
L - Nº DO TAMANHO DO TREM, QUE VAI DE 
ZERO A 50
V - VETOR EM UMA UNICA LINHA
18 6 7 19

::> EX
3
1 3 2
4
4 3 2 1


OUTPUT
Optimal train swapping takes 1 swaps.
Optimal train swapping takes 6 swaps.


 */

public class trainSwp{
    //definir menor número de trocas possível
    public static int bbsort(int[] v){
        int pas=0;
        for(int i=0;i<v.length;i++){
            for(int j=0;j<v.length-1-i;j++){
                if(v[j]>v[j+1]){
                    int t=v[j];
                    v[j]=v[j+1];
                    v[j+1]=t;
                    pas++;
                }
            }
        }
        return pas;
    }


    public static void main(String[] args){
    //unico scanner
    Scanner s=new Scanner(System.in);
    
    System.out.println("Type case number: ");
    int n=s.nextInt();
    s.nextLine();

        for (int i=0; i<n;i++){
            System.out.println("Type train length: ");   
            int l=s.nextInt();  
            s.nextLine();
            
            if(l>0&&l<=50){

                System.out.println("Provide all carriage numbers"+ 
                "(only one line for it): ");   
                //Scanner s3=new Scanner(System.in);
                String inp=s.nextLine(); //le toda a linha

                String[] data=inp.split(" "); //remove espaços
                int v[]=new int[data.length];

                for(int j=0;j<data.length;j++){
                    v[j]=Integer.parseInt(data[j]); //coloca todos em vetor inteiro
                }
              
                System.out.println("Optimal train swapping takes "+bbsort(v)+" swaps");
            }else{
                System.out.println("Provide a valid quantity or a number for train length greater than zero");
            }

        }

        s.close(); //evita erros de exceção no main
    }
    
}