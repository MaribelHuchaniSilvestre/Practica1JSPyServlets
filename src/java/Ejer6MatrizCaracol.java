

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/Ejer6"})
public class Ejer6MatrizCaracol extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
          response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>matriz</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Matriz Caracol </h1>");
        out.println("<form action='' method='post'>");
        out.println("Ingrese la dimension de la Matriz :");
        out.println("<br><input type ='number' name='Mat'>");
        out.println("<input type ='submit'>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int x = Integer.parseInt(request.getParameter("Mat"));
        int [][] Mat= new int[x+1][x+1];
        int cont=1;
        
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
     
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Matriz</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Matriz Caracol de "+x+" x "+x+"</h1>");
        for (int b = 1; b <= x / 2; b++) {
            for (int i = b; i <= x - b; i++) {
                Mat[b][i] = cont;
                cont++;
            }
            for (int i = b; i <= x - b; i++) {
                Mat[i][x - b + 1] = cont;
                cont++;
            }
            for (int i = x - b + 1; i >= b + 1; i--) {
                Mat[x - b + 1][i] = cont;
                cont++;
            }
            for (int i = x - b + 1; i >= b + 1; i--) {
                Mat[i][b] = cont;
                cont++;
            }
        }
        if (x % 2 == 1) {
            Mat[x / 2 + 1][x / 2 + 1] = cont;
        }
        for(int i=1;i<x+1;i++){
            for(int j=1;j<x+1;j++){
                out.println(" "+Mat[i][j]);
            }
            out.println("<br>");
        }
        out.println("</body>");
        out.println("</html>");
    }

}
