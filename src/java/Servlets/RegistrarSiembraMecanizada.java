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
public class RegistrarSiembraMecanizada extends HttpServlet {

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
        String variedad_semilla = request.getParameter("variedad_semilla");
        String costo_mq_sembradora = request.getParameter("costo_maquina").replace(".", "");
        String costo_semilla = request.getParameter("costo_semilla").replace(".", "");
        String secado_semilla = request.getParameter("secado_semilla").replace(".", "");
        String num_hect_sembradas = request.getParameter("num_hect");
        String costo_mano_obra = request.getParameter("costo_mano_obra").replace(".", "");
        String cantidad_bultos = request.getParameter("cantidad_bultos");
        String transporte_semilla = request.getParameter("transporte_semilla").replace(".", "");
        String valor_bulto = request.getParameter("valor_bultos").replace(".", "");
        String total = request.getParameter("total").replace(".", "");
        
        
        ConsultasSQL co = new ConsultasSQL();
        
        if(co.siembra_mecanizada(fecha, num_lote, variedad_semilla, costo_mq_sembradora, costo_semilla, secado_semilla, num_hect_sembradas, costo_mano_obra, cantidad_bultos, valor_bulto, transporte_semilla, total)){
            response.sendRedirect("SiembraMecanizada.jsp");
        }
        else{
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
