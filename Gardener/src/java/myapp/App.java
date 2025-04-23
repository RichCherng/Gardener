package myapp;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import java.net.URI;

public class App {
    public static void main(String[] args) {
        var config = new MyApplication();
        URI uri = URI.create("http://0.0.0.0:8080/");
        HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, config);
        System.out.println("Server running at " + uri);
    }
}
