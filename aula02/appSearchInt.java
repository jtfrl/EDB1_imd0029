public class appSearchInt{ //nome daclasse deve ser igual ao nome do arquivo.
    public static void main(String[] args){
        int[] idades={12, 13, 18, 11};

        int idadeFound=seqSearch.seqSearch(idades, 12); //do arquivo SeqSearch.java

        System.out.println("Idade encontrada: " + idadeFound);
    }
}