public class Cliente {

    int numeroAtendimento;
    String nome;
    String horaChegada;
    Cliente proximo;

    public Cliente(int numeroAtendimento, String nome, String horaChegada) {
        this.numeroAtendimento = numeroAtendimento;
        this.nome = nome;
        this.horaChegada = horaChegada;
        this.proximo = null;
    }
}
