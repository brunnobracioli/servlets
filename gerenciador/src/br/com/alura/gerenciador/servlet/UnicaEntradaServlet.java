package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.acao.Acao;

/**
 * Servlet implementation class UnicaEntradaServlet
 */
//@WebServlet("/entrada")
//public class UnicaEntradaServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	//N�o estamos mais usando essa classe de entrada, usamos agora a classe controlador filtro.
	
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		String paramAcao = request.getParameter("acao"); //http://localhost:8080/gerenciador/entrada?acao=xxxxxx
//		
////		HttpSession sessao = request.getSession();
////		boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);
////		boolean ehUmaAcaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm"));
////		
////		if(ehUmaAcaoProtegida && usuarioNaoEstaLogado) {
////			response.sendRedirect("entrada?acao=LoginForm");
////			return;
////		}
//		
//		String nomeDaClasse = "br.com.alura.gerenciador.acao." + paramAcao; // isso representa o codigo codificado da classe(aula 02 padrao mvc aula 7 autentica��o autoriza��o e o padrao mvc
//		
//		String nome;
//		try {
//			/*Me devolve a classe carregada
//			        |
//			        |  */
//			Class classe = Class.forName(nomeDaClasse); // <-- carrega a classe com o nome da String
//			Acao acao = (Acao) classe.newInstance(); // cria uma nova instancia da classe
//			// precisa fazer um cast (Object) que � uma refencia gen�rica para uma referencia espec�fica.
//			nome = acao.executa(request,response);
//		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException
//				| IOException e) {
//			throw new ServletException(e);
//		}
//		
//		String[] tipoEEndereco = nome.split(":");
//		if(tipoEEndereco[0].equals("forward")){
//			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEEndereco[1]);
//			rd.forward(request, response);
//		}else {
//			response.sendRedirect(tipoEEndereco[1]);
//		}
//
//
////		// paramAcao.executa(request, response);
////		
////		String nome = null;
////		//Cada if, else if, para cada acao sempre criar a classe dedicada
////		if(paramAcao.equals("ListaEmpresas")) {
////			ListaEmpresas acao = new ListaEmpresas();
////			nome = acao.executa(request, response);	
////			
////		}else if(paramAcao.equals("RemoveEmpresa")) {			
////			RemoveEmpresa acao = new RemoveEmpresa();
////			nome = acao.executa(request, response);
////			
////		}else if(paramAcao.equals("MostraEmpresa")) {			
////			MostraEmpresa acao = new MostraEmpresa();
////			nome = acao.executa(request, response);
////			
////		}else if(paramAcao.equals("AlteraEmpresa")) {
////			AlteraEmpresa acao = new AlteraEmpresa();
////			nome = acao.executa(request, response);
////			
////		}else if(paramAcao.equals("NovaEmpresa")) {
////			NovaEmpresa acao = new NovaEmpresa();
////			nome = acao.executa(request, response);
////			
////		}else if(paramAcao.equals("NovaEmpresaForm")) { 
////			NovaEmpresaForm acao = new NovaEmpresaForm();
////			nome = acao.executa(request, response);
//		}
		
		
		
//	}

//}
