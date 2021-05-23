
public class GeneradorSugerenciasExterno{

    //Seria un componente externo (por lo que tengo entendido).
    //Planteo mas o menos como seria la interfaz 'esperada'.
    //Esta clase deberia ser llamada de algun lugar interesado en generar una sugernecia.
    //Analoga a la clase uniformeColegial

    public Atuendo generarSugerencia(){
        return new Atuendo(
            generarParteSuperior(),
            generarParteInferior(),
            generarCalzado(),
            generarAccesorio()
            );
    }

    public Prenda generarParteSuperior();
    public Prenda generarParteInferior();
    public Prenda generarCalzado();
    public Prenda generarAccesorio();
}