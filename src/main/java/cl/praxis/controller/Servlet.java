package cl.praxis.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.models.Calculadora;
@WebServlet("/Servlet")

public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Calculadora calculadora = new Calculadora();

	public Servlet() {
		super();
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String numero1 = req.getParameter("numero1");
		String numero2 = req.getParameter("numero2");
		boolean lanzar = true;
		if (!calculadora.validarEnteros(numero1, numero2)) {
			lanzar = false;
			resp.sendRedirect("error.html");
		} else {
			String accion = req.getParameter("operacion");
			String respuesta = "";

			if (accion.equals("suma")) {
				respuesta = calculadora.sumar(Integer.parseInt(numero1), Integer.parseInt(numero2));
			} else if (accion.equals("resta")) {
				respuesta = calculadora.restar(Integer.parseInt(numero1), Integer.parseInt(numero2));
			} else if (accion.equals("multiplicacion")) {
				respuesta = calculadora.multiplicar(Integer.parseInt(numero1), Integer.parseInt(numero2));
			} else if (accion.equals("division")) {
				if (calculadora.esCero(Integer.parseInt(numero2))) {
					lanzar = false;
					resp.sendRedirect("error.html");
					
				}else {
					respuesta = calculadora.dividir(Integer.parseInt(numero1), Integer.parseInt(numero2));
				}
			}else  if (accion.equals("ordenarNumero")) {
				respuesta = calculadora.ordenarNumero(Integer.parseInt(numero1), Integer.parseInt(numero2));
			} else if (accion.equals("parOImpar")) {
				respuesta = calculadora.parOImpar(Integer.parseInt(numero1), Integer.parseInt(numero2));
			}
			
			if(lanzar) {
			req.setAttribute("respuesta", respuesta);
			getServletContext().getRequestDispatcher("/respuesta.jsp").forward(req, resp);
			}
		}
	}
}
