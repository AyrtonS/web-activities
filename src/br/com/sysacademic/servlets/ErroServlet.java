package br.com.sysacademic.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.WebdavFixFilter;
import org.apache.catalina.servlets.WebdavServlet;


@WebServlet("/erro")
public class ErroServlet extends WebdavServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		throw new CadastroException();
	}

	

}
