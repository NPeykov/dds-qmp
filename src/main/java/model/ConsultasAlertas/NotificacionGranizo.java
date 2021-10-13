package model.ConsultasAlertas;

import java.util.List;

public class NotificacionGranizo implements Interesado {
    NotificationService notificador;

    @Override
    public void recibirNotificacion(List<String> alertas){
        if(alertas.contains("HAIL")){
            notificador.notify("Posible caida de granizo!!");
        }
    }

}