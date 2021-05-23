package model;

import Exceptions.ColorPrimarioNullException;
import Exceptions.MaterialNullException;
import Exceptions.TipoPrendaNullException;

public class BorradorPrenda {
  TipoPrenda tipoPrenda;
  Material material;
  Trama trama;
  Color colorPrimario;
  Color colorSecundario;



  public Prenda crearPrenda(TipoPrenda tipoPrenda, Material material, Trama trama, Color colorPrimario, Color colorSecundario) {
    if(tipoPrenda == null){
      throw new TipoPrendaNullException("Debe ingresar un tipo de prenda!");
    }
    if(material == null){
      throw new MaterialNullException("Debe ingresar el material de la prenda!");
    }
    if(colorPrimario == null){
      throw new ColorPrimarioNullException("Debe ingresar un color primario de la prenda!");
    }

    trama = trama == null ? Trama.LISA : trama;

    return new Prenda(tipoPrenda, material, trama, colorPrimario, colorSecundario);
  }

}
