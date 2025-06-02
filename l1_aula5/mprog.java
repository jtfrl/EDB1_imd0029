import java.util.ArrayList;
import java.util.List;

public class mprog{
    public static void main(String[] args) {
        String[] prod={"Mandioca", "Mangaba", "Pente", "Ovo", "Óculos", "Melancia"};
        List<String> iniNomeList=new ArrayList<>();
        
        for(String nome: prod){
            if(nome.startsWith("M")){
                iniNomeList.add(nome);
            }
        }
        
        
        System.out.println("Produtos com letra M no ínicio: ");
        
        for(int i=0;i<prod.length;i++){
            if(iniNomeList.contains(prod[i])){
                System.out.println(prod[i]);
            }
        }
    }
}
