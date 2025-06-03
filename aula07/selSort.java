import java.util.Arrays; //util para mostrar o array

public class selSort{
    public static int[] selsort(int[] vetor){
    
        int min=vetor[0];  
        int tam=vetor.length;
        int[] arr= new int[tam]; 
        for (int i=1;i<tam-1;i++){
            int minIndex=i;
            
            for (int j=i+1;j<tam;j++){
                if(vetor[j]<vetor[minIndex]){ //esse sinal < se mudado deixa
                    //descrescente a partir do segundo elemento
                    minIndex=j;
                }
            }

            //swapping
            int t=vetor[minIndex];
            vetor[minIndex]=vetor[i];
            vetor[i]=t;

        }
        return vetor;
    }

        public static void main(String[] args){
            int[] v={1,18,13,2,5,21,3};
            System.out.println("Vetor v ordenado");
            System.out.println(Arrays.toString(selsort(v)));
        }
        
}
