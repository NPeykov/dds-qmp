package model.ConsultasAlertas;

import java.util.List;

public class Mailer implements NotificationService {
  List<String> destinatarios;

  @Override
  public void notify(String mensaje) {

  }

  public void agregarDestinatario(String destinatario) {
    this.destinatarios.add(destinatario);
  }

}
