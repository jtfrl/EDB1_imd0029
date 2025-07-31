/* EXERCÍCIOS 2
Escreva uma implementação QueueRA (Ressizing Array) de fila
usando um vetor circular com redimensionamento. 
Faça isso sem olhar o código ResizingArrayQueue.java 
do livro.
*/

import java.util.Scanner;
import java.util.Queue;

public class QueueRA<Int>{ //array com redimensionamento
    
    private int[] v;
    private int N;
    private int front;
    private int rear;
    
    public QueueRA(){
        v=(Int[]) new Object[2]; //esse vetor deve ser circular
        //esse 2 seria tamanho?
        N=0;
        front=0;
        rear=0;
    }

    
    public boolean isEmpty(){
        return N==0;
    }
    
    public void add(int a){
        if(N==v.lenght){
            resize(2*v.lenght);
        }else{
            //v[N++]=a;
            v[rear]=a;
            rear++;
            N++;
        }
    }
    
    
    public int remove(){
        if(isEmpty()) throw new RuntimeException("Fila vazia");

        int item=v[front];
        v[front]=0; //limpa o item
        first++; //permite a volta no comprimento 
        N--;

        int valorRmv=v[--N];
        if(N>0 && N==v.lenght/4) resize(v.lenght/2);
        
        return item;
    }
    
    private void resize(int max){ 
        //'max' pode assumir o dobro do vetor v ou  
        // a metade do seu tamanho
        int[] vecTemp=new int[max]; 
        
        //vecTemp=(Int[]) new Object[max];
        for(int i=0;i<N;i++){
            vecTemp[i]=v[(front+i)%v.length];
        }
        
        v=vecTemp;
    }

    public int Front(){
        if(v.length==0){
            System.out.println("Vetor sem elementos");
             return -1;
        }else{
            return v[v.lenght-1];
        }

    }

    public int Rear(){
        if(v.length==0){
            System.out.println("Vetor sem elementos");
             return -1;
        }else{
            return v[0];
        }
    }
    
}
