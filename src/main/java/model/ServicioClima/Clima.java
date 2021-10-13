package model.ServicioClima;

public class Clima{
    Double temperatura;
    Double humedad;

    public Clima(Double temperatura, Double humedad){
        this.temperatura = temperatura;
        this.humedad = humedad;
    }

    public Double getTemperatura(){
        return temperatura;
    }
}