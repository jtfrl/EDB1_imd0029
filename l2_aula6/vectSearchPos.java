import java.util.Arrays;
import java.util.Scanner;

public class vectSearchPos{
    public static int buscaBinaria(int[] vector, int k){
        int inicio=0;
        int fim=vector.length-1;
        int pas=1;
            while(inicio<=fim){
                int meio=(inicio+fim)/2;
            if(vector[meio]==k){
                    System.out.println("Encontrado na posição "+ meio);
                    return meio;
                }else if(vector[meio]<k){
                    inicio=meio+1;
                }else{
                    fim=meio-1;
                }
            }
        System.out.println("Valor não encontrado.");
        return -1;

    }

    public static void main(String[] args) {
     int[] v={1,5,9,35,405,410,419,464,883,1000, 200, 864, 400, 805, 44, 14, 6,
         20, 21, 22}; 
         Arrays.sort(v); 
         //ordenando vetor v
         //v = {1, 5, 6, 9, 14, 20, 21, 22, 35, 44, 200, 400, 405, 410, 419, 464, 805, 864, 883, 1000};
         
        Scanner s= new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n=s.nextInt();

        int pos=buscaBinaria(v, n);
    }
}