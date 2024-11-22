
import javax.servlet.*;
import java.io.*;

public class MsbteDemo extends GenericServlet {
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

               PrintWriter out = res.getWriter();

              out.println("Welcome to Maharashtra State Board of Technical Education");
          }
}
