public class Lista_SistemaCadastroDeAlunos{

    private Aluno primeiro;
    private Aluno ultimo;
    int contador = 0;

    public Lista_SistemaCadastroDeAlunos() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void CadastrarAluno(String nome, int matricula, double NotaFinal) {
        Aluno novoAluno = new Aluno(nome, matricula, NotaFinal);

        if (primeiro == null || nome.compareToIgnoreCase(primeiro.nome) < 0) {
            novoAluno.proximo = primeiro;
            primeiro = novoAluno;
            if (ultimo == null) {
                ultimo = novoAluno;
            }
        }
        else {
            Aluno atual = primeiro;
            while (atual.proximo != null && nome.compareToIgnoreCase(atual.proximo.nome) > 0) {
                atual = atual.proximo;
            }
            novoAluno.proximo = atual.proximo;
            atual.proximo = novoAluno;

            if (novoAluno.proximo == null) {
                ultimo = novoAluno;
            }
        }

        contador++;
    }


    public void RemoverAluno(int matricula){

        if(primeiro == null){
            System.out.println("Nenhum aluno resgistrado!");
        }
        else {

            if (primeiro.matricula == matricula) {
                primeiro = primeiro.proximo;
                if (primeiro == null) {
                    ultimo = null;
                }
                contador--;
                System.out.println("Aluno removido com sucesso!");
            }

            Aluno atual = primeiro;
            Aluno anterior = null;

            while (atual != null && atual.matricula != matricula) {
                anterior = atual;
                atual = atual.proximo;
            }

            if (atual == null) {
                System.out.println("A matrícula " + matricula + " não foi encontrada no sistema.");
            }

            anterior.proximo = atual.proximo;

            if (atual == ultimo) {
                ultimo = anterior;
            }
            contador--;
            System.out.println("Aluno removido com sucesso!");
        }
    }

    public void BuscarAluno(int matricula){
        int i = 0;
        Aluno temp = primeiro;
        while(temp.matricula != matricula && i <= contador){
            temp = temp.proximo;
            i++;
        }
        if(temp.matricula != matricula){
            System.out.println("A matrícula "+matricula+" não foi encontrada no sistema.");
        }
        else{
            System.out.println("Nome: "+temp.nome+", nota final: "+temp.NotaFinal);
        }
    }

    public void ExibirLista(){

        Aluno temp = primeiro;

        while(temp != null){
            System.out.println(temp.nome+": Matrícula: "+temp.matricula+",Nota final: "+temp.NotaFinal);
            temp = temp.proximo;
        }
    }

    public void Verificar_ListaVazia(){
        if(primeiro == null){
            System.out.println("O sistema de cadastro de alunos está vazio.");
        }
        else {
            System.out.println("O sistema de cadastro de alunos não está vazio.");
        }
    }
}
