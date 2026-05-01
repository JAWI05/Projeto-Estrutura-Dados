public class Chamado {
    int ID_chamado;
    String nome_cliente;
    String problema;
    Chamado proximo;

    public Chamado(int ID_chamado, String nome_cliente, String problema) {
        this.ID_chamado = ID_chamado;
        this.nome_cliente = nome_cliente;
        this.problema = problema;
        this.proximo = null;
    }
}
