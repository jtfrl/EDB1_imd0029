import java.util.Arrays;
import java.util.Scanner;

public class binSUserNumPos{
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

    public static void bbsort(int[] v){
        int tam=v.length;
        for(int i=0; i<v.length-1;i++){
            for(int j=0;j<v.length-1-i;j++){
                if(v[j]>v[j+1]){
                    int t=v[j];
                    v[j]=v[j+1];
                    v[j+1]=t;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] v=new int[10];

        System.out.println("\n Informe os valores do array (única linha, separados por espaço): ");

        Scanner s=new Scanner(System.in);
		String inLine=s.nextLine();
		String[] num=inLine.split(" ");

        for(int i=0; i<v.length;i++){
            v[i]=Integer.parseInt(num[i]);
        }

        bbsort(v);

        System.out.println("\n Informe o valor para ser buscado: ");
        int dado=s.nextInt();

        if(buscaBinaria(v, dado)!=-1){
            System.out.println("Número encontrado! Posição: "+ buscaBinaria(v, dado));
        }else{
            System.out.println("Número não encontrado no vetor informado.");
        }







    }
}