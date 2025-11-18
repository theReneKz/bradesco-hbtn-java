package provedores;

public class Frete {
    private double valor;
    private TipoProvedorFrete tipoProvedorFrete;
    
    public Frete(double valor, TipoProvedorFrete tipoProvedorFrete) {
        this.valor = valor;
        this.tipoProvedorFrete = tipoProvedorFrete;
    }

    public double getValor() {
        return this.valor;
    }

    public TipoProvedorFrete getTipoProvedorFrete() {
        return this.tipoProvedorFrete;
    }
}
