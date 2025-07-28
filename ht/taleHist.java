//q. 1 - Exercício 3 | Elimine as palavras repetidas de tale.txt. 
//Depois, faça um histograma como o mostrado acima mas usando M = 100.
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import java.io.BufferedReader; //uso do buffer
import java.io.FileReader; //leitor de arquivos
import java.io.IOException;
import java.util.ArrayList; //!!! isso pode atrapalhar no uso de HT? 
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;


public class GHist extends Application{
    @Override
    
    public void start(Stage stage){
        CategoryAxis xAx=new CategoryAxis(); //valores para M
        NumberAxis yAx=new NumberAxis(); //valores de frequência
    
        xAx.setLabel("Posições na tabela");
        yAx.setLabel("Freq.");
        
        BarChart<String, Number> barChart=new BarChart<>(xAx, yAx);
        barChart.setTitle("Histograma para frequência de palavras para cada posição na tabela em hash");
    
        XYChart.Series<String, Number> series=new XYChart.Series<>();
        /*### como adicionar dados ###*/
        //series.getData().add(new XYChart.Data<>("B", 20)); 
        
        barChart.getData().add(series);
        
        Scene sceneDisplay=new Scene(barChart, 1000, 1000);
        stage.setScene(sceneDisplay);
        stage.show();
          
    }
}

public class fileTxt{
    String[] txt;
    

    fileTxt(String[] txt){
        this.txt=txt;
    }
    
    public void readFile(String filePath){
        ArrayList<String> lines=new Arraylist<>();
        try(BufferedReader br=new BufferedReader(new FileReader(filePath))){
            String line;
            while((line=br.readLine())!=null) lines.add(line);

            this.txt=lines.toArray(new String[0]); //atributo toma os dados lidos 
        }catch(IOException e){
            System.err.println("Falha na leitura do arquivo\n"+filePath);
            e.printStackTrace();
        }

    }

    public String[] del_RepWords(String[] txtvector){
        //String[] allWordsThatMatter;
        long strLen=txtvector.length;

        //como txtvector é um array, então length é apenas propriedade, não método

        Set<String> uniqueWords=new HashSet<>();
        //Set já lida com o caso de haver múltiplos dados iguais
        //apenas um deles entra dentro container acima

        for(long i=0; i<strLen;++i){
            uniqueWords.add(txt[i]);
        }
       /* 
            if(txt[i]!=txt[i+1]){
                uniqueWords.add(txt[i]);
            }
        não lida bem com casos como [...he and he...]
            */
       
        return uniqueWords.toArray(new String[0]);
    }
}

class No{
    String data;
    No prox;
    
    No(String d){
        this.data=d;
        this.prox=null;
    }
}


class htable{
    private No[] table;
    private int size;

    public htable(int cap){
        table=new No[cap];
        size=0;
    }

    private long hash(String k){
        long h=0;
        for(int i=0; i<k.length();i++){
            h=(31*k.charAt(i))%100; //M=100
        }
        return h;
    }

    public void insert(String w){
        long index=hash(w);
        No novo_no=new No(n);

        if(table[index]==null){
            table[index]=novo_no;
       }else{
            novo_no.prox=table[index]; 
            //dessa forma o valor do próximo nó é null
            table[index]=novo_no;
       }
       size++;
    }

    public int tam(){
        return size;
    }

    
    public int countAtIndex(int index){
       int count=0;
       No atual=table[index];
       
       while(atual!=null){
            count++;
            atual=atual.prox;
       }

       return count;
    }
}



public class taleHist{
    public static void Main (String [] args){
        Scanner s=new Scanner(System.in);

        System.out.println("Insira o arquivo .txt");
        String fileName=s.nextLine();
        fileTxt f=new fileTxt(fileName);

        f.readFile(fileName);
        //f.del_RepWords(fileName);

        String[] u_words=del_RepWords(f.txt);

        htable t=new htable();

        for(i=0;i<u_words.length;i++){
            t.insert(u_words[i]); //hash já feito aqui
        }

        

        for(int i=0;i<table.length;i++){
            int wordsOnACertIx=table.countAtIndex(i); //palavras em um certo índice
            if(wordsOnACertIx>0){
                series.getData().add(new XYChart.Data<>(String.valueOf(i), wordsOnACertIx));
            }
        }
      //series deve conter todos os dados: frequencias para cada um dos índices (0 a 99)
      
      


        Stage stage;

    }
        
}