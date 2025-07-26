//q. 1 - Exercício 3 | Elimine as palavras repetidas de tale.txt. 
//Depois, faça um histograma como o mostrado acima mas usando M = 100.


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;



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


public class delRepWords{
    public String[] del_RepWords(/* arq txt aqui*/){
        //ver implementação para countMaxRepeats em DNAprofiler
    }
}

public class taleHist{
    public static void Main (String [] args){
        //impl
    }
        
}