 public static int[] RandomNumbers(){
        int[] num=new int[1000];
        //objeto do tipo 'Random'
        Random rand=new Random();

        for(int i=0;i<num.length;i++){
            num[i]=rand.nextInt(1001);
            //1000 numeros aleatórios
        }

         return num; 

    }

    public static void processArray(int[] arr){
        //int[] arr= new int[1000];
        //teste de print de array
        /*
         System.out.println("\n\n1000 números: " + 
         Arrays.toString(Arrays.copyOfRange(arr, 0, 1000)));
         */
    }