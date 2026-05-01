public class Site {
    String nome_site;
    Site proxima;

    public Site(String nome_site) {
        this.nome_site = nome_site;
        this.proxima = null;
    }
}
