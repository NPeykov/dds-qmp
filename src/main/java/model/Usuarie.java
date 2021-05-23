
public class Usuarie {
    Guardarropa guardarropa = new ArrayList<>();
    GeneradorSugerencias generadorSugerencias;

    //Creo que inyectar la dependencia del generador de esta forma es algo coherente.
    //De esta forma el que instancie un usuarie se ve OBLIGADO a ponerlo.
    //Y de alguna forma es lógico, porque la app se trata de esto, de generar sugerencias.
    //
    //Podria settearlo posteriormente, pero en ese caso corro el riesgo que
    //el que lo instancie se olvide de settearlo e intente generar algun atuendo.

    public Usuarie(GeneradorSugerencias generadorSugerencias){
        if(generadorSugerencias == null)
            throw new GeneradorNullException("No asignaste un generador!");
        this.generadorSugerencias = generadorSugerencias;
    }

    public void setGuardarropa(Guardarropa guardarropa){
        this.guardarropa = guardarropa;
    }
}