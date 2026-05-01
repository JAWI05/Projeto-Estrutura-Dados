public class Pilha_Sist_HistoricoSites {
    Site topo;

    public Pilha_Sist_HistoricoSites() {
        this.topo = null;
    }

    public void Adicionar_Site(String nome_site){
        Site novaPagina = new Site(nome_site);

        novaPagina.proxima = topo;
        topo = novaPagina;
    }

    public void Historico_Navegacao(){
        if(topo == null){
            System.out.println("O histórico de navegação está vazio.");
        }
        else{
            Site temp = topo;
            while(temp != null){
                System.out.println("'"+temp.nome_site+"'");
                temp = temp.proxima;
            }
        }
    }

    public void Site_Anterior(){
        System.out.println("A pesquisa anterior: "+topo.nome_site);
    }

    public void Remover_Atual(){
        if(topo == null){
            System.out.println("O histórico de navegação está vazio.");
        }
        else{
            System.out.println("A pesquisa "+topo.nome_site+" foi excluida.");
            topo = topo.proxima;
        }
    }

    public void Verificar_Hist_vazio(){
        if(topo == null){
            System.out.println("O histórico de navegação está vazio.");
        }
        else{
            System.out.println("O histórico não está vazio.");
        }
    }
}
