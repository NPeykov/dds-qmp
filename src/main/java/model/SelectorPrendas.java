public class SelectorPrendas{
    ServicioClimatico servicioClimatico;
    GeneradorSugerencias generador;

    public SelectorPrendas(ServicioClimatico servicioClimatico, GeneradorSugerencias generador){
        this.servicioClimatico = servicioClimatico;
        this.generador = generador;
    }

    public Atuendo generarSugerenciaAcordeAlClima(String ciudad, Guardarropa guardarropa){
        Double temperatura = getTemperaturaActual(ciudad);
        List<Prendas> prendasValidasParaClimaActual = combinacionesPrendas(guardarropa)
            .filter(prenda -> prenda.esAptaParaTemperatura(temperatura));
        return generador.generarSugerencia(prendasValidasParaClimaActual);
    }

    public Double getTemperaturaActual(String ciudad){
        Clima climaActual = servicioClimatico.getClima(ciudad);
        return climaActual.getTemperatura();
    }

    public List<Prendas> combinacionesPrendas(Guardarropa guardarropa){
        //TODO
    }
}