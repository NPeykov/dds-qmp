package exceptions;

public class TipoPrendaNullException extends RuntimeException{
  public TipoPrendaNullException(String errorMessage){
    super(errorMessage);
  }
}
