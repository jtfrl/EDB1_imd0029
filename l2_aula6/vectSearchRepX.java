public class vectSearchRepX{
    public static int buscaBinaria(int[] vector, int k){
        int inicio=0;
        int fim=vector.length-1;
        int r=-1;
            while(inicio<=fim){
                int meio=(inicio+fim)/2;
                if(vector[meio]>k){
                    r=meio-1;
                    fim=meio-1;
                }else{
                    inicio=meio+1;
                }
            }
        return r;
    }
    

    public static void main(String[] args) {
     int[] v={1,5,9,10,10,10,10,10,10,10,11,12,20,410,419,464,883,1000}; 

     int pos=buscaBinaria(v, 10);
     System.out.println("O valor 10 está em "+pos);
     System.out.println("O valor da posição é a maior entre todos iguais a 10 no vetor.");
        

    }
}