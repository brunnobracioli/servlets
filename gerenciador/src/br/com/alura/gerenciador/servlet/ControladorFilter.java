package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.Acao;

//@WebFilter("/entrada") o mapeamento esta sendo feito atraves do web.xml tag <filter>
public class ControladorFilter implements Filter {

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("ControladorFilter");
		
		// abaixo fizemos um cast para converter uma ServletRequest em HttpServletRequest, para a funcão getSession poder funcionar.
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String paramAcao = request.getParameter("acao"); //http://localhost:8080/gerenciador/entrada?acao=xxxxxx
		
		String nomeDaClasse = "br.com.alura.gerenciador.acao." + paramAcao; // isso representa o codigo codificado da classe(aula 02 padrao mvc aula 7 autenticação autorização e o padrao mvc
		
		String nome;
		try {
			/*Me devolve a classe carregada
			        |
			        |  */
			Class classe = Class.forName(nomeDaClasse); // <-- carrega a classe com o nome da String
			Acao acao = (Acao) classe.newInstance(); // cria uma nova instancia da classe
			// precisa fazer um cast (Object) que é uma refencia genérica para uma referencia específica.
			nome = acao.executa(request,response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException
				| IOException e) {
			throw new ServletException(e);
		}
		
		String[] tipoEEndereco = nome.split(":");
		if(tipoEEndereco[0].equals("forward")){
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEEndereco[1]);
			rd.forward(request, response);
		}else {
			response.sendRedirect(tipoEEndereco[1]);
		}
		
	}
	
	

}
