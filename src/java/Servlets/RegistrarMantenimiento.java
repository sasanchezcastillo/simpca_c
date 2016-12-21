/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controladores.ConsultasSQL;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LENOVO
 */
public class RegistrarMantenimiento extends HttpServlet {

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
        String numlote = request.getParameter("numlote");
        String tipolimpieza = request.getParameter("tipolimpieza");
        String cantidadjornal = request.getParameter("cantidadjornal");
        String valorjornal = request.getParameter("valorjornal").replace(".", "");
        String valortotal = request.getParameter("valorTotalManoObra").replace(".", "");
        String costototal = request.getParameter("costototal").replace(".", "");
       
        //String mantenimientolotefecha = request.getParameter("fecha");
        String[] tipoinsumo = request.getParameterValues("tipo_insumo");
        String[] nombreinsumo = request.getParameterValues("nombre_insumo");
        String[] cantidad = request.getParameterValues("cantidad");
        String[] unidadinsumo = request.getParameterValues("unidadinsumo");
        String[] valorunitario = request.getParameterValues("valorunitario");
        String[] valortotal2 = request.getParameterValues("valorTotalInsumos");
        
        
        
        ConsultasSQL co = new ConsultasSQL();
        boolean resultado = false;
        try {
            co.getConnection().setAutoCommit(false);
            Long id_mntlote = co.registrarMantenimiento(fecha, numlote, tipolimpieza, cantidadjornal, valorjornal, valortotal, costototal);
               for (int i = 0; i < tipoinsumo.length; i++){
                if (co.registrarInsumo(id_mntlote, tipoinsumo[i], nombreinsumo[i], cantidad[i], unidadinsumo[i], valorunitario[i].replace(".", ""), valortotal2[i].replace(".", ""))) {
                    resultado = true;
            }
        }
            
        } catch (SQLException se) {
            se.printStackTrace();

        } finally {
            try {
                if (resultado) {
                    co.getConnection().commit();
                    response.sendRedirect("mantenimiento.jsp");
                } else {
                    co.getConnection().rollback();
                    response.sendRedirect("errorRegistro3.jsp");
                }
                co.getConnection().close();
            } catch (SQLException e) {
                e.printStackTrace();
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
