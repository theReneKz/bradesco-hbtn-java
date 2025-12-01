public class Principal {
    public static void main(String args[]) {
        Contador contador = new Contador();
        ThreadContador contador1 = new ThreadContador(contador);
        ThreadContador contador2 = new ThreadContador(contador);

        contador1.start();
        contador2.start();

        System.out.println(String.format("Valor final do contador: %d", contador.getContagem()));
    }
}
