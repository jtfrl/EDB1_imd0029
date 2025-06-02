public class vectSearchRep{
    public static int buscaBinaria(int[] vector, int k){
        int inicio=0;
        int fim=vector.length-1;
        int r=-1;
            while(inicio<=fim){
                int meio=(inicio+fim)/2;
                if(vector[meio]==k){
                    r=meio;
                    fim=meio-1;
                }else if(vector[meio]<k){
                    inicio=meio+1;
                }else{
                    fim=meio-1;
                }
            }
        return r;
    }
    

    public static void main(String[] args) {
     int[] v={1,5,9,10,11,12,20,20,20,410,419,464,883,1000}; 

     int pos=buscaBinaria(v, 20);
     System.out.println("O valor 20 está em "+pos);
     System.out.println("O valor da posição é o menor entre todos iguais a 20 no vetor.");
        

    }
}