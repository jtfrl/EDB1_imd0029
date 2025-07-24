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
}

class Th{
    private No[] table;
    private int size;
    
    public Th(int cap){
        table= new No[cap];
        size=0;
    }
    
    
    private	long hash(String k){
	    int h=0;
	    for(int i=0; i<k.length; i++)
	       h= (31*charAt(i))%59;
	       
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
       // index=hash()
        for(int i=0; i<table.length;i++){
            if(table[i]!=null) System.out.println("Index ");
        }
    }



}


public class PerfectHT{
	public static void main(String[] args) {
		System.out.println("HASHING DATA");
		Scanner s=new Scanner(System.in);
    
    	
    	//dado do No aqui
    	System.out.println("Informe o texto para o hash: ");
    	String n=s.nextLine();
    	
    	//impl: laço para tomar cada letra  
    	for(int i=0; i<n.length(); i++){
    	    
    	}

    	
    	
	}
}
