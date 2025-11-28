import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
public class ConsultaProdutos  {
    public static List<Produto> filtrar (List<Produto> input, Predicate<Produto> criterio) {
        List<Produto> output = new ArrayList<>();
        for(Produto produto: input) {
            if(criterio.test(produto)) {
                output.add(produto);
            }
        }
        return output;
    }
}
