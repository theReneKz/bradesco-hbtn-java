public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) {
        modificarDescricao(descricao);
        this.identificador = identificador;
        this.estahFeita = false;
    }

    public String getDescricao() {
        return this.descricao;
    }


    public boolean estahFeita() {
        return this.estahFeita;
    }

    public void fazerTarefa() {
        this.estahFeita = true;
    }

    public void desfazerTarefa() {
        this.estahFeita = false;
    }


    public int getIdentificador() {
        return this.identificador;
    }

    public void modificarDescricao (String desc) {
        if((desc != null) && (!desc.isBlank())) {
            this.descricao = desc;
        } else {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }
    }
}
