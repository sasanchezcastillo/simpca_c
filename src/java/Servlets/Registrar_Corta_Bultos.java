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
public class Registrar_Corta_Bultos extends HttpServlet {

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
        String numLote = request.getParameter("numLote");
        String cantidadMqLlanta = request.getParameter("cantidadMqLlanta");
        String valorMqLlanta = request.getParameter("valorMqLlanta").replace(".", "");
        String valorTotalMqLlanta= request.getParameter("valorTotalMqLlanta").replace(".", "");
        String cantidadMqOruga = request.getParameter("cantidadMqOruga");
        String valorMqOruga= request.getParameter("valorMqOruga").replace(".", "");
        String valorTotalMqOruga = request.getParameter("valorTotalMqOruga").replace(".", "");
        String cantidadLlenador = request.getParameter("cantidadLlenador");
        String valorLlenador = request.getParameter("valorLlenador").replace(".", "");
        String valorTotalLlenador = request.getParameter("valorTotalLlenador").replace(".", "");  
        String cantidadTractor = request.getParameter("cantidadTractor");   
        String valorTractor = request.getParameter("valorTractor").replace(".", "");  
        String valorTotalTractor = request.getParameter("valorTotalTractor").replace(".", ""); 
        String cantidadBulteador = request.getParameter("cantidadBulteador");
        String valorBulteador = request.getParameter("valorBulteador").replace(".", "");    
        String valorTotalBulteador = request.getParameter("valorTotalBulteador").replace(".", "");        
        String cantidadFlete = request.getParameter("cantidadFlete");
        String valorFlete = request.getParameter("valorFlete").replace(".", "");
        String valorTotalFlete = request.getParameter("valorTotalFlete").replace(".", "");
        String valorCabuyaNylon= request.getParameter("valorCabuyaNylon").replace(".", "");
        String valorCeladuriaMaquina = request.getParameter("valorCeladuriaMaquina").replace(".", "");
        String valorAlimentacion = request.getParameter("valorAlimentacion").replace(".", "");
        String valorAdministracion = request.getParameter("valorAdministracion").replace(".", "");
        String transporte_oruga = request.getParameter("transporteoruga").replace(".", "");
        String costoTotal = request.getParameter("costoTotal").replace(".", "");
        
        ConsultasSQL co = new ConsultasSQL();
        if(co.RegistrarCortaBultos(fecha, numLote, cantidadMqLlanta, valorMqLlanta, valorTotalMqLlanta, cantidadMqOruga, valorMqOruga, valorTotalMqOruga, cantidadLlenador, valorLlenador, valorTotalLlenador,
           cantidadTractor, valorTractor, valorTotalTractor, cantidadBulteador, valorBulteador, valorTotalBulteador, cantidadFlete, valorFlete, valorTotalFlete, valorCabuyaNylon, valorCeladuriaMaquina, valorAlimentacion, valorAdministracion, transporte_oruga, costoTotal)) {
            response.sendRedirect("corta_bultos.jsp");
               
        }else{
            response.sendRedirect("errorRegistro2.jsp");
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
