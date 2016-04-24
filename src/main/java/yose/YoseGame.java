package yose;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import static spark.Spark.*;

public class YoseGame {
    public static void main(String[] args) {
    	port(getHerokuAssignedPort());
    	
    	get("/", (request, response) -> {

            return new ModelAndView(new Object(), "index.ftl");
        }, new FreeMarkerEngine());
    }
    
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
}
