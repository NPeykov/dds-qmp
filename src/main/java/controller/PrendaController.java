package controller;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class PrendaController {

  //Como usuario de QueMePongo, quiero crear una prenda desde el navegador
  public ModelAndView creacionPrenda(Request request, Response response) {
    //crear la prenda con los params
    return new ModelAndView(null, "creacion_prendas.html.hbs");
  }

  //Como usuarie de QueMePongo quiero ver una prenda en particular
  //que tengo en mi guardarropas para poder editarla
  public ModelAndView visualizacionPrenda(Request request, Response response) {
    String idGuardarropa = request.params("guardarropa");
    String idPrenda = request.params("prenda");
    //conseguir la prenda 'idPrenda' de la guardarropa 'idguardarropa'
    return new ModelAndView(null, "visualizacion-prenda.html.hbs");
  }

  //Como usuarie de QueMePongo, quiero poder eliminar una prenda de mi guardarropas
  public Void eliminacionPrenda(Request request, Response response) {
    String idPrenda = request.params("id");
    //eliminar la prenda del guardarropas
    return null;
  }

  public ModelAndView edicionPrenda(Request request, Response response) {
    String prendaAEditar = request.params("id");
    return new ModelAndView(null, "edicion-prenda.html.hbs");
  }
}
