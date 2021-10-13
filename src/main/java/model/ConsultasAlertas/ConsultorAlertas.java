package model.ConsultasAlertas;

import model.ServicioClima.ServicioClimatico;

import java.util.List;

public class ConsultorAlertas{
    ServicioClimatico servicioClimatico;
    List<Interesado> interesados;

    public void consultarClima(String ciudad){
        List<String> alertas = servicioClimatico.getAlertas(ciudad);
        if(!alertas.isEmpty()){
            interesados.forEach(i -> i.recibirNotificacion(alertas));     
        }
    }

    public void agregarInteresado(Interesado interesado){
        this.interesados.add(interesado);
    }

    public void eliminarInteresado(Interesado interesado){
        this.interesados.remove(interesado);
    }
}