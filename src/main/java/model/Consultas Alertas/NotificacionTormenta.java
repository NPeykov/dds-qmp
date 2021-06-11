public class NotificacionTormenta implements Interesado{
    NotificationService notificador;

    @Override
    public void recibirNotificacion(List<String> alertas){
        if(alertas.contains("STORM")){
            notificador.notify("Se viene la lluvia");
        }
    }

}