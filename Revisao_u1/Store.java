//q. 6 (parte 1) - Revisão em 10.6.25

public class Store{
    private static Store[] prod=new prod[100];
    private static String[] nome=new nome[100];
    private static double[] preco=new preco[100];
    private int prodCount=0;

    /*
    public Store(String nome, double preco){
     this.nome=nome;
     this.preco=preco;
    }
    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setNome(String nome){
        nome.add(nome);
    }

    public void setPreco(double p){
        preço=p;
    }
         */

    public void addProduct(String name, double price){
        if(prodCount<100){
            nome[prodCount]=nome;
            preco[prodCount]=preco;
            prodCount++;
            System.out.println("Adicionado: "+nome+" (R$ "+preco+")" );
        }
    }

//ver restante da implementacao no email
}