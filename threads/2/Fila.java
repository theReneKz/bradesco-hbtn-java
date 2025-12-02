import java.util.LinkedList;
public class Fila {
    private LinkedList<Integer> fila;
    private static final int MAX = 10;

    public Fila() {
        this.fila = new LinkedList<>();
    }

    public synchronized void adicionar(int item) {
        try {
            if(!isFilaCheia()) {
                this.fila.addLast(item);
                notify();
            } else {
                wait();
            }
        } catch  (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized int retirar() {
        try {
            if(!isFilaVazia()) {
                int valor = this.fila.get(0);
                this.fila.remove(0);
                notify();
                return valor;
            } else {
                wait();
            }
        } catch  (InterruptedException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public synchronized boolean isFilaCheia() {
        return this.fila.size() == MAX;
    }

    public synchronized boolean isFilaVazia() {
        return this.fila.isEmpty();
    }

    @Override
    public String toString() {
        return this.fila.toString();
    }
}
