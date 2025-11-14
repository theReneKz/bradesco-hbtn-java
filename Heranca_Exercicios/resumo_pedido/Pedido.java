import java.lang.StringBuilder;
import produtos.*;
public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;
    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal () {
        double total = 0;
        for(ItemPedido item: itens) {
            total += (item.getProduto().obterPrecoLiquido() * item.getQuantidade());
        }
        total = total - (total * percentualDesconto) /100;
        
        return total;
    }
    public void apresentarResumoPedido(){
        StringBuilder builder = new StringBuilder();
        builder.append("------ RESUMO PEDIDO -------\n");
        double valorTotal = 0;
        for(ItemPedido item: itens) {
            String tipo = item.getProduto() instanceof Livro ? "Livro" : "Dvd";
            builder.append(String.format("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n", tipo, item.getProduto().getTitulo(), item.getProduto().obterPrecoLiquido(), item.getQuantidade(), (item.getProduto().obterPrecoLiquido() * item.getQuantidade())));
            valorTotal += item.getProduto().obterPrecoLiquido() * item.getQuantidade();
        }
        builder.append("----------------------------\n");
        builder.append(String.format("DESCONTO: %.2f\n", (valorTotal - calcularTotal())));
        builder.append(String.format("TOTAL PRODUTOS:  %.2f\n", valorTotal));
        builder.append("----------------------------\n");
        builder.append(String.format("TOTAL PEDIDO: %.2f\n", calcularTotal()));
        builder.append("----------------------------\n");
        System.out.print(builder.toString());
    }
}
