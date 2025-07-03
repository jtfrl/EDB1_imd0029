//q. 3: Lista de Exercícios – Listas Encadeadas | parte 1

import java.util.Scanner;

public class ld_compras{
    ld_comp begin;
    ld_comp tail;

    public ld_compras(){
        this.begin=null;
        this.tail=null; //permitem explorar a lista
    }

    public void inserirProd(String nome, int qtd, double preco){
        ld_comp prod=new ld_comp(nome, qtd, preco);

        if(begin==tail){
            begin=tail;
            tail=prod; //o 'prod' erá o produto que começa a lista
        }else{
            tail.prox=prod;
            prod.anterior=tail;
            tail=prod; //configura os 'ponteiros'
        }
    }


    public boolean removerProd(String nome, int qtd, double preco){
        ld_comp atual=begin;
        ld_comp ant=null;

        while(atual!=null){
            if(atual.nome.equals(nome) && atual.qtd == qtd && atual.preco == preco){
                if(ant==null){
                    //item encontrado no incio da lista (rotina 1)
                    begin=atual.prox;
                    if(begin!=null){
                        begin.ant=null;
                    }
                }else{
                    ant.prox=atual.prox;
                }

                //se estiver no último nó/item
                if(atual.prox!=null){
                    atual.prox.ant=ant;
                }
                    System.out.println("Item removido com sucesso.\n");
                   return true;
            } 
        //indo ao próximo nó
        ant=atual;
        atual=atual.prox;
        }
        System.out.println("Item não removido. Tente novamente. \n");
        return false;
    }

    public void browse(){
        if(begin==null){
            System.out.println("Carrinho vazio");
            return;
        }

        ld_comp atual=begin;
        Scanner s=new Scanner(System.in);

        int option;

            do{
                System.out.println("\n--- Item Atual ---");
                System.out.println("Nome: " + atual.nome+"\n");
                System.out.println("Quantidade: " + atual.qtd+"\n");
                System.out.println("Preço: R$" + atual.preco+"\n");
                System.out.println("______________________");

                System.out.println("Menu: \n");
                System.out.println("Escolha a opção de acordo com o número: \n");
                System.out.println("1. Pŕoximo item\n");
                System.out.println("2. Item anterior\n");
                System.out.println("3. Voltar ao menu principal\n");
                System.out.print("\n\nEscolha: ");

                option = s.nextInt();

                switch(option){
                    case 1:{
                        if(autal.prox!=null){
                            atual=atual.prox;
                        }else{
                            System.out.println("Fim da lista. Não há outros itens incluídos.\n");
                        }
                        break;
                        
                    }
                    case 2:{

                        if(atual.ant!=null){
                            atual=atual.ant;
                        }else{
                            System.out.println("Não há outros itens incluídos.\n");
                        }
                        break;
                    }
                    case 3:{
                        System.out.println("Retornando ao menu\n");
                        break;
                    }


                    default:
                        System.err.println("Opção inválida. Escolha entre 1, 2 ou 3.\n");
            }
            
        }while(option!=3);

    }

    public void exibirCarro(){
       ld_comp atual=begin;
       System.out.println("Itens no carrinho: \n");
       while(atual!=null){
            System.out.println(atual.nome+" "+atual.qtd+" "+atual.preco+" "+"\n");
            atual=atual.prox;
       }
    }


    public void main (String[] args){
        ld_
    }
}
