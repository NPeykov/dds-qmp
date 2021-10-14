package controller;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class BibliotecaController {

  public ModelAndView getBiblioteca(Request request, Response response) {
    String idBiblioteca = request.queryParamOrDefault("id", "null");
    return new ModelAndView(idBiblioteca, "biblioteca.html.hbs");
  }

}
