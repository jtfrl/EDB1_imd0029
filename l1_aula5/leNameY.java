import java.util.Scanner;

public class leNameY {
    public static void main(String[] args) {
        String[] nomes = {"Jose", "Pedro", "Wilma",
        "Ana", "Letícia", "Ester"};

        Scanner s = new Scanner(System.in);
        System.out.println("Digite um nome (sem espaço antes ou depois): ");
        String n = s.nextLine(); //leitura de nome

        boolean f=false;

        for(int i=0; i<nomes.length;i++){
            if(nomes[i].equals(n)){ //ve a equivalencia
                System.out.println("O nome "+n+ " está no vetor.");
                f=true;
                break;
            }
        }

        if(!f){
            System.out.println("O nome "+n+ " não está no vetor.");
        }

    s.close();
    }
}

