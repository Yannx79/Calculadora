/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Calculadora;

/**
 *
 * @author yanni
 */
@WebServlet(name = "controlador", urlPatterns = {"/controlador"})
public class controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        double numero1 = Double.parseDouble(request.getParameter("txtNumero1"));
        double numero2 = Double.parseDouble(request.getParameter("txtNumero2"));
        
        Calculadora calculadora = new Calculadora();
        calculadora.set$numero1(numero1);
        calculadora.set$numero2(numero2);
        
        if (request.getParameter("btnSumar") != null) {
            double suma = calculadora.sumar();
            response.sendRedirect("resultado.jsp?valor=" + suma);
        } else if (request.getParameter("btnRestar") != null) {
            double resta = calculadora.restar();
            response.sendRedirect("resultado.jsp?valor=" + resta);
        } else if (request.getParameter("btnMultiplicar") != null) {
            double multiplicacion = calculadora.multiplicar();
            response.sendRedirect("resultado.jsp?valor=" + multiplicacion);
        } else if (request.getParameter("btnDividir") != null) {
            double division = calculadora.dividir();
            response.sendRedirect("resultado.jsp?valor=" + division);
        }
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
