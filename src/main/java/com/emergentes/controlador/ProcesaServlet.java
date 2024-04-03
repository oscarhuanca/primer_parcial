package com.emergentes.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ProcesaServlet", urlPatterns = {"/ProcesaServlet"})
public class ProcesaServlet extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String nombre = request.getParameter("nombre");
      double parcial1 = request.getParameter("parcial1");
      double parcial2 = request.getParameter("parcial2");
      double examenfinal = request.getParameter("examenfinal");
      double notafinal = request.getParameter("notafinal");
      
     Registro regi = new Registro();
      
      regi. set Nombre(nombre);
      regi. set Parcial1(parcial1);
      regi. set Parcial2(parcial2);
      regi. set ExamenFinal(examenfinal);
      regi. set NotaFinal(notafinal);
      
      request.setAttribute("moregi", regi);
      request.getRequestDispatcher("Salida.jsp").forward(request,response);
      
    }

  

}
