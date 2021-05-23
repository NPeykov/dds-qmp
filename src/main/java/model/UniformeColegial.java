
public abstract class UniformeColegial{
    
   public Atuendo generarUniforme(){
       return new Atuendo(hacerParteSuperior(), hacerParteInferior(), hacerCalzado());
   }

   public Prenda hacerParteSuperior();
   public Prenda hacerParteInferior();
   public Prenda hacerCalzado();
}