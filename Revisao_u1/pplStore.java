package Revisao_u1;

//q. 6 (parte 2) - Revisão em 10.6.25

//Esse arquivo, junto a parte 1, precisa estar em uma única
//pasta para funcionar


//executar com 

/*
 * javac -cp . <diretorio>/Store.java <diretorio>/pplStore.java
 * java -cp . <diretorio>.pplStore
 */



import java.util.Scanner;


public class pplStore{
 
      public static void main(String[] args) {
        Store myStore = new Store();
        Scanner s=new Scanner(System.in);
      

        for (int i=0;i<100;i++){
          System.out.println("Informe o nome do produto "+(i+1)+": ");
          String prodName=s.nextLine();
        
         // myStore.addProduct(dataProd, i);

         System.out.println("Informe o preço do produto "+(i+1)+": ");
         double prodPreco=s.nextDouble();
         s.nextLine(); //consome a próxima linha

         myStore.addProduct(prodName, prodPreco);

        }

      myStore.sortProd();
      myStore.displayProd();
    
    }
   
}