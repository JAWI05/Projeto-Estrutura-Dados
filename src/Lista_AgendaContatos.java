public class Lista_AgendaContatos {
    Contato primeiro;
    Contato ultimo;

    public Lista_AgendaContatos() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void AdicionarContato(String nome, String telefone, String email){
        Contato novoContato = new Contato(nome, telefone, email);
        if(primeiro == null){
            primeiro = novoContato;
            if(ultimo == null){
                ultimo = novoContato;
            }
        }
        else{
            ultimo.proximo = novoContato;
            ultimo = novoContato;
        }
    }

    public void RemoverContato(String nome){
        if(primeiro == null){
            System.out.println("A agenda não possui nenhum contato.");
            return;
        }

        if(primeiro.nome.equals(nome)){
            primeiro = primeiro.proximo;
            if(primeiro == null){
                ultimo = null;
            }
            return;
        }

        Contato anterior = primeiro;
        Contato atual = primeiro.proximo;

        while(atual != null && !atual.nome.equals(nome)){
            anterior = atual;
            atual = atual.proximo;
        }

        if(atual == null){
            System.out.println("Contato não encontrado.");
            return;
        }

        anterior.proximo = atual.proximo;

        if(atual == ultimo){
            ultimo = anterior;
        }
    }


    public void ExibirAgenda(){
        if(primeiro == null){
            System.out.println("A agenda está vazia.");
        }
        else{
            Contato contato = primeiro;
            while(contato != null){
                System.out.println(contato.nome+"- telefone: "+contato.telefone+" e email "+contato.email);
                contato = contato.proximo;
            }
        }
    }

    public void Verificar_CadastroVazio(){
        if(primeiro == null){
            System.out.println("A agenda está vazia.");
        }
        else{
            System.out.println("A agenda não está vazia.");
        }
    }
}
