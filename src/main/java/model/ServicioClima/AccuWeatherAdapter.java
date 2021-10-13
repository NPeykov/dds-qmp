package model.ServicioClima;

import java.util.List;
import java.util.Map;

public class AccuWeatherAdapter implements ServicioClimatico {
    AccuWeatherAPI servicioClimatico;

    @Override
    public Clima getClima(String ciudad){
        List<Map<String, Object>> condicionesClimaticas = servicioClimatico.getWeather(ciudad);
        Double temperatura = (Double) condicionesClimaticas.get(0).get("Temperature");
        Double humedad = (Double) condicionesClimaticas.get(0).get("PrecipitationProbability");
        return new Clima(temperatura, humedad);
    }

    @Override
    public List<String> getAlertas(String ciudad){
        Map<String, List<String>> alertas = servicioClimatico.getAlerts("Buenos Aires");
        return alertas.get("CurrentAlerts"); //Devuelve un objeto como [“STORM”, “HAIL”, ...]
    }

}