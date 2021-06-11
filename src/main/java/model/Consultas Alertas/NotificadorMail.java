public class NotificadorMail implements Interesado{
    Mailer mailSender;
    String destinatario;

    @Override
    public void recibirNotificacion(List<String> alertas){
        mailSender.send(destinatario, alertas));
    }
}