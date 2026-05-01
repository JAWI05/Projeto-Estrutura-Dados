public class Fila_SistemaSuporteChamados{
    Chamado primeiro;
    Chamado ultimo;
    int contador = 0;

    public Fila_SistemaSuporteChamados() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void Adicionar_Chamado(int ID, String nomeCliente, String problema){
        Chamado novoChamado = new Chamado(ID, nomeCliente, problema);

        if(primeiro == null){
            primeiro = novoChamado;
        }

        else{
            ultimo.proximo = novoChamado;
        }

        ultimo = novoChamado;
        contador++;
    }

    public void Atender_Chamado(){
        if(primeiro == null){
            System.out.println("Não há nenhum chamado.");
        }
        else{
            System.out.println("O chamado do(a) "+primeiro.nome_cliente+" foi atendido.");
            primeiro = primeiro.proximo;
        }
        contador--;
    }

    public void Exibir_fila(){
        if(primeiro == null){
            System.out.println("Não há nenhum chamado.");
        }
        else{
            Chamado temp = primeiro;
            while(temp != null){
                System.out.println("O chamado "+temp.ID_chamado+", aberto por "+temp.nome_cliente+", tem como problema: "+temp.problema);
                temp = temp.proximo;
            }
        }
    }

    public void Quant_Chamados(){
        System.out.println("O sistema possui "+contador+" chamados nesse momento.");
    }

    public void Consultar_primeiro(){
        if(primeiro == null){
            System.out.println("Não há nenhum chamado.");
        }
        else{
            System.out.println("O próximo chamdo a ser atendido é do(a) "+primeiro.nome_cliente);
        }
    }

    public void Fila_Vazia(){
        if (primeiro == null){
            System.out.println("Não há nenhum chamado.");
        }
        else{
            System.out.println("O sistema de chamados não está vazia.");
        }
    }
}
