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
public class RegistrarSiembraManual extends HttpServlet {

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
        
        String fecha = request.getParameter("fecha");
        String num_lote = request.getParameter("num_lote");
        String variedad_semilla = request.getParameter("semilla");
        String cantidad_bultos = request.getParameter("cantidad_bultos");
        String precio_bulto = request.getParameter("precio_bulto").replace(".", "");
        String costo_semilla = request.getParameter("costo_semilla").replace(".", "");
        String costo_transporte = request.getParameter("costo_transporte").replace(".", "");
        String costo_secado_semilla = request.getParameter("costo_secado").replace(".", "");
        String pago_total_obreros = request.getParameter("total_obreros").replace(".", "");
        String valor_total_siembra = request.getParameter("total_siembra").replace(".", "");
        
        ConsultasSQL co = new ConsultasSQL();
        
        if(co.siembra_manual(fecha, num_lote, variedad_semilla, cantidad_bultos, precio_bulto, costo_semilla, costo_transporte, costo_secado_semilla, pago_total_obreros, valor_total_siembra)){
            response.sendRedirect("SiembraManual.jsp");
        }else{
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
