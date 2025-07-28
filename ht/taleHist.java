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


public class GHist extends Application{
    @Override
    
    public void start(Stage stage){
        CategoryAxis xAx=new CategoryAxis(); //valores para M
        NumberAxis yAx=new NumberAxis(); //valores de frequência
    
        xAx.setLabel("Posições na tabela");
        yAx.setLabel("Freq.");
        
        BarChart<String, Number> barChart=new BarChart<>(xAx, yAx);
        barChart.setTitle("Histograma para frequência de palavras");
    
        XYChart.Series<String, Number> series=new XYChart.Series<>();
        /*### como adicionar dados ###*/
        //series.getData().add(new XYChart.Data<>("B", 20)); 
        
        barChart.getData().add(series);
        
        Scene sceneDisplay=new Scene(barChart, 1000, 1000);
        stage.setScene(scene);
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

    public String[] del_RepWords(String[] txt){
        //String[] allWordsThatMatter;
        long strLen=txt.length();

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




public class taleHist{
    public static void Main (String [] args){
        //impl
    }
        
}