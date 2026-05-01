public class Aluno {
    String nome;
    int matricula;
    double NotaFinal;
    Aluno proximo;

    public Aluno(String nome, int matricula, double notaFinal) {
        this.nome = nome;
        this.matricula = matricula;
        NotaFinal = notaFinal;
        this.proximo = null;
    }
}
