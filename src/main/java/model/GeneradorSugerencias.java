
/*
Seria algo parecido al adapter, pero el objetivo de esto no es adaptar la interface
de ambas clases, sino intentar estar en medio de los componentes que interactuan
para cumplir los requerimientos del dominio. No lo podria implementar en el componente externo,
ya que el componente externo puede tener un comportamiento definido e inmutable.

En este caso cada prenda sugerida tiene que ser notificada sobre su sugerencia, cosa que
no pasaria si no pasaramos por este lugar.
*/

public class GeneradorSugerencias{
    GeneradorSugerenciasExterno generadorPosta;

    public GeneradorSugerencias(GeneradorSugerenciasExterno generadorPosta){
        this.generadorPosta = generadorPosta;
    }

    public Atuendo generarSugerencia(){
        Atuendo atuendoSugerido = generadorPosta.generarSugerencia(); 
        
        atuendoSugerido.forEach(prenda -> prenda.fueSugerida());

        return atuendoSugerido;
    }

    public Prenda generarParteSuperior();
    public Prenda generarParteInferior();
    public Prenda generarCalzado();
    public Prenda generarAccesorio();
}