package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrendaTests {

  @Test
  void pruebaSetteoEntorno(){
    Prenda nuevaPrenda = new Prenda();
    assertEquals(2, nuevaPrenda.devuelve2());
  }
}
