package model.Sugerencias;

import model.Guardarropas.Atuendo;
import model.Guardarropas.Guardarropa;
import model.Prendas.Prenda;
import model.ServicioClima.Clima;
import model.ServicioClima.ServicioClimatico;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SelectorPrendas{
    ServicioClimatico servicioClimatico;
    GeneradorSugerencias generador;

    public SelectorPrendas(ServicioClimatico servicioClimatico, GeneradorSugerencias generador){
        this.servicioClimatico = servicioClimatico;
        this.generador = generador;
    }

    public Atuendo generarSugerenciaAcordeAlClima(String ciudad, Guardarropa guardarropa){
        Double temperatura = getTemperaturaActual(ciudad);
        List<Prenda> prendasValidasParaClimaActual = combinacionesPrendas(guardarropa)
            .stream()
            .filter(p -> p.esAptaParaTemperatura(temperatura))
            .collect(Collectors.toList());
        return generador.generarSugerencia(prendasValidasParaClimaActual);
    }

    public Double getTemperaturaActual(String ciudad){
        Clima climaActual = servicioClimatico.getClima(ciudad);
        return climaActual.getTemperatura();
    }

    public List<Prenda> combinacionesPrendas(Guardarropa guardarropa){
        return new ArrayList<Prenda>();//TODO
    }
}