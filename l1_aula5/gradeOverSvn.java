public class gradeOverSvn{
    public static void main(String[] args) {
        double[] notas={5.7,4,7.1,7.2,5,7};

        double nota=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>7){
                nota=notas[i];
                break;
            }
        }
    
        System.out.println("Primeira nota maior que 7 no array é: "+nota);
    }
}
