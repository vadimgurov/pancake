package vadim.pancake;

import org.atmosphere.cpr.AtmosphereServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(
        name = "MyServlet",
        urlPatterns = {"/*"},
        initParams = {
                @WebInitParam(name = "com.sun.jersey.config.property.packages", value = "vadim"),
                @WebInitParam(name = "com.sun.jersey.api.json.POJOMappingFeature", value = "true"),
                @WebInitParam(name = "org.atmosphere.websocket.messageContentType", value = "application/json")})
public class MyServlet extends AtmosphereServlet {
}
