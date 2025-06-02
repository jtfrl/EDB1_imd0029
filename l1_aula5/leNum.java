import java.util.Scanner; //importação para ler números

public class leNum{
    public static void main(String[] args) {
        int[] v={1,8,9,17,26};

        Scanner s= new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n=s.nextInt();

        Boolean c=false;

        for(int i=0;i<v.length;i++){
            if(v[i]==n){
                c=true;
                break; //sai assim que encontra
            }
        }

        if(c) {
            System.out.println("O número "+n+" consta no array!");

        }else{
            System.out.println("O número "+n+" não consta no array!");
        }

        s.close(); //fecha o scanner
    }
}
