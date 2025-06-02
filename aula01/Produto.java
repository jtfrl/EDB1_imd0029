public class Produto{
    private String nome;
    private double preco;
    private int qtd;

    public void vender(int nQtd){};
    public void reporEstoque(int nQtd){};
    public int consultarEstoque(){return qtd;}; 

}