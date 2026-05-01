class Fila_AtendimentoCliente {
    private Cliente primeiro;
    private Cliente ultimo;
    int contador = 0;

    public Fila_AtendimentoCliente() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void Enfileirar(int numeroAtendimento, String nome, String horaChegada){

        Cliente novoCliente = new Cliente(numeroAtendimento, nome, horaChegada);

        if(primeiro == null){
            primeiro = novoCliente;
        }
        else{
            ultimo.proximo = novoCliente;
        }
        ultimo = novoCliente;
        contador++;
    }

    public void Desenfileirar(){
        if(primeiro == null){
            System.out.println("A fila está vazia.");
        }
        else{
            System.out.println("Numero de atendimento: "+primeiro.numeroAtendimento+", Nome: "+primeiro.nome+", Hora de chegada: "+primeiro.horaChegada);
            System.out.println(primeiro.nome+" foi atendido!");
            primeiro = primeiro.proximo;

            if(primeiro == null){
                ultimo = null;
            }
            contador--;
        }
    }

    public void ExibirFila(){

        Cliente temp = primeiro;

        while(temp != null){
            System.out.print(temp.nome);
            System.out.print(" -> ");
            temp = temp.proximo;
        }
        System.out.println("null");
    }

    public void Quantidade_Clientes(){
        System.out.println("A fila está com "+contador+" clientes.");
    }

    public void Verificar_FilaVazia(){
        if(primeiro == null){
            System.out.println("A fila do atendimento está vazia.");
        }
        else{
            System.out.println("A fila do atendimento não está vazia.");
        }
    }

    public void AdicionarCliente_Especifico(int posicao, int numeroAtendimento, String nome, String horaChegada) {
        if (posicao < 1 || posicao > contador + 1) {
            System.out.println("Posição Inválida.");
            return;
        }

        Cliente novoCliente = new Cliente(numeroAtendimento, nome, horaChegada);

        if (posicao == 1) {
            novoCliente.proximo = primeiro;
            primeiro = novoCliente;
            if (ultimo == null) {
                ultimo = novoCliente;
            }
        }

        else {
            Cliente temp = primeiro;
            int i = 1;
            while (i < posicao - 1) {
                temp = temp.proximo;
                i++;
            }
            novoCliente.proximo = temp.proximo;
            temp.proximo = novoCliente;

            if (novoCliente.proximo == null) {
                ultimo = novoCliente;
            }
        }

        contador++;
    }

    public void RemoverCliente_especifico(int posicao) {
        if (posicao < 1 || posicao > contador) {
            System.out.println("Posição Inválida.");
        }

        if (posicao == 1) {
            System.out.println("O cliente " + primeiro.nome + " foi removido.");
            primeiro = primeiro.proximo;
            if (primeiro == null) {
                ultimo = null;
            }
        }
        else {

            Cliente temp = primeiro;

            int i = 1;
            while (i < posicao - 1) {
                temp = temp.proximo;
                i++;
            }

            Cliente clienteRemovido = temp.proximo;
            temp.proximo = clienteRemovido.proximo;

            if (temp.proximo == null) {
                ultimo = temp;
            }

            System.out.println("O cliente " + clienteRemovido.nome + " foi removido.");
        }

        contador--;
    }

    public void ProximoCliente(){
        System.out.println("O próximo cliente: ");
        System.out.println("Numero de Atendimento: "+primeiro.numeroAtendimento+", Nome: "+primeiro.nome+", Hora de chegada: "+primeiro.horaChegada);
    }
}


