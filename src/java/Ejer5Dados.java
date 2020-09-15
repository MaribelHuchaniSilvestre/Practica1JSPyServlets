
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Ejer5"})
public class Ejer5Dados extends HttpServlet {
        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>juego de dados</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Bienvenido al Juego</h1>");
        out.println("<p>INSTRUCCIONES: si la suma de ambos dados es 7 u 11 ganas caso contrario pierdes</p>");
        out.println("<form action='' method='post'>");
        out.println("<br><input name='lanzar' type ='submit' value = 'Lanzar Dados'>");
        out.println("</body>");
        out.println("</html>");
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int n1 = (int) (Math.random() * 6)+1;
        int n2 = (int) (Math.random() * 6)+1;
        String res = request.getParameter("lanzar");
        
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
     
        out.println("<html>");
        out.println("<head>");
        out.println("<title>resultados</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Resultado</h1>");
        
        if(res.equals("Lanzar Dados")){
            out.println("<p>-DADO 1-        -DADO  2-</p>");
            
            if(n1==1){
            out.println("<img src='https://upload.wikimedia.org/wikipedia/commons/1/1b/Dice-1-b.svg' alt=width='70' height='70'>");

            }else if(n1==2){
                out.println("<img src='https://upload.wikimedia.org/wikipedia/commons/5/5f/Dice-2-b.svg' alt=width='70' height='70'>");
            }else if(n1==3){
                out.println("<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Dice-3-b.svg/768px-Dice-3-b.svg.png' alt=width='70' height='70'>");
            }else if(n1==4){
                out.println("<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Dice-4-b.svg/1024px-Dice-4-b.svg.png' alt=width='70' height='70'>");
            }else if(n1==5){
                            out.println("<img src='https://upload.wikimedia.org/wikipedia/commons/0/08/Dice-5-b.svg' alt=width='70' height='70'>");
            }else if(n1==6){
                out.println("<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/Dice-6-b.svg/480px-Dice-6-b.svg.png' alt=width='70' height='70'>");
            }
            
           
            if(n2==1){
                out.println("<img src='https://upload.wikimedia.org/wikipedia/commons/1/1b/Dice-1-b.svg' alt=width='70' height='70'>");
            }else if(n2==2){
                out.println("<img src='https://upload.wikimedia.org/wikipedia/commons/5/5f/Dice-2-b.svg' alt=width='70' height='70'>");
            }else if(n2==3){
                out.println("<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Dice-3-b.svg/768px-Dice-3-b.svg.png' alt=width='70' height='70'>");
            }else if(n2==4){
                out.println("<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Dice-4-b.svg/1024px-Dice-4-b.svg.png' alt=width='70' height='70'>");
            }else if(n2==5){
                out.println("<img src='https://upload.wikimedia.org/wikipedia/commons/0/08/Dice-5-b.svg' alt=width='70' height='70'>");
            }else if(n2==6){
                out.println("<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/Dice-6-b.svg/480px-Dice-6-b.svg.png' alt=width='70' height='70'>");
            }
            
            out.println("<p>La suma de ambos dados es: "+(n1+n2)+"</p>");
            if((n1+n2)==7 ||(n1+n2)==11 ){
                out.println("<h2>Felicidades GANASTE!</h2>");
            }else{
                out.println("<h3>Ohhh PERDISTE!</h3>");
            
            }
        }
        
        out.println("</body>");
        out.println("</html>");
    }
}
