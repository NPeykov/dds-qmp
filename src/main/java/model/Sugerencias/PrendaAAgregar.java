public class PrendaAAgregar extends Recomendaciones{

    @Override
    public void aplicarseA(Usuarie usuarie){
        usuarie.agregarPrenda(prenda);
    }
}