public class Pilha_HistoricoPesquisa {
    Pesquisa topo;
    int contador;

    public Pilha_HistoricoPesquisa() {
        this.topo = null;
    }

    public void Adicionar_Pesquisa(String pesquisa){
        Pesquisa NovaPesquisa = new Pesquisa(pesquisa);
        NovaPesquisa.proximo = topo;
        topo = NovaPesquisa;
        contador++;
    }

    public void Exibir_HistoricoDePesquisa(){
        if(topo == null){
            System.out.println("O histórico de pesquisa está vazia.");
        }
        Pesquisa temp = topo;
        while(temp != null){
            System.out.println("'"+temp.pesquisa+"'");
            temp = temp.proximo;
        }
    }

    public void Remover_Pesquisa(){
        if(topo == null){
            System.out.println("O histórico de pesquisa está vazia!");
        }
        else{
            System.out.println("A pesquisa "+topo.pesquisa+" foi removido.");
            topo = topo.proximo;
            contador--;
        }
    }

    public void Mostrar_PesquisaAnterior(){
        if(topo == null){
            System.out.println("O histórico de pesquisa está vazia.");
        }
        else{
            System.out.println("A pesquisa mais recente: '"+topo.pesquisa+"'");
        }
    }

    public void Verificar_HistoricoVazio(){
        if(topo == null){
            System.out.println("O histórico de pesquisa está vazio.");
        }
        else{
            System.out.println("O histórico de pesquisa não está vazio.");
        }
    }

    public void Remover_PesquisaEspecificaPorTermo(String termo){
        if (topo == null) {
            System.out.println("O histórico de pesquisa está vazio.");
            return;
        }

        if (topo.pesquisa.toLowerCase().contains(termo.toLowerCase())) {
            System.out.println("A pesquisa '" + topo.pesquisa + "' foi removida.");
            topo = topo.proximo;
            contador--;
            return;
        }

        Pesquisa anterior = topo;
        Pesquisa atual = topo.proximo;

        while (atual != null) {
            if (atual.pesquisa.toLowerCase().contains(termo.toLowerCase())) {
                anterior.proximo = atual.proximo;
                System.out.println("A pesquisa '" + atual.pesquisa + "' foi removida.");
                contador--;
                return;
            }
            anterior = atual;
            atual = atual.proximo;
        }

        System.out.println("Nenhuma pesquisa contendo '" + termo + "' foi encontrada.");
    }

    public void Remover_PesquisaEspecificaNome(String Pesquisa) {
        if (topo == null) {
            System.out.println("O histórico de pesquisa está vazio.");
            return;
        }

        // Verifica se o primeiro (topo) é o que deve ser removido
        if (topo.pesquisa.equalsIgnoreCase(Pesquisa)) {
            System.out.println("A pesquisa '" + topo.pesquisa + "' foi removida.");
            topo = topo.proximo;
            contador--;
            return;
        }

        Pesquisa anterior = topo;
        Pesquisa atual = topo.proximo;

        while (atual != null) {
            if (atual.pesquisa.equalsIgnoreCase(Pesquisa)) {
                anterior.proximo = atual.proximo;
                System.out.println("A pesquisa '" + atual.pesquisa + "' foi removida.");
                contador--;
                return;
            }
            anterior = atual;
            atual = atual.proximo;
        }

        System.out.println("Nenhuma pesquisa igual a '" + Pesquisa + "' foi encontrada.");
    }

}
