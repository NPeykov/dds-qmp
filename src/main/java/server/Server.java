package server;

import spark.ModelAndView;
import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class Server {

  public static void main(String[] args) {
    HandlebarsTemplateEngine engine = new HandlebarsTemplateEngine();
    Spark.port(9000);
    Spark.get("/", (request, response) ->
        new ModelAndView(
            request.queryParamOrDefault("ropa", "Ropa"),
            "saludo.html.hbs"
        ),
        engine
    );
  }

}