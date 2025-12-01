import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Collections;
import java.util.stream.Collectors;
public class ConsultaPessoas {
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> input) {
        return input.stream().collect(Collectors.groupingBy(Pessoa::getCargo, () -> new TreeMap<String, TreeSet<Pessoa>>(Collections.reverseOrder()), Collectors.toCollection(TreeSet::new)));
    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> input) {
        return input.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));
    }
}
