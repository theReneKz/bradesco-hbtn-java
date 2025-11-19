public class Teams implements CanalNotificacao {
    public void notificar(Mensagem mensagem) {
        System.out.println(String.format("[TEAMS] {%s} - %s", mensagem.tipoMensagem.name(), mensagem.texto));
    }
}
