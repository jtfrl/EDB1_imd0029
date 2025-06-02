import java.util.Arrays;

public class vectStepbyStep{
    public static int buscaBinaria(int[] vector, int k){
        int inicio=0;
        int fim=vector.length-1;
        int pas=1;
            while(inicio<=fim){
                int meio=(inicio+fim)/2;
  System.out.println("Passo " + (pas++) + ": inicio= " + inicio + ", fim= " + 
  fim + ", meio=" + meio + " (vector[meio]=" + vector[meio] + ")");
 //pas apenas incrementa na próxima execução
    if(vector[meio]==k){
                    System.out.println("Encontrado na posição "+ meio);
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
     int[] v={1,5,9,35,405,410,419,464,883,1000, 200, 864, 400, 805, 44, 14, 6,
         20, 21, 22}; 
         Arrays.sort(v); //ordenando vetor v

        System.out.println("Busca do valor 35 no array v: ");
        int pos=buscaBinaria(v, 35);
        if (pos != -1) {
            System.out.println("O valor 35 está na posição " + pos);
        } else {
            System.out.println("O valor não foi encontrado.");
        }      

    }
}