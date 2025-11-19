public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;
    private static final String VIVO = "vivo";
    private static final String MORTO = "morto";

    public PersonagemGame(int saudeAtual, String nome) {
        setSaudeAtual(saudeAtual);
        setNome(nome);
    }

    public int getSaudeAtual() {
        return this.saudeAtual;
    }
    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if(this.saudeAtual == 0) {
            this.status = MORTO;
        } else {
            this.status = VIVO;
        }
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public void tomarDano (int quantidadeDeDano) {
        if(quantidadeDeDano > getSaudeAtual()) {
            setSaudeAtual(0);
        } else {
            setSaudeAtual(getSaudeAtual() - quantidadeDeDano);
        }
    }

    public void receberCura (int quantidadeDeCura) {
        if((getSaudeAtual() + quantidadeDeCura) <= 100) {
            setSaudeAtual(getSaudeAtual() + quantidadeDeCura);
        } else {
            setSaudeAtual(100);
        }
    }

    public String getStatus() {
        return this.status;
    }

}
