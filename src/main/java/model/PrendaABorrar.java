public class PrendaABorrar extends Recomendaciones{

    @Override
    public void aplicarseA(Usuarie usuarie){
        usuarie.eliminarPrenda(prenda);
    }
}