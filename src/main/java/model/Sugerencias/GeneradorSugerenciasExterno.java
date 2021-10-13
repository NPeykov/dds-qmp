package model.Sugerencias;

import model.Guardarropas.Atuendo;
import model.Prendas.Prenda;

import java.util.List;

public interface GeneradorSugerenciasExterno{

    public Atuendo generarSugerencia(List<Prenda> prendas);
}