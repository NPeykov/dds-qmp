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
  EstadoPrenda estado;
  Double temperaturaMaxima;


  public Prenda(TipoPrenda tipoPrenda, Material material, Trama trama, Color colorPrimario, Color colorSecundario) {
    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.trama = trama;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.estado = EstadoPrenda.NUEVA;
  }

  public boolean esAptaParaTemperatura(Double temperatura){
    return temperaturaMaxima  > temperatura;
  }

  public Categoria getCategoria(){
    return this.tipoPrenda.getCategoria();
  }

  public void fueSugerida(){
    this.estado = estado.evaluarSiMuta();
  }

  public void lavar(){
    if(this.estado == EstadoPrenda.PERCUDIDA)
      throw new PrendaPercudidaException("No podes lavar una ropa percudida!");
    this.estado = estado.LAVANDOSE;
  }

  public void fueLavada(){
    this.estado = estado.dejarComoNueva();
  }

}
