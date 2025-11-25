import java.util.List;
import java.util.ArrayList;
public class Biblioteca <T extends Midia> {
    List<T> lista;

    public Biblioteca() {
        this.lista = new ArrayList<>();
    }

    public void adicionarMidia(T midia) {
        this.lista.add(midia);
    }

    public String obterListaMidias() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[");
        if(lista.size() > 0) {
            for(T midia: lista) {
                buffer.append(midia.toString());
                buffer.append(", ");
            }
            buffer.deleteCharAt(buffer.length() - 1);
            buffer.deleteCharAt(buffer.length() - 1);
        }
        buffer.append("]");
        return buffer.toString();
    }
}
