package model.Sugerencias;

import model.Prendas.Prenda;
import model.Usuarie;

public class PrendaAAgregar implements Recomendacion {
    Prenda prenda;
    @Override
    public void aplicarseA(Usuarie usuarie){
        usuarie.agregarPrenda(prenda);
    }
}