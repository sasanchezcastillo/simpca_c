/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controladores.ConsultasSQL;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author LENOVO
 */
public class RegistrarGravedad extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        HttpSession obSession = request.getSession();
        
        String fecha = request.getParameter("fecha");
        String tipo_riego = (String) obSession.getAttribute("tipo_riego");
        String lote = request.getParameter("lote");
        String cantidadObra = request.getParameter("cantidadObra");
        String valorObra = request.getParameter("valorObra").replace(".", "");
        String valorTotalObra = request.getParameter("valorTotalObra").replace(".", "");
        String valorTarifa = request.getParameter("valorTarifa").replace(".", "");
        String total = request.getParameter("total").replace(".", "");
        
        System.err.println("error");
        ConsultasSQL co = new ConsultasSQL();
        System.err.println("entro");
       if (co.registrarGravedad(fecha, tipo_riego, lote, cantidadObra, valorObra, valorTotalObra, valorTarifa, total)){
            response.sendRedirect("Gravedad1.jsp");
            System.err.println("entro2");
            
        }else {
            response.sendRedirect("errorRegistro.jsp");
        }
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
