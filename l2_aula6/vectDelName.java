import java.util.Arrays;

public class vectDelName{
    public static int buscaBinaria(String[] vector, String k){
        int inicio=0;
        int fim=vector.length-1;
        int pas=1;
            while(inicio<=fim){
                int meio=(inicio+fim)/2;
                System.out.println("Busca #"+(pas++)+": "+vector[meio]);

            int compLet=0;
            int compaRes=0;
            int minTam=Math.min(vector[meio].length(), k.length());

            while(compLet<minTam && vector[meio].charAt(compLet)==k.charAt(compLet)){
                compLet++;
            }//conta a comparação de letras antes de seguir

            if(compLet==minTam){
                compaRes=vector[meio].length()-k.length();
            }else{
                compaRes=vector[meio].charAt(compLet)-k.charAt(compLet);
            }//quantas letras são comparadas até encontrar a diferença

            System.out.println("Comparou "+(compLet+1)+" letra(s).");

            if(compaRes==0){
                    System.out.println("A palavra '"+k+"' foi encontrada no vetor");
                    return meio;
                }else if(compaRes<0){
                    inicio=meio+1;
                }else{
                    fim=meio-1;
                }
            }

        System.out.println("A palavra '"+k+"' não foi encontrada no vetor");
        return -1;

    }

    public static void main(String[] args) {
     String[] nomes = {"Jose", "Pedro", "Maria", "Wilma",
        "Ana", "Letícia", "Ester","Carlos","Conceição","Eva","João"}; 
         Arrays.sort(nomes); 
         //ordenando vetor nomes

       buscaBinaria(nomes, "Eva");

    }
}