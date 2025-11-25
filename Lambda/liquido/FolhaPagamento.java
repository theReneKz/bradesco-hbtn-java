public class FolhaPagamento {
    public static double calcularLiquido (Funcionario funcionario, CalculadorDeSalario calc) {
        return calc.calcular(funcionario.getSalario());
    }
}
