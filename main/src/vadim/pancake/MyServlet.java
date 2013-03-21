package vadim.pancake;

import com.sun.xml.internal.ws.api.WSService;
import org.atmosphere.cpr.AtmosphereServlet;

import javax.servlet.Servlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(
        urlPatterns = {"/chat/*"},
        initParams = {
                @WebInitParam(name = "com.sun.jersey.config.property.packages", value = "vadim"),
                @WebInitParam(name = "com.sun.jersey.api.json.POJOMappingFeature", value = "true"),
                @WebInitParam(name = "org.atmosphere.websocket.messageContentType", value = "application/json")
        })
public class MyServlet extends AtmosphereServlet {
}
