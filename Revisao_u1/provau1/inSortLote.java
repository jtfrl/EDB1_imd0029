import java.util.Arrays;
import java.util.Scanner;

public class inSortS{
    public static void in_Sort(String[] vetor){
        int tam=vetor.length;
        for(int i=1;i<tam;i++){ //análise a partir do 2o. índice
            String k=vetor[i];
            int j=i-1;
            while(j>=0 && vetor[j].compareTo(k)>0){
                vetor[j+1]=vetor[j];
                j--;
            }
            vetor[j+1]=k; //troca para continuar laço
        }
    }


    public static void main(String... args){
        String[] nomes=new String[50];

        System.out.println("\n Informe os valores do array (única linha, separados por espaço)" +
        "com todos os nomes (até 50): ");

        Scanner s=new Scanner(System.in);
		String inLine=s.nextLine();
		String[] nomesemlote=inLine.split(" ");

        in_Sort(nomesemlote); 
        System.out.println(Arrays.toString(nomesemlote));
    }
}