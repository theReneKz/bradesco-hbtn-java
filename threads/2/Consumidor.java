public class Consumidor  implements Runnable{
    private Fila fila;

    public Consumidor(Fila fila) {
        this.fila = fila;
    }

    @Override
    public synchronized void run() {
        try {
            while(true) {
                if(!this.fila.isFilaVazia()) {
                    int num = this.fila.retirar();
                    Thread.sleep(500);
                }
            }
        } catch  (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
