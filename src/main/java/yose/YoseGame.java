package yose;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import static spark.Spark.*;

public class YoseGame {
    public static void main(String[] args) {
    	get("/", (request, response) -> {

            return new ModelAndView(new Object(), "index.ftl");
        }, new FreeMarkerEngine());
    }
}
