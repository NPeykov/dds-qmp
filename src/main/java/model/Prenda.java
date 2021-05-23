package model;

import Exceptions.ColorPrimarioNullException;
import Exceptions.MaterialNullException;
import Exceptions.TipoPrendaNullException;

public class Prenda {
  TipoPrenda tipoPrenda;
  Material material;
  Trama trama;
  Color colorPrimario;
  Color colorSecundario;


  public Prenda(TipoPrenda tipoPrenda, Material material, Trama trama, Color colorPrimario, Color colorSecundario) {
    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.trama = trama;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  public Categoria getCategoria(){
    return this.tipoPrenda.getCategoria();
  }
}
