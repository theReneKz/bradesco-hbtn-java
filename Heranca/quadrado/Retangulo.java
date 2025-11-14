public class Retangulo extends FormaGeometrica {

    public Retangulo() {

    }

    protected double largura;
    protected double altura;

    public void setLargura(double largura) {
        if(largura >= 0) {
            this.largura = largura;
        } else {
            throw new java.lang.IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }
    }

    public double getLargura() {
        return this.largura;
    }

    public void setAltura(double altura) {
        if(altura >= 0) {
            this.altura = altura;
        } else {
            throw new java.lang.IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }
    }

    public double getAltura() {
        return this.altura;
    }

    public double area(){
        return getAltura() * getLargura();
    }

    public String toString() {
       return String.format("[Retangulo] %.2f / %.2f", getLargura(), getAltura());
    }

}
