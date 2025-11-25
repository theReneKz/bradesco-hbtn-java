import java.util.List;
import java.util.ArrayList;
public class ListaTodo {
    private List<Tarefa> tarefas ;

    public ListaTodo() {
        this.tarefas =  new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        for(Tarefa temp: this.tarefas) {
            if(temp.getIdentificador() == tarefa.getIdentificador()) {
                throw new IllegalArgumentException(String.format("Tarefa com identificador %d ja existente na lista", tarefa.getIdentificador()));
            }
        }
        this.tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador ) {
        boolean feito = false;
        for(Tarefa tarefa: this.tarefas) {
            if(tarefa.getIdentificador() == identificador) {
                tarefa.fazerTarefa();
                feito = true;
                break;
            }
        }
        return feito;
    }

    public boolean desfazerTarefa(int identificador ) {
        boolean feito = false;
        for(Tarefa tarefa: this.tarefas) {
            if(tarefa.getIdentificador() == identificador) {
                tarefa.desfazerTarefa();
                feito = true;
                break;
            }
        }
        return feito;
    }

    public void desfazerTodas() {
        for(Tarefa tarefa: this.tarefas) {
                tarefa.desfazerTarefa();
        }
    }

    public void fazerTodas() {
        for(Tarefa tarefa: this.tarefas) {
                tarefa.fazerTarefa();
        }
    }

    public void listarTarefas() {
        for(Tarefa tarefa: this.tarefas) {
            String check = (tarefa.estahFeita()) ? "X": " ";
            System.out.println(String.format("[%s]  Id: %d - Descricao: %s", check, tarefa.getIdentificador(), tarefa.getDescricao()));
        }
    }

}
