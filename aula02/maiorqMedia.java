/*
 * Verifica valores maiores que a média
 */

public class Exemplo2 {
    public static void main(String[] args) {
          int[] val={5, 6, 32, 25, 18, -25, -7};

          int soma=0;

          for(int valor: val){
            soma+=valor;
          }

          double media=soma/val.length;

          for (int i=0; i<val.length; i++){
            if (val[i]> media) System.out.println(val[i]); //valores em cada posição
          }
        }
}
