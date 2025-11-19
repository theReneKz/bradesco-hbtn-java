public class Sms implements CanalNotificacao {
    public void notificar(Mensagem mensagem) {
        System.out.println(String.format("[SMS] {%s} - %s", mensagem.tipoMensagem.name(), mensagem.texto));
    }
}
