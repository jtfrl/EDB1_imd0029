//q. 3: Lista de Exercícios – Listas Encadeadas | parte 1

public class ld_comp{
    String nome;
    int qtd;
    double preco;

    ld_comp prox;
    ld_comp anterior;

    ld_comp(String nome, int qtd, double price){
        this.nome=nome;
        this.qtd=qtd;
        this.price=price;
        this.prox=null;
        this.ant=null;
    }
}