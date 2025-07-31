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
    
    public QueueRA(){
        v=(Int[]) new Object[2]; //esse vetor deve ser circular
        N=0;
    }

    
    public boolean isEmpty(){
        return N==0;
    }
    
    public void add(Int a){
        if(N==v.lenght){
            resize(2*v.lenght);
        }else{
            v[N++]=a;
        }
    }
    
    
    public int remove(){
        int valorRmv=v[--N];
        if(N>0 && N==v.lenght/4) resize(v.lenght/2);
        
        return valorRmv;
    }
    
    private void resize(int max){ 
        //'max' pode assumir o dobro do vetor v ou  
        // a metade do seu tamanho
        int[] vecTemp; 
        
        vecTemp=(Int[]) new Object[max];
        for(int i=0;i<N;i++){
            vecTemp[i]=v[i];
        }
        
        v=vecTemp;
    }
    
}
