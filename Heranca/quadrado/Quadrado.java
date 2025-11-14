public class Quadrado extends Retangulo{
    private double lado;

    public void setLado(double lado) {
        if(lado >= 0) {
            this.lado = lado;
            super.altura = lado;
            super.largura = lado;
        } else {
            throw new java.lang.IllegalArgumentException("Lado deve ser maior ou igual a 0");
        }
    }

    public double getLado() {
        return this.lado;
    }

    public String toString() {
       return String.format("[Quradrado] %.2f", getLado());
    }
}
