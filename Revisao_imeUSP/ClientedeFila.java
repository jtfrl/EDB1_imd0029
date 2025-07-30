//Escreva um exemplo de cliente para fila análogo ao que usamos para pilha

import java.util.Scanner;

public class ClientedeFila{
	public static void main(String[] args) {
	    Queue<String> fila;
	    
	    fila=new Queue<String>();
	    Scanner s=new Scanner(System.in);
	    
	    //impl padrao de SEDGEWICK et al.
	    //while(!Std.In.isEmpty())
	    
	    while(s.hasNextLine()){ //enquanto houver leitura no scanner
	       String str=s.nextLine();
	       
	       if(str==null||str.isEmpty()) break;
	       
	       if(!str.equals("-")){
	           fila.add(str); //adicionar em fila com 'add/()'
	       }else if(!fila.isEmpty()){
	           System.out.print(fila.remove()+" "); //prinln pode criar duas linhas
	       }
	    }
	    
	    System.out.println("("+fila.size()+" left on stack");
	    
	    
	    s.close();
	    
	}
}
