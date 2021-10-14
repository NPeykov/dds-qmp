package controller;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class IndexController {

  public ModelAndView getIndex(Request request, Response response) {
    return new ModelAndView(request, "index.html.hbs");
  }

  public Void redirigir(Request request, Response response) {
    response.redirect("/QMP");
    return null;
  }

}
