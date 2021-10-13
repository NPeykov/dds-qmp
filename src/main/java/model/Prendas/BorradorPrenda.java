package model.Prendas;

import Exceptions.ColorPrimarioNullException;
import Exceptions.MaterialNullException;
import Exceptions.TipoPrendaNullException;


public class BorradorPrenda {
  TipoPrenda tipoPrenda;
  Material material;
  Trama trama;
  Color colorPrimario;
  Color colorSecundario;

  public BorradorPrenda(TipoPrenda tipoPrenda){
    if(tipoPrenda == null){
      throw new TipoPrendaNullException("Debe ingresar un tipo de prenda!");
    }

    this.tipoPrenda = tipoPrenda;
  }

  public void agregarMaterial(Material material){
    if(material == null){
      throw new MaterialNullException("Debe ingresar el material de la prenda!");
    }

    this.material = material;
  }


  public void agregarColorPrimario(Color colorPrimario){
    if(colorPrimario == null){
      throw new ColorPrimarioNullException("Debe ingresar un color primario de la prenda!");
    }

    this.colorPrimario = colorPrimario;
  }

  public void agregarColorSecundario(Color colorSecundario){
    this.colorSecundario = colorSecundario;
  }

  public void agregarTrama(Trama trama){
    this.trama = trama;
  }

  public Prenda crearPrenda() {
    if(tipoPrenda == null){
      throw new TipoPrendaNullException("Debe ingresar un tipo de prenda!");
    }
    if(material == null){
      throw new MaterialNullException("Debe ingresar el material de la prenda!");
    }
    if(colorPrimario == null){
      throw new ColorPrimarioNullException("Debe ingresar un color primario de la prenda!");
    }

    this.trama = trama == null ? Trama.LISA : trama;

    return new Prenda(tipoPrenda, material, trama, colorPrimario, colorSecundario);
  }

}
