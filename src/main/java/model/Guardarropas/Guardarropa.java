package model.Guardarropas;

import model.Prendas.Prenda;

import java.util.ArrayList;
import java.util.List;

public abstract class Guardarropa{
    List<Prenda> prendas = new ArrayList<Prenda>();

    public void agregarPrenda(Prenda prenda) {
        this.prendas.add(prenda);
    }

    public void removerPrenda(Prenda prenda) {
        this.prendas.remove(prenda);
    }
}