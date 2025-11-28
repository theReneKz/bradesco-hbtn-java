import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;
import java.util.stream.Collectors;
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

    public static List<Produto> obterProdutosPorPrecoMinimo (List<Produto> produtos, double precoMinimo) {
        return produtos.stream().filter((produto) -> produto.getPreco() > precoMinimo).collect(Collectors.toList());
    }
}
