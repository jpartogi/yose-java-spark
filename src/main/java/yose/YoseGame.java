package yose;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import static spark.Spark.*;

import com.google.gson.Gson;

public class YoseGame {
    public static void main(String[] args) {
    	port(getPort());
    	
    	YoseGame yose = new YoseGame();
    	yose.start();
    }
    
    // Define the routes for the application here
    public void start(){
    	Gson gson = new Gson();
    	
    	get("/", (request, response) -> {
    		response.type("text/html");
    		
            return new ModelAndView(new Object(), "index.ftl");
        }, new FreeMarkerEngine());
    	
    	get("/ping", (request, response) -> {
    		response.type("application/json");
    		
    		return new Status(true); 
    	}, gson::toJson);    	
    }
    
    static int getPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
}
