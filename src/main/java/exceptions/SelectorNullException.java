package exceptions;

public class SelectorNullException extends RuntimeException{
  public SelectorNullException(String errorMessage){
    super(errorMessage);
  }
}