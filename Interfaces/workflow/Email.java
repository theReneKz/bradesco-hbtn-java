public class Email implements CanalNotificacao {
    public void notificar(Mensagem mensagem) {
        System.out.println(String.format("[EMAIL] {%s} - %s", mensagem.tipoMensagem.name(), mensagem.texto));
    }
}
