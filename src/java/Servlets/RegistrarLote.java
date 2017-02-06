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
public class RegistrarLote extends HttpServlet {

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
        
        HttpSession objSession = request.getSession();
        String cedula = (String)objSession.getAttribute("cedula");
        String num_lote = request.getParameter("num_lote");
        String area_lote = request.getParameter("area_lote");
        String arriendo_lote = request.getParameter("arriendo_lote");
        ConsultasSQL co = new ConsultasSQL();
        
        try {
            if(co.validarLote(num_lote) == false){
                if(co.Registrar_lotes(num_lote, cedula, area_lote, arriendo_lote)){
                    if("REGISTRAR UN NUEVO LOTE".equals(request.getParameter("registrar1"))){
                        response.sendRedirect("registro_lote.jsp");
                    }else{
                        request.setAttribute("lista", new Controladores.seleccionLote().getContactos(cedula));
                        request.getRequestDispatcher("seleccione_lote.jsp").forward(request, response);
                    }
                }
            }else{
                request.setAttribute("_mensajeErrorLote", "El numero del lote ya existe");
                request.getRequestDispatcher("registro_lote.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(co != null) co.getConnection().close();
            } catch (Exception e) {
            }
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
