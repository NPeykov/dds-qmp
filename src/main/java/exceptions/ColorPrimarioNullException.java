package exceptions;

public class ColorPrimarioNullException extends RuntimeException{
  public ColorPrimarioNullException(String errorMessage){
    super(errorMessage);
  }
}