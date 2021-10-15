package server;

import controller.GuardarropaController;
import controller.IndexController;
import controller.PrendaController;
import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class Server {

  public static void main(String[] args) {
    HandlebarsTemplateEngine engine = new HandlebarsTemplateEngine();
    GuardarropaController guardarropa = new GuardarropaController();
    PrendaController prendaController = new PrendaController();
    IndexController index = new IndexController();

    Spark.port(9000);
    Spark.get("/", index::redirigir);
    Spark.get("/QMP", index::getIndex, engine);
    Spark.get("/QMP/guardarropa/:id", guardarropa::buscarGuardarropa, engine);
    Spark.get("/QMP/guardarropa/:guardarropa/prenda/:prenda", prendaController::visualizacionPrenda, engine);
    Spark.delete("QMP/prenda/:id", prendaController::eliminacionPrenda);
    Spark.put("QMP/prenda", prendaController::creacionPrenda, engine);
    Spark.patch("QMP/prenda/:id", prendaController::edicionPrenda, engine);
  }

}