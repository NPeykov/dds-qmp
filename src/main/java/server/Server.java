package server;

import controller.BibliotecaController;
import controller.IndexController;
import spark.ModelAndView;
import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class Server {

  public static void main(String[] args) {
    HandlebarsTemplateEngine engine = new HandlebarsTemplateEngine();
    BibliotecaController biblioteca = new BibliotecaController();
    IndexController index = new IndexController();

    Spark.port(9000);
    Spark.get("/", index::redirigir);
    Spark.get("/QMP", index::getIndex, engine);
    Spark.get("/biblioteca/", biblioteca::getBiblioteca, engine);
  }

}