package controller;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class GuardarropaController {

  public ModelAndView buscarGuardarropa(Request request, Response response) {
    String idGuardarropa = request.params("id");
    return new ModelAndView(idGuardarropa, "guardarropa.html.hbs");
  }

}
