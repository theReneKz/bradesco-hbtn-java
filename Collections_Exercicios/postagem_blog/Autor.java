public class Autor implements Comparable<Autor>{
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public int compareTo(Autor o) {
        return toString().compareTo(o.toString());
    }

    @Override
    public String toString() {
        return this.nome + " " + this.sobrenome;
    }
}
