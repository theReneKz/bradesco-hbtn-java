import java.util.List;
import java.util.ArrayList;
import atividades.*;

public class Workflow {
    public List<Atividade> listaAtividades;

    public Workflow() {
        this.listaAtividades = new ArrayList<>();
    }

    public void registrarAtividade(Atividade atividade) {
        this.listaAtividades.add(atividade);
    }

    public void executar() {
        for(Atividade atividade: listaAtividades) {
            atividade.executar();
        }
    }
}
