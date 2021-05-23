package Exceptions;

public class GeneradorNullException extends RuntimeException{
  public GeneradorNullException(String errorMessage){
    super(errorMessage);
  }
}