import java.util.List;
import java.util.ArrayList;
public class ConsultaProdutos  {
    public static List<Produto> filtrar (List<Produto> input, CriterioFiltro criterio) {
        List<Produto> output = new ArrayList<>();
        for(Produto produto: input) {
            if(criterio.testar(produto)) {
                output.add(produto);
            }
        }
        return output;
    }
}
