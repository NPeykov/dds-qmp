package Exceptions;

public class MaterialNullException extends RuntimeException{
  public MaterialNullException(String errorMessage){
    super(errorMessage);
  }
}