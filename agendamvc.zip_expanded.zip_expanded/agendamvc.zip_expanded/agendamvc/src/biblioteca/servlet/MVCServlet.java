package biblioteca.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.comandos.InserirLivro;
import biblioteca.comandos.Comando;
import biblioteca.comandos.BuscarLivro;

@WebServlet("/sistema")
public class MVCServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String comando = request.getParameter("comando");
		
		String resposta = null;
		Comando logica = null;

		
		try {
			Class clazz = Class.forName("biblioteca.comandos." + comando);
			logica = (Comando) clazz.newInstance();
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		resposta = logica.executa(request, response);
		
		System.out.println("O comando foi: " + comando);
		System.out.println("A resposta foi: " + resposta);
		
		RequestDispatcher rd = request.getRequestDispatcher(resposta);
		rd.forward(request, response);
		
	}
	
}
