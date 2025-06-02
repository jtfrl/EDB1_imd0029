import Aluno;

public class Principal{
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        aluno.setIdade(20);
        aluno.setNota(8.5);
        
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Nota: " + aluno.getNota());
    }
}