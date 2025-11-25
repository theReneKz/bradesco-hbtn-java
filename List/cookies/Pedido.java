import java.util.ArrayList;
public class Pedido {
    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie (PedidoCookie pedidoCookie) {
        this.cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas () {
        int total = 0;
        for(PedidoCookie pedidoCookie: this.cookies) {
            total += pedidoCookie.getQuantidadeCaixas();
        }
        return total;
    }

    public int removerSabor(String sabor) {
        int total = 0;
        for(int i = (this.cookies.size() - 1); i >= 0; i--) {
            PedidoCookie pedidoCookie = this.cookies.get(i);
            if(pedidoCookie.getSabor().equals(sabor)) {
                total += pedidoCookie.getQuantidadeCaixas();
                this.cookies.remove(i);
            }
        }
        return total;
    }
}
