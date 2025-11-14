public class Gerente extends Empregado {
    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @override
    public double calcularBonus(Departamento departamento) {
        double bonus = 0;
        if(departamento.alcancouMeta()) {
            bonus = (this.getSalarioFixo() * 0.2) + (departamento.getValorAtingidoMeta() - departamento.getValorMeta())*0.01;
        }
        return bonus;
    }
}
