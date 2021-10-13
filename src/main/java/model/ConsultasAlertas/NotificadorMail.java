package model.ConsultasAlertas;

import java.util.List;

public class NotificadorMail implements Interesado{
    Mailer mailSender;
    String destinatario;

    @Override
    public void recibirNotificacion(List<String> alertas){
        mailSender.agregarDestinatario(destinatario);
        String mensajeAEnviar = String.join(", ", alertas);
        mailSender.notify(mensajeAEnviar);
    }
}