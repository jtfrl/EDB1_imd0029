public class vectCompCount{
    public static int buscaBinaria(int[] vector, int k){
        int inicio=0;
        int fim=vector.length-1;
        int count=0;
          while(inicio<=fim){
            count++;//contagem a cada interação
                int meio=(inicio+fim)/2;
                //System.out.println("Busca #" + count + ": inicio=" + inicio + ", fim=" + fim + ", meio=" + meio + ", vector[meio]=" + vector[meio]);
                //linha acima de suporte para mostrar o progresso da busca
                if(vector[meio]==k){
                    System.out.println("Valor encontrado. Buscas feitas: "+count);
                    return meio;
                }else if(vector[meio]<k){
                    inicio=meio+1;
                }else{
                    fim=meio-1;
                }
            }

        System.out.println("Valor não encontrado. Buscas feitas: "+count);
        return -1;
    }

    

    public static void main(String[] args) {
     int[] v={1,5,9,10,10,10,10,10,10,10,11,12,20,410,
     419,464,464,464,883,1000,1100,1200,1300,1309,1320,
     2629,4159,4160,4161,4162};
     buscaBinaria(v, 2629);
    }

}