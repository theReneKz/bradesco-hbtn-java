public class SistemaFilas {
    public static void main (String args[]) {
        try {
            Fila fila = new Fila();
            Thread  consumidor1 = new Thread (new Consumidor(fila));
            Thread  consumidor2 = new Thread (new Consumidor(fila));
            Thread  produtor1 = new Thread (new Produtor(fila));
            Thread  produtor2 = new Thread (new Produtor(fila));

            produtor1.start();
            produtor2.start();
            consumidor1.start();
            consumidor2.start();

            Thread.sleep(20000);
            System.out.println(fila.toString());
            System.exit(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
