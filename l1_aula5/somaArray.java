import java.util.Scanner;

public class somaArray{
    public static void main(String[] args) {
        int[] q={7,8,15,23,38,61,99,160,259,419};
        
        
        Scanner s= new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n=s.nextInt();
        
        int soma=0;
        
        for(int i=0;i<q.length;i++){
           if(q[i]>n){
               soma+=q[i];
           }
        }
        
        System.out.println("Soma dos valores maiores que "+n+" no array: "+soma);
    
    s.close();
    }
}
