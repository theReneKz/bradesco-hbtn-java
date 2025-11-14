public class Empregado {
    private double salarioFixo ;
    public Empregado(double salarioFixo ) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularBonus(Departamento departamento) {
        double bonus = 0;
        if(departamento.alcancouMeta()) {
            bonus = this.getSalarioFixo() * 0.1;
        }
        return bonus;
    }

    public double calcularSalarioTotal(Departamento departamento) {
        return getSalarioFixo() + calcularBonus(departamento);
    }

    public double getSalarioFixo() {
        return this.salarioFixo;
    }
}
