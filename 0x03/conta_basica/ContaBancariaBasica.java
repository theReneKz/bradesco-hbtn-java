import exceptions.*;
public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    public String getNumeracao() {
        return this.numeracao;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getTaxaJurosAnual() {
        return this.taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException{
        if(valor > 0) {
            this.saldo += valor;
        } else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException{
        if(valor > 0) {
            this.saldo = this.saldo - valor;
        } else {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }
    }

    public double calcularTarifaMensal() {
        double tarifa = 0;
        if((getSaldo() * 0.1) > 10) {
            tarifa = 10;
        } else {
            tarifa = getSaldo() * 0.1;
        }
        return tarifa;
    }

    public double calcularJurosMensal() {
        if(getSaldo() < 0) {
            return 0;
        } else {
            return getTaxaJurosAnual() / 12;
        }
    }

    public void aplicarAtualizacaoMensal() {
        this.saldo = this.saldo - calcularTarifaMensal() + (getSaldo() * calcularJurosMensal() / 100);
    }
}
