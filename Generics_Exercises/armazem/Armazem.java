import java.util.Map;
import java.util.HashMap;

public class Armazem<T> implements Armazenavel<T> {
    private Map<String, T> map;

    public Armazem() {
        this.map = new HashMap<>();
    }
    public void adicionarAoInventario(String nome, T item) {
        this.map.put(nome, item);
    }
    public T obterDoInventario (String nome) {
        return this.map.get(nome);
    }
}
