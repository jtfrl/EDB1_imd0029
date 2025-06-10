 import java.util.Random;
 import java.util.Arrays;

 public class rnum{
    public static int[] RandomNumbers(){
            int[] num=new int[35];
            // objeto do tipo 'Random'
            Random rand=new Random();

            for(int i=0;i<num.length;i++){
                num[i]=rand.nextInt(36);
                //20 numeros aleatórios
            }

            return num; 

        }

        public static void processArray(int[] arr){
            //int[] arr= new int[20];
            //teste de print de array
            
            System.out.println("\n\n35  i números: " +
             Arrays.toString(Arrays.copyOfRange(arr, 0, 35)));
            
        }

        
        public static void main(String[] args){
            int[] arr= RandomNumbers();
            processArray(arr);
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