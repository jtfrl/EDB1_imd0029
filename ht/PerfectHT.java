// (SW 3.4.4)  Escreva um programa para encontrar valores de  a  e  M ,  
// com M o menor possível, tais que a função de hashing  (a * k) % M , 
// que transforma a k-ésima letra do alfabeto em um valor hash, não
// produza colisões quando aplicada às chaves  S E A R C H X M P L .  
// (Isso é conhecido como função de hashing perfeita.)


import java.util.Scanner;

class No{
    String data;
    No prox;
    
    No(String d){
        this.data=d;
        this.prox=null;
    }

    /*
    @Override

    public String toString(){
        return data;
    }
         */
}

class Th{
    private No[] table;
    private int size;
    
    public Th(int cap){
        table= new No[cap];
        size=0;
    }
    
    private	int hash(String k){
	    int h=0;

        //k quando assume x, p. ex, vai a 88 (pos no ascii)
	    for(int i=0; i<k.length(); i++){
            /* ### OUTRAS VERSÕES DE HASH ### */
	      // h= (31*h+k.charAt(i))%47; 
	      //h= (31*k.charAt(i))%47; 
            h= (31*k.charAt(i))%50; //aproveita toda a extensão da tabela
        }
	       
	   return h;
	}
	
	public void insert(String n){
        int index=hash(n); //cada índice recebe um hash
        No novo_no= new No(n);

        if(table[index]==null){
            table[index]=novo_no;
        }else {
            novo_no.prox = table[index];
            table[index] = novo_no;
        }
        size++;
    }
    
    public void showTh(/*No */ ){
       // index=hash()]
       System.out.println("\n");
       System.out.println("Index \tMemory Address \t    Letter ");
       System.out.println();
        for(int i=0; i<table.length;i++){
            if(table[i]!=null) System.out.println(i+"\t"+table[i]+"\t\t"+table[i].data);
        }
        System.out.println();
    }

    public int tam(){
        return size;
    }
}

public class PerfectHT{
	public static void main(String[] args) {
		System.out.println("HASHING DATA");
		Scanner s=new Scanner(System.in);
    
    	System.out.println("Informe o texto para o hash: ");
    	String n=s.nextLine();
    
    	Th ht = new Th(50);

       // posições em memória ficam se alternando, conforme a operação de hash e 
       // o valor de M -- os endereços permanecem os mesmos, mas alocando outros valores
            for(int i=0; i<n.length(); i++){
                char c=n.charAt(i);
                ht.insert(String.valueOf(c));
            }
    

        ht.showTh();

        s.close();
    	
	}
}
