import java.util.Scanner;

public class vectMan{
    public static int buscaBinaria(int[] vector, int k){
        int inicio=0;
        int fim=vector.length-1;
            while(inicio<=fim){
                int meio=(inicio+fim)/2;
                if(vector[meio]==k){
                    return meio;
                }else if(vector[meio]<k){
                    inicio=meio+1;
                }else{
                    fim=meio-1;
                }
            }
        return -1;
    }

    public static void main(String[] args) {
     int[] v={1,5,9,45,405,410,419,464,883,1000}; 

    Scanner s = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int n = s.nextInt(); //leitura de número

        if(buscaBinaria(v,n)!=-1){
            System.out.println("O número "+n+" está no vetor.");
        }else{
            System.out.println("O número "+n+" não está no vetor.");
        }

    }
}