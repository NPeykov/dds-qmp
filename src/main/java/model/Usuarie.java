package model;

import exceptions.SelectorNullException;
import model.Guardarropas.Atuendo;
import model.Guardarropas.Guardarropa;
import model.Prendas.Prenda;
import model.Sugerencias.Recomendacion;
import model.Sugerencias.SelectorPrendas;

import java.util.ArrayList;
import java.util.List;

public class Usuarie {
    Guardarropa guardarropa;
    SelectorPrendas selectorPrendas;
    List<Recomendacion> recomendaciones = new ArrayList<>();

    //Creo que inyectar la dependencia del selector de prendas para una determinada estacion del año
    //de esta forma es algo coherente.
    //
    //Podria settearlo posteriormente, pero en ese caso corro el riesgo que
    //el que instancie se olvide de settearlo e intente generar algun atuendo.

    public Usuarie(SelectorPrendas selectorPrendas){
        if(selectorPrendas == null)
            throw new SelectorNullException("No asignaste un selector!");
        this.selectorPrendas = selectorPrendas;
    }

    public void setGuardarropa(Guardarropa guardarropa){
        this.guardarropa = guardarropa;
    }

    public Atuendo obtenerSugerencia(String ciudad){
        return selectorPrendas.generarSugerenciaAcordeAlClima(ciudad, guardarropa);
    }

    public void aceptarRecomendacion(Recomendacion recomendacion){
        recomendacion.aplicarseA(this);
        recomendaciones.remove(recomendacion);
    }

    public void agregarPrenda(Prenda prenda){
        guardarropa.agregarPrenda(prenda);
    }

    public void eliminarPrenda(Prenda prenda){
        guardarropa.removerPrenda(prenda);
    }

}