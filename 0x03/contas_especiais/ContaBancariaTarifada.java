import exceptions.*;
public class ContaBancariaTarifada extends ContaBancariaBasica{
    private int quantidadeTransacoes;
    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
        this.quantidadeTransacoes = 0;
    }
    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        super.depositar(valor);
        aplicaTransacao();
    }
    @Override
    public void sacar(double valor) throws OperacaoInvalidaException{ 
        super.sacar(valor);
        aplicaTransacao();
    }

    private void aplicaTransacao() {
        this.quantidadeTransacoes++;
        super.saldo = getSaldo() - (getQuantidadeTransacoes() * 0.1);
    }

    public int getQuantidadeTransacoes() {
        return this.quantidadeTransacoes;
    }
}
