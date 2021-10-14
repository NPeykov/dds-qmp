package server;

import spark.Spark;

public class Server {

  public static void main(String[] args) {
    Spark.port(9000);
    Spark.get("/", (request, response) ->
        "<h2>que me pongo?</h2>" +
        "<p>q8-)</p>");
  }

}