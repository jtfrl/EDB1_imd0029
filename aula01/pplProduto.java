import Produto; //importa o código com a classe correspondente

public class Principal{
    public static void main(String... args){
        Produto mercado = new Produto();
        
        mercado.consultarEstoque();

        System.out.print(mercado); //mostra o saldo
    }
} //teste