public class vectMenorVal{
    public static int buscaBinaria(int[] vector, int k){
        int inicio=0;
        int fim=vector.length-1;
        int r=-1;
            while(inicio<=fim){
                int meio=(inicio+fim)/2;
                if(vector[meio]>k){
                    r=meio;
                    fim=meio-1; //ajuda a finalizar o laço
                }else{
                    inicio=meio+1;
                }
            }
        return r;
    }
    

    public static void main(String[] args) {
     int[] v={1,5,9,10,11,12,17,18,45,50,410,419,464,883,1000}; 

     int pos=buscaBinaria(v, 50);
     System.out.println("O número maior que 50 no vetor é "+v[pos]);
     //acima colocar variável
     System.out.println("O valor é o menor entre todos os maiores que 50 no vetor.");
        

    }
}