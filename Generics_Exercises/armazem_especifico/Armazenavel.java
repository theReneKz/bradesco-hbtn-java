public interface Armazenavel<T> {
    public void adicionarAoInventario(String nome, T item);
    public T obterDoInventario (String nome);
}
