public class AccuWeatherAdapter extends ServicioClimatico{
    AccuWeatherAPI servicioClimatico;

    @Override
    public Clima getClima(String ciudad){
        List<Map<String, Object>> condicionesClimaticas = servicioClimatico.getWeather(ciudad);
        Double temperatura = condicionesClimaticas.get(0).get("Temperature");
        Double humedad = condicionesClimaticas.get(0).get("PrecipitationProbability");
        return new Clima(temperatura, humedad);
    }

}