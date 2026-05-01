//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("------  Sistema de Cadastro de Alunos  ------");
        Lista_SistemaCadastroDeAlunos lista = new Lista_SistemaCadastroDeAlunos();

        lista.CadastrarAluno("Alice", 1234, 9);
        lista.CadastrarAluno("Jessica", 2367, 8.5);
        lista.CadastrarAluno("Mauricio", 9724, 2.6);

        lista.ExibirLista();

        lista.RemoverAluno(9724);
        lista.ExibirLista();

        System.out.println();
        lista.Verificar_ListaVazia();
        lista.BuscarAluno(1234);
        System.out.println();
        System.out.println();

        System.out.println("------  Agenda de Contatos  ------");
        Lista_AgendaContatos agenda = new Lista_AgendaContatos();

        agenda.AdicionarContato("Hiro", "92154-3578", "hirolima.p012@gmail.com");
        agenda.RemoverContato("Hiro");

        agenda.ExibirAgenda();

        agenda.Verificar_CadastroVazio();

        System.out.println();
        System.out.println();

        System.out.println("------  Fila de Atendimento de lojas  ------");

        Fila_AtendimentoCliente fila = new Fila_AtendimentoCliente();
        fila.Enfileirar(1234, "Gabriel", "12:54");
        fila.Enfileirar(8975, "Julia", "12:57");
        fila.Enfileirar(6920, "Caio", "13:10");

        fila.ExibirFila();

        fila.Desenfileirar();

        fila.ExibirFila();
        System.out.println();

        fila.AdicionarCliente_Especifico(1, 3424, "Livia", "13:20");

        fila.ExibirFila();

        fila.AdicionarCliente_Especifico(2, 1124, "Luisa", "13:05");

        fila.ExibirFila();

        fila.AdicionarCliente_Especifico(3, 1124, "Pedro", "13:10");

        fila.ExibirFila();
        System.out.println();

        fila.RemoverCliente_especifico(4);

        fila.ExibirFila();

        fila.ProximoCliente();
        System.out.println();

        fila.Verificar_FilaVazia();
        fila.ExibirFila();
        fila.Quantidade_Clientes();
        System.out.println();
        System.out.println();

        System.out.println("------  Histórico de Busca  ------");

        Pilha_HistoricoPesquisa pilha = new Pilha_HistoricoPesquisa();

        pilha.Adicionar_Pesquisa("Understanding Brasil's history.");
        pilha.Adicionar_Pesquisa("O término");
        pilha.Adicionar_Pesquisa("Influenciadoraperde 500 mil seguidores");
        pilha.Adicionar_Pesquisa("Algebra Relacional");
        pilha.Adicionar_Pesquisa("Wednesday");

        pilha.Exibir_HistoricoDePesquisa();

        System.out.println();
        pilha.Remover_Pesquisa();

        System.out.println();
        pilha.Exibir_HistoricoDePesquisa();
        pilha.Verificar_HistoricoVazio();

        System.out.println();
        pilha.Mostrar_PesquisaAnterior();
        pilha.Remover_PesquisaEspecificaPorTermo("Wednesday");

        System.out.println();
        pilha.Exibir_HistoricoDePesquisa();

        System.out.println();
        System.out.println();

        System.out.println("--------  Sistema de chamados  --------");
        System.out.println();
        Fila_SistemaSuporteChamados fila2 = new Fila_SistemaSuporteChamados();

        fila2.Adicionar_Chamado(1234, "Maria", "A temperatura está acima do normal.");
        fila2.Adicionar_Chamado(1908, "Mateus", "Os computadores não estão conectando.");
        fila2.Adicionar_Chamado(8907, "Livia", "Sistema Travado.");

        fila2.Exibir_fila();

        System.out.println();
        fila2.Atender_Chamado();

        fila2.Quant_Chamados();

        fila2.Consultar_primeiro();

        fila2.Fila_Vazia();

        System.out.println();
        System.out.println();

        System.out.println("--------  Histórico de Navegações  --------");
        System.out.println();
        Pilha_Sist_HistoricoSites pilha2 = new Pilha_Sist_HistoricoSites();

        pilha2.Adicionar_Site("Howtotrainyouroratory.com");
        pilha2.Adicionar_Site("www.exemplo1.com");
        pilha2.Adicionar_Site("duolingo.com");

        pilha2.Historico_Navegacao();

        System.out.println();
        pilha2.Site_Anterior();

        pilha2.Remover_Atual();

        System.out.println();

        pilha2.Historico_Navegacao();

        System.out.println();
        pilha2.Verificar_Hist_vazio();
    }
}
