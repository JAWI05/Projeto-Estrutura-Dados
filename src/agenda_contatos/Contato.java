public class Contato {
    String nome;
    String telefone;
    String email;
    Contato proximo;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.proximo = null;
    }
}
