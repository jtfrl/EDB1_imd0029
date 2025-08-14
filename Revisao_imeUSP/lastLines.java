/*
 * Exercícios 3 (FEOLIOFF)
Imprima as últimas k linhas de um arquivo (grande) de
texto. Faça isso sem desperdiçar memória. Use uma (ou mais)
das ADTs que já estudamos.
 * 
 */

//fifo: para eliminar as últimas k linhas, devemos 
//considerar que o primeiro que entra é o primeiro que sai

import java.util.Scanner;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.FileReader;

class No{
    String text;
    No prox;
    No ant;

    No (String t){
        this.text=t;
        this.prox=null;
        this.ant=null;
    }
}

class Stack<String>{
    private String[] v;
    private int tam;
    private String front;
    private String rear;


    public Stack<String>(){
        v=(String[]) new Object[];//tam a definir; com base em fileTxt

        N=0;
        front="";
        rear="";
    }

}


class fileTxt{
    String[] txt;

    fileTxt(String[] txt){
        this.txt=txt;
    }

    public void ReadFile(String filepth){
        //uso de fila para alocar as linhas
        //Queue<String> lines=new Queue<>();

        try(BufferedReader br=new BufferedReader(new FileReader(filepth))){
            String line;
            while(line=br.readLine()!=null) /*lines.add(line); */

            
        }
    }

}
