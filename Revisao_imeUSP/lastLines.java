/*
 * Exercícios 3 (FEOLIOFF)
Imprima as últimas k linhas de um arquivo (grande) de
texto. Faça isso sem desperdiçar memória. Use uma (ou mais)
das ADTs que já estudamos.
 * 
 */

import java.util.Scanner;
import java.util.Queue;
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
/*
class Queue<String>{

to be impl


//need to have a add method
}
*/

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
