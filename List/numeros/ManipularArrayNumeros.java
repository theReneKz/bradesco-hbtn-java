import java.util.List;
import java.util.ArrayList;
public class ManipularArrayNumeros {
    public static int buscarPosicaoNumero(List<Integer> lista, int numero) {
        for(int i = 0; i < lista.size(); i++) {
            if(numero == lista.get(i).intValue()) {
                return i;
            }
        }
        return -1;
    }

    public static void adicionarNumero(List<Integer> lista, int numero) {
        if(buscarPosicaoNumero(lista, numero) > 0) {
            throw new IllegalArgumentException("Numero jah contido na lista");
        } else {
            lista.add(numero);
        }
    }

    public static void removerNumero(List<Integer> lista, int numero) {
        int posicao = buscarPosicaoNumero(lista, numero);
        if(posicao < 0) {
            throw new IllegalArgumentException("Numero jah contido na lista");
        } else {
            lista.remove(posicao);
        }
    }

    public static void substituirNumero(List<Integer> lista, int numeroSubstituir, int numeroSubstituto) {
        int posicao = buscarPosicaoNumero(lista, numeroSubstituir);
        if(posicao < 0) {
            lista.add(numeroSubstituto);
        } else {
            lista.remove(posicao);
            lista.add(posicao, numeroSubstituto);
        }
    }
}
