
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/Ejer2"})
public class Ejer2Edad extends HttpServlet {
        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html");
                PrintWriter out =response.getWriter();
                
                out.println("<html>");
                out.println("<head>");
                out.println("<title>datos edad</title>");
                out.println("</head>");
                out.println("</body>");
                out.println("<h1>Datos</h1>");             
                out.println("<form action='' method='post'>");
                out.println("Nombre ");
                out.println("<br><input type='text' name='nombre'>");
                out.println("<br>Ingresa tu año de nacimiento");
                out.println("<br><input type='number' name='anio'>");
                out.println("<br><input type='submit'>");
                out.println("</form>");
                out.println("</body>");
                out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String nombre = request.getParameter("nombre");
            int anio= Integer.parseInt(request.getParameter("anio"));
            
            response.setContentType("text/html");
            PrintWriter out =response.getWriter();
            
                out.println("<html>");
                out.println("<head>");
                out.println("<title>edad</title>");
                out.println("</head>");
                out.println("</body>");
                out.println("<h1>Tus Datos </h1>");
                out.println("<p>Tu nombre es:"+nombre+ " </p>");
                out.println("<p>Tu edad es:"+(2020-anio)+ " </p>");
                out.println("</body>");
                out.println("</html>");
       
        
        
    }
}
