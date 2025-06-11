 import java.util.Random;
 import java.util.Arrays;

 public class rnum{
    public static int[] RandomNumbers(){
            int[] num=new int[12];
            // objeto do tipo 'Random'
            Random rand=new Random();

            for(int i=0;i<num.length;i++){
                num[i]=rand.nextInt(13);
                //20 numeros aleatórios
            }

            return num; 

        }

        public static void processArray(int[] arr){
            //int[] arr= new int[20];
            //teste de print de array
            
            System.out.println("\n\n12 números: " +
             Arrays.toString(Arrays.copyOfRange(arr, 0, 12)));
            
        }

         public static void in_Sort(int[] v){
        int tam=v.length;
        for(int i=0;i<tam;i++){ //instrução única de loop
            int k=v[i];
            int j=i-1;
            /*
             * o laço a seguir só executa com 
             * condições específicas
             */
            while(j>=0 && v[j]<k){ //permite percorrer todo o array
                v[j+1]=v[j]; 
                j--;
            }
            v[j+1]=k;
        }
        //imprimir(v);
    }

        
        public static void main(String[] args){
            int[] arr= RandomNumbers();
            processArray(arr);
            in_Sort(arr);
            System.out.println(Arrays.toString(arr));
        }
}

/*
 * colocar em programa
 * 
 * public class MainProgram {
    public static void main(String[] args) {
        int[] randomNumbers = rnum.RandomNumbers();
        rnum.processArray(randomNumbers);
    }
}
 */