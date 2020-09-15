
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/Ejer3"})
public class Ejer3Cambio extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html");
                PrintWriter out =response.getWriter();
                
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Tipo de Cambio</title>");
                out.println("</head>");
                out.println("</body>");
                out.println("<h1>Conversor</h1>");             
                out.println("<form action='' method='post'>");
                out.println("Ingrese Monto a Convertir ");
                out.println("<br><input type='number' name='cantidad'>");
                out.println("<select name='conv'>");
                out.println("<option  value='Bol'>Bs</option>");
                out.println("<option  value='dolar'>$</option>");
                out.println("</select>");
                out.println("<br>");
                out.println("<br><input type='submit' value = 'Convertir'>");
                out.println("</form>");
                out.println("</body>");
                out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            int cant= Integer.parseInt(request.getParameter("cantidad"));
            String valor = request.getParameter("conv");
            response.setContentType("text/html");
            PrintWriter out =response.getWriter();
            DecimalFormat df = new DecimalFormat("#.00");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>TipoCambio</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h2>Resultado de la conversion</h2>");

                if(valor.equals("dolar")){
                    out.println("<h4>---Bolivianos a Dolares---</h4>");
                    out.println("<p> "+cant+"$"+" equivale a "+ df.format(cant*6.96)+"Bs<br>");
                    out.println("----------------------------------</h4>");
                }
                else if(valor.equals("Bol")){
                    out.println("<p>---Bolivianos a Dolares---</p>");
                    out.println("<p> "+cant+"Bs"+" equivale a "+df.format((cant*1)/6.96)+"$<br>");
                    out.println("----------------------------------</p>");

               
                }
                out.println("</body>");
                out.println("</html>");
            }
        
        

}
