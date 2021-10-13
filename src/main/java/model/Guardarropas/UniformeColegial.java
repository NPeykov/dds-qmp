package model.Guardarropas;

import model.Prendas.Prenda;

public abstract class UniformeColegial{
    
   public Atuendo generarUniforme(){
       return new Atuendo(hacerParteSuperior(), hacerParteInferior(), hacerCalzado());
   }

   public abstract Prenda hacerParteSuperior();
   public abstract Prenda hacerParteInferior();
   public abstract Prenda hacerCalzado();
}