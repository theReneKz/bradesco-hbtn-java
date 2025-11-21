import exceptions.*;
public class ContaBancariaControlada extends ContaBancariaBasica {
    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada (String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    public void aplicarAtualizacaoMensal () {
        super.aplicarAtualizacaoMensal();
        if(getSaldo() < this.saldoMinimo) {
            super.saldo = getSaldo() - this.valorPenalidade;
        }
    }
}
