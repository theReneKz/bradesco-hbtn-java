package provedores;
public class Sedex implements ProvedorFrete{
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete = 0;
        if(peso > 1000) {
            valorFrete = valor * 0.1;
        } else {
            valorFrete = valor * 0.05;
        }
        return new Frete(valorFrete, obterTipoProvedorFrete());
    }

    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
