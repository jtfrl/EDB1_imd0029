import java.util.Arrays;

public class vectSearchMaria{
    public static int buscaBinaria(String[] vector, String k){
        int inicio=0;
        int fim=vector.length-1;
        int pas=1;
            while(inicio<=fim){
                int meio=(inicio+fim)/2;
            if(vector[meio]==k){
                    return meio;
                }else if(vector[meio].compareTo(k)<0){
                    inicio=meio+1;
                }else{
                    fim=meio-1;
                }
            }
        return -1;

    }

    public static void main(String[] args) {
     String[] nomes = {"Jose", "Pedro", "Maria", "Wilma",
        "Ana", "Letícia", "Ester"}; 
         Arrays.sort(nomes); 
         //ordenando vetor nomes

        int pos=buscaBinaria(nomes, "Maria");

        if(pos!=-1){
            System.out.println("A palavra 'Maria' foi encontrada no vetor");
        }

    }
}