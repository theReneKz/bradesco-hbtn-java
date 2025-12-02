import java.util.Random;
public class Produtor implements Runnable{
    private Fila fila;
    public Produtor(Fila fila) {
        this.fila = fila;
    }

    @Override
    public synchronized void run() {
        while(true) {
            if(!this.fila.isFilaCheia()) {
                Random gerador = new Random();
                int num = gerador.nextInt(100);
                this.fila.adicionar(num);
            }
        }
    }
	}

