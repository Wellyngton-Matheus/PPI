package agenda.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/ola")
public class AtividadeServlet extends HttpServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
			
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>cadastro</h1>");
		out.println("<h1>Nome: Wellyngton </h1>");
		out.println("<h1>email: Wellyngton@gmail.com</h1>");
		out.println("<h1>telefone: 994243010</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
