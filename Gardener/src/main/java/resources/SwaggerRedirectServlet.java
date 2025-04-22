package resources;

import javax.servlet.http.*;
import java.io.IOException;

public class SwaggerRedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/webjars/swagger-ui/4.15.5/index.html?url=/openapi.json");
    }
}