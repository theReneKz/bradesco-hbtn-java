import provedores.*;
public class Pedido {
    private int codigo;
    private double peso;
    private double total;
    private Frete frete;

    public Pedido(int codigo, double peso, double total) {
        this.codigo = codigo;
        this.peso = peso;
        this.total = total;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getTotal() {
        return this.total;
    }

    public void setFrete(Frete frete){
        this.frete = frete;
    }

    public Frete getFrete() {
        return this.frete;
    }
}
