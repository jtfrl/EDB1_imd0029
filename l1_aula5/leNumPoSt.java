import java.util.Scanner;

public class leNumPoSt{
    public static void main(String[] args) {
        int[] t={5,7,12,5,7,12,19,31};

        Scanner s= new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n=s.nextInt();
        int pos=0;
        Boolean c=false;

        for(int i=0;i<t.length;i++){
            if(t[i]==n){
                pos=i;
                c=true;
                break;
            }
        }

        if(c){
        System.out.println("O número "+n+" está na posição "+pos+" (menor posição entre todas as ocorrências).");
        }
        else{
        System.out.println(-1);
        }
        
    s.close();
    }
}
