import java.util.List;
import java.util.ArrayList;
public class Consulta {
    public static List<Produto> obterLivrosDoPedido (Pedido pedido) {   
        List<Produto> result = new ArrayList<>();
        for(Produto produto: pedido.getProdutos()) {
            if(produto.getCategoria() == CategoriaProduto.LIVRO) {
                result.add(produto);
            }
        }
        return result;
    }
}
