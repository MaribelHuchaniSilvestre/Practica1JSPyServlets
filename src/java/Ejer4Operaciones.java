

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/Ejer4"})
public class Ejer4Operaciones extends HttpServlet {
        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Operaciones</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Datos a Calcular</h1>");
        out.println("<form action='' method='post'>");
        out.println("Numero 1:");
        out.println("<input type ='number' name='num1'>");
        out.println("<br>Numero 2:");
        out.println("<input type ='number' name='num2'>");
         out.println("<br>Que operacion desea realizar?");
        out.println("<select name='operacion'>");
        out.println("<option  value='suma'>SUMA</option>");
        out.println("<option  value='resta'>RESTA</option>");
        out.println("<option  value='multiplicacion'>MULTIPLICACION</option>");
        out.println("<option ' value='division'.>DIVISION</option>");
        out.println("</select>");
        out.println("<br>");
        out.println("<br><input  type ='submit' value = 'Procesar'>");
        out.println("</body>");
        out.println("</html>");
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int n1 = Integer.parseInt(request.getParameter("num1"));
        int n2 = Integer.parseInt(request.getParameter("num2"));
        String valor = request.getParameter("operacion");
        
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
     
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Saludo</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Bienvenido</h1>");
        
        if(valor.equals("suma")){
            out.println("<p>La Suma es: "+(n1+n2)+"</p>");
        }
        else if(valor.equals("resta")){
            out.println("<p>La Resta es: "+(n1-n2)+"</p>");
        }
         else if(valor.equals("multiplicacion")){
            out.println("<p>La Multiplicacion es: "+(n1*n2)+"</p>");
        }
         else if(valor.equals("division")){
            out.println("<p>La Division es: "+(n1/n2)+"</p>");
        }
        out.println("</body>");
        out.println("</html>");
    }

}
