 import java.util.Random;
 import java.util.Arrays;

 public class rnum{
    public static double[] RandomNumbers(){
            double[] num=new double[20];
            // objeto do tipo 'Random'
            Random rand=new Random();

            for(int i=0;i<num.length;i++){
                //gera de zero a 100, mas divide por 10
                num[i]=rand.nextInt(101)/10.0;
                //20 numeros aleatórios
               // num[i]=rand.nextInt(21);

            }

            return num; 

        }

        public static void processArray(double[] arr){
            //int[] arr= new int[20];
            //teste de print de array
            
            System.out.println("\n\n20 números: " +
             Arrays.toString(Arrays.copyOfRange(arr, 0, 20)));
            System.out.println();
        }

         public static void in_Sort(double[] v){
        int tam=v.length;
        for(int i=0;i<tam;i++){ //instrução única de loop
            double k=v[i];
            int j=i-1;
            /*
             * o laço a seguir só executa com 
             * condições específicas
             */
            while(j>=0 && v[j]>k){ //permite percorrer todo o array
                v[j+1]=v[j]; 
                j--;
            }
            v[j+1]=k;
        }
        //imprimir(v);
    }

        
        public static void main(String[] args){
            double[] arr= RandomNumbers();
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