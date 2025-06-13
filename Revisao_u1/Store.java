package src;

//q. 6 (parte 1) - Revisão em 10.6.25

public class Store{
    private Store[] prod=new prod[100];
    private String[] nome=new nome[100];
    private double[] preco=new preco[100];
    private int prodCount=0;

    public void addProduct(String name, double price){
        if(prodCount<100){
            nome[prodCount]=nome;
            preco[prodCount]=preco;
            prodCount++;
            System.out.println("Adicionado: "+nome+" (R$ "+preco+")" );
        }else{
            System.out.println("Erro! Já há 100 produtos registrados. Não é possível adicionar.");
        }
    }

    public void displayProd(){}



//ver restante da implementacao no email
}