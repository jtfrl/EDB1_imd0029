//q.4 - Revisão (10.6.25)

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class seqvsbin{
    
 	 public static int seqSearch(int[] vetor, int proc){
            for (int i=0; i<vetor.length; i++){
                if(vetor[i]==proc){
					int f=vetor[i];
                    return f; //valor encontrado
                }
            } 
			return -1;
        }
	 

			
	public static int buscaBinaria(int[] vetor, int chave) {
	int inicio = 0;
	int fim = vetor.length - 1; //inicio e fim percorrem nos indices 
		while (inicio <= fim) {
			int meio = (inicio + fim) / 2; //divisão com resultado inteiro 
					if (vetor[meio] == chave) {
					return meio;
					} else if (vetor[meio] < chave) {
					inicio = meio + 1; //avança no array
					} else {
					fim = meio - 1;
					}
				}
		return -1;
		}

	//organiza o vetor aleatório
	public static void bbsort(int[] v){
        //int tam=v.length;
        for(int i=0;i<v.length-1;i++){
            for(int j=0;j<v.length-1-i;j++){
                if(v[j]>v[j+1]){
                   // v[i]=v[j+1];
                    int t=v[j];
                    v[j]=v[j+1];
                    v[j+1]=t;
                }
            }
        }
    }


	public static int[] RandomNumbers(){
        //int[] num=new int[100];
        int[] num=new int[1000];
        //int[] num3=new int[10000];

        //objeto do tipo 'Random'
        Random rand=new Random();

        for(int j=0;j<num.length;j++){
             num[j]=rand.nextInt(1001);
        }
		return num;
    
    }

	//imprimindo array
	public static void processArray(int[] arr){
		System.out.println("\n\n 1000 números: "+
		Arrays.toString(Arrays.copyOfRange(arr, 0, 1000)));
	}

	public static long rtime(int[] v, String s, int proc){
		if(s.equals("s")){
			long start=System.nanoTime();
			seqSearch(v, proc);
			long end=System.nanoTime();
			long d=end-start;
			System.out.println("\nBusca Seq. - Tempo de execução: "+d+" ns.");
			return d;
		}else if(s.equals("b")){
			long start=System.nanoTime();
			buscaBinaria(v, proc);
			long end=System.nanoTime();
			long d=end-start;
			System.out.println("\nBusca Bin. - Tempo de execução: "+d+" ns.");
			return d;
		}else{
			System.err.println("Você digitou algum termo inválido");
			return -1;
		}

	}
            
            
	public static void main(String[] args) {
		int[] arr=RandomNumbers();
		bbsort(arr);
		System.out.println("\n Array ordenado: ");
		processArray(arr);

		System.out.println("\n Informe o número desejado para as buscas: ");
		System.out.println("\n (Um número de início, meio e não existente em "+
		"'arr': )" );

		Scanner s=new Scanner(System.in);
		String inLine=s.nextLine();
		String[] numAtArr=inLine.split(" ");


		if(numAtArr.length!=3){
			System.out.println("Insira os três números correspondentes. ");
			return;
		}

		try{
			int[] numUser=new int[3]; 
				for(int i=0;i<numAtArr.length;i++){
					numUser[i]=Integer.parseInt(numAtArr[i]);
				}//novo array que vai ser de inteiros


				//pesq no inicio do array
				rtime(arr, "s", numUser[0]);
				rtime(arr, "b", numUser[0]);

				//pesq no meio do array
				rtime(arr, "s", numUser[1]);
				rtime(arr, "b", numUser[1]);

				//pesq no array por valor que não existe
				rtime(arr, "s", numUser[2]);
				rtime(arr, "b", numUser[2]);

				//como o range é de 0 a 1000, valores maiores ou menores
				//que o limite não vão constar
			}
			catch(NumberFormatException e){
				System.out.println("\n Insira apenas números válidos");
			}finally{
				s.close(); //fecha o scanner
			}

			//binária - mais eficiente em busca do meio e para não existente
			//seq. - mais eficiente em busca no início	
		}
}


