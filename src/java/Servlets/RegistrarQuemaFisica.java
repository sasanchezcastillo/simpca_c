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

/**
 *
 * @author LENOVO
 */
public class RegistrarQuemaFisica extends HttpServlet {

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
        
       String fechaQF = request.getParameter("fechaQF");
       String loteN = request.getParameter("loteN");
       String cantidadMO = request.getParameter("cantidadMO");
       String valorUnidadMO = request.getParameter("valorUnidadMO").replace(".",""); 
       String valorTotalMO = request.getParameter("valorTotalMO").replace(".","");
       String cantidadins = request.getParameter("cantidadins");
       String dosisins = request.getParameter("dosisins");
       String valorUnitarioins = request.getParameter("valorUnitarioins").replace(".","");
       String valorTotalins = request.getParameter("valorTotalins").replace(".", "");
       String valorTotalQF = request.getParameter("valorTotalQF").replace(".", "");
        
       /*long valorTotal = Long.parseLong(request.getParameter("valorTota));*/
       
       
         ConsultasSQL co = new ConsultasSQL();
        if (co.registroQF(fechaQF, loteN, cantidadMO, valorUnidadMO, valorTotalMO, cantidadins, dosisins, valorUnitarioins, valorTotalins, valorTotalQF)){
            response.sendRedirect("QuemaFisica.jsp");
            request.setAttribute("mensaje", "se Ha guardado El contacto");
        }else 
            response.sendRedirect("errorRegistro3.jsp");
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
