package model.Guardarropas;

import model.Prendas.Prenda;

public class Atuendo {
    Prenda parteSuperior;
    Prenda parteInferior;
    Prenda calzado;
    Prenda accesorio;

    public Atuendo(Prenda parteSuperior, Prenda parteInferior, Prenda calzado){
        this.parteSuperior = parteSuperior;
        this.parteInferior = parteInferior;
        this.calzado = calzado;
    }

    public Atuendo(Prenda parteSuperior, Prenda parteInferior, Prenda calzado, Prenda accesorio){
        this.parteSuperior = parteSuperior;
        this.parteInferior = parteInferior;
        this.calzado = calzado;
        this.accesorio = accesorio;
    }
}