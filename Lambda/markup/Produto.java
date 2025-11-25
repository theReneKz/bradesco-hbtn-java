import java.util.function.Supplier;
import java.util.function.Consumer;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup = 10.0;
    public Supplier<Double> precoComMarkup = () -> (this.preco * this.percentualMarkup / 100) + this.preco;
    public Consumer<Double> atualizarMarkup = (input) -> this.percentualMarkup = input.doubleValue();

    public Produto(double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }
}
