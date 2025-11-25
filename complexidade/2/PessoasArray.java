public class PessoasArray {

    private String[] nomes;

    public PessoasArray() {
        nomes =new String[]{"Amanda", "Beatriz", "Carlos","Daniela","Eduardo",
                "Fabio","Gustavo", "Hingrid","Isabela","Joao","Leise","Maria",
                "Norberto","Otavio","Paulo", "Quirino","Renata","Sabata",
                "Tais","Umberto","Vanessa","Xavier"};
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    // implementar o método de buscaBinaria
    public void buscaBinaria(String nome){
        System.out.println("Procurando o nome: \""+nome+"\"");
        boolean encontrado = false;
        int inf = 0;
        int sup = nomes.length - 1;
        int meio;
        while (inf <= sup) {
            meio = (inf + sup )/2;
            System.out.println("Passando pelo indice: " + meio);
            if(this.nomes[meio].equals(nome)) {
                encontrado = true;
                System.out.println("Nome Isabela encontrado na posição " + meio);
                break;
            } else  {
                if(Character.getNumericValue(nome.charAt(0)) < Character.getNumericValue(this.nomes[meio].charAt(0))) {
                    sup = meio - 1;
                } else {
                    inf = meio + 1;
                }
            }
        }
        if(!encontrado)throw new IllegalArgumentException("O nome "+nome+" não se encontra no array de nomes");
    }
}

