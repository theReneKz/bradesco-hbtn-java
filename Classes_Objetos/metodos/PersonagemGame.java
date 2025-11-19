public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    public int getSaudeAtual() {
        return this.saudeAtual;
    }
    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void tomarDano (int quantidadeDeDano) {
        if(quantidadeDeDano > saudeAtual) {
            saudeAtual = 0;
        } else {
            saudeAtual = saudeAtual - quantidadeDeDano;
        }
    }

    public void receberCura (int quantidadeDeCura) {
        if((saudeAtual + quantidadeDeCura) <= 100) {
            saudeAtual += quantidadeDeCura;
        } else {
            saudeAtual = 100;
        }
    }

}
