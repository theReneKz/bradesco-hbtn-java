import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;
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

    public static Produto obterProdutoMaiorPreco (List<Produto> produtos) {
        return  produtos.stream().sorted(Comparator.comparing(Produto::getPreco).reversed()).findFirst().get();

    }
}
