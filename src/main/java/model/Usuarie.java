
public class Usuarie {
    Guardarropa guardarropa = new ArrayList<>();
    SelectorPrendas selectorPrendas;

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
}