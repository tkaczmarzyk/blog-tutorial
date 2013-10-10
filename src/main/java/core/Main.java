package core;

import static spark.Spark.*;
import spark.*;

public class Main {

	public static void main(String[] args) {
		get(new Route("/hello") {
			@Override
			public Object handle(Request req, Response resp) {
				return "<h1>Hello World!</h1>";
			}
		});
	}
}