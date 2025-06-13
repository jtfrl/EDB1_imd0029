import java.util.HashMap;
import java.util.Map;

public class hMap{
    public static void main(String[] args){
        Map<String, Double> p=new HashMap<>(); 
        
        //tipos indicados com maísculo

        p.put("Maçã Gala", 4.95);
        p.put("Banana Prata", 3.92);
        p.put("Melancia Roja", 6.85);

        System.out.println("Elementos: "+p);

    }
}