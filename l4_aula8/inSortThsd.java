//q. 7 - lista 4
import java.util.Arrays;
import java.util.Random;

public class inSortThsd{
     public static int in_Sort(int[] vetor){
        int tam=vetor.length;
        int pas=0;
        for(int i=1;i<tam;i++){ //análise a partir do 2o. índice
            int k=vetor[i];
            int j=i-1;
            pas++;
            while(j>=0 && vetor[j]>k){
                pas+=2;
                vetor[j+1]=vetor[j];
                j--;
                pas++;
            }
            vetor[j+1]=k;
             //troca para continuar laço
             pas++;
        }
        return pas;
    }

    public static int[] sSort(int[] vetor){
        int tam=vetor.length;
        int pas=1;
        for(int i=0;i<tam-1;i++){
            int minIndex=i;
            pas++;
            if(pas==tam){
                System.out.println("\nPassos necessários (ssort): "+pas);
            }
            for(int j=i+1;j<tam;j++){
                pas++;
                if(vetor[j]<vetor[j+1]){
                    minIndex=j;
                    pas++;
                }
            }
            if(minIndex!=1){
                int t=vetor[minIndex];
                vetor[minIndex]=vetor[i];
                vetor[i]=t;
                pas+=3;
            }
        }
        return pas; //função vai indicar a quantidade de espaços
    }

    public static int[] RandomNumbers(){
        int[] num=new int[1000];
        //objeto do tipo 'Random'
        Random rand=new Random();

        for(int i=0;i<num.length;i++){
            num[i]=rand.nextInt(1001);
            //1000 numeros aleatórios
        }

         return num; 

    }

    public static void processArray(int[] arr){
        //int[] arr= new int[1000];
        //teste de print de array
         System.out.println("1000 números: " + 
         Arrays.toString(Arrays.copyOfRange(arr, 0, 1000)));

    }

    public static void main(String[] args){
        int[] arr1=RandomNumbers();
        int[] arr2=Arrays.copyOf(arr1, arr1.length);
        //ordenação de vetores:

        System.out.println("Array original");
        processArray(arr1);


        //comparação
        
        System.out.println("\n Seleção: ");
        int ss=sSort(arr1);
        processArray(arr1);
        System.out.println("\n Quantidade de passos: "+ss);

        System.out.print("Inserção");
        int is=in_Sort(arr2);
        processArray(arr2);
        System.out.println("\n Quantidade de passos: "+is);

    }

}