package model.Sugerencias;
/*
Seria algo parecido al adapter, pero el objetivo de esto no es adaptar la interface
de ambas clases, sino intentar estar en medio de los componentes que interactuan
para cumplir los requerimientos del dominio. No lo podria implementar en el componente externo,
ya que el componente externo puede tener un comportamiento definido e inmutable.

En este caso cada prenda sugerida tiene que ser notificada sobre su sugerencia, cosa que
no pasaria si no pasaramos por este lugar.
*/

import model.Guardarropas.Atuendo;
import model.Prendas.Prenda;

import java.util.List;

public class GeneradorSugerencias{
    GeneradorSugerenciasExterno generadorPosta;

    public GeneradorSugerencias(GeneradorSugerenciasExterno generadorPosta){
        this.generadorPosta = generadorPosta;
    }

    public Atuendo generarSugerencia(List<Prenda> prendas){
        return generadorPosta.generarSugerencia(prendas);
    }
}