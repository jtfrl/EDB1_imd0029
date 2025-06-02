import ContaBancaria; //importa o código com a classe correspondente

public class Principal{
    public static void main(String... args){
        ContaBancaria sabrina = new ContaBancaria();
        sabrina.sacar(); //exemplo de método associado
        sabrina.depositar(); //id

        System.out.print(sabrina); //mostra o saldo
    }
} //teste