public class Slack implements CanalNotificacao {
    public void notificar(Mensagem mensagem) {
        System.out.println(String.format("[SLACK] {%s} - %s", mensagem.tipoMensagem.name(), mensagem.texto));
    }
}
