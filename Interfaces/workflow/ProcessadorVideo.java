import java.util.List;
import java.util.ArrayList;
public class ProcessadorVideo {
    public List<CanalNotificacao> canais;

    public ProcessadorVideo() {
        this.canais = new ArrayList<>();
    }

    public void registrarCanal (CanalNotificacao canal) {
        this.canais.add(canal);
    }

    public void processar(Video video) {
        for(CanalNotificacao canal: canais) {
            canal.notificar(new Mensagem(String.format("%s - %s", video.arquivo, video.formato.toString()), TipoMensagem.LOG));
        }
    }
}
