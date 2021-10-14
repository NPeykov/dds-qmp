package exceptions;

public class PrendaPercudidaException extends RuntimeException{
  public PrendaPercudidaException(String errorMessage){
    super(errorMessage);
  }
}