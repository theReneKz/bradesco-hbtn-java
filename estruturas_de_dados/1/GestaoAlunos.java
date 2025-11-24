import java.util.ArrayList;
public class GestaoAlunos {
    private ArrayList<Aluno> alunos;
    public GestaoAlunos() {
        this.alunos = new ArrayList<>();
    }

    public static void main(String[] args) {
        GestaoAlunos gestor = new GestaoAlunos();
        gestor.adicionarAluno(new Aluno("Aluno Um", 21));
        gestor.adicionarAluno(new Aluno("Aluno Dois", 22));
        gestor.adicionarAluno(new Aluno("Aluno Tres", 23));
        gestor.listarAlunos();
        gestor.buscarAluno("Aluno Dois");
        gestor.excluirAluno("Aluno Tres");
        gestor.excluirAluno("Aluno Inexistente");
        gestor.buscarAluno("Aluno Um");
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void excluirAluno(String nome) {
        int excluir = -1;
        for(int i = 0; i < alunos.size(); i++) {
            Aluno aluno = this.alunos.get(i);
            if(aluno.getNome().equals(nome)) {
                excluir = i;
                break;
            }
        }
        if(excluir >= 0) {
            this.alunos.remove(excluir);
        }
    }

    public void buscarAluno(String nome) {
        for(int i = 0; i < alunos.size(); i++) {
            Aluno aluno = this.alunos.get(i);
            if(aluno.getNome().equals(nome)) {
                System.out.println(aluno.toString());
                break;
            }
        }
    }

    public void listarAlunos() {
        for(int i = 0; i < alunos.size(); i++) {
            Aluno aluno = this.alunos.get(i);
            System.out.println(aluno.toString());
        }
    }
}
