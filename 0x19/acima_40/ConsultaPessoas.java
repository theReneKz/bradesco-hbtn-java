import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;
public class ConsultaPessoas {
    public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> input) {
        return input.stream().collect(Collectors.groupingBy(Pessoa::getCargo));
    }

    public static Map<String, List<Integer>> obterIdadePorCargo (List<Pessoa> input) {
        return input.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.mapping(Pessoa::getIdade, Collectors.toList())));
    }

    public static Map<String, List<Pessoa>> obterPessoasPorCargoAcimaDe40anos(List<Pessoa> input) {
        Predicate<Pessoa> predicatePessoa = (pessoa) -> pessoa.getIdade() > 40;
         return input.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.filtering(predicatePessoa, Collectors.toList())));
    }
}
