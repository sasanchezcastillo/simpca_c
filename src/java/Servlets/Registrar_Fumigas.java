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
import javax.servlet.http.HttpSession;

/**
 *
 * @author LENOVO
 */
public class Registrar_Fumigas extends HttpServlet {

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
        
        HttpSession session = request.getSession();
        
        String fecha_fumiga = request.getParameter("fecha");
        String num_lote = request.getParameter("num_lote");
        String nombre_fumiga = (String) session.getAttribute("nombre_fumiga");
        String cantidad_mano_obra = request.getParameter("cantidadObra");
        String valor_mano_obra = request.getParameter("valorU").replace(".", "");
        String valor_total_mano_obra = request.getParameter("valorT").replace(".", "");
        String costo_total = request.getParameter("suma_total").replace(".", "");

        //String[] quema_qumica_fecha = request.getParameterValues("fecha");
        String[] tipo_insumo = request.getParameterValues("tipo_insumo");
        String[] nombre_insumo = request.getParameterValues("nombre_insumo");
        String[] cantidad = request.getParameterValues("cantidad");
        String[] unidad_insumo = request.getParameterValues("unidad");
        String[] valor_unitario = request.getParameterValues("valor_unitario");
        String[] valor_total = request.getParameterValues("valor_total");
        
        ConsultasSQL co1 = new ConsultasSQL();
        boolean resultado = false;
        System.out.println("imprimio1");
        try {
            co1.getConnection().setAutoCommit(false);
            System.out.println("imprimio2");
            Long id_fumiga = co1.fumigas(fecha_fumiga, num_lote, nombre_fumiga, cantidad_mano_obra, valor_mano_obra, valor_total_mano_obra, costo_total);
                for (int i = 0; i < tipo_insumo.length; i++) {
                    System.out.println("imprimio3");
                    if (co1.insumos_fumigas(id_fumiga,tipo_insumo[i], nombre_insumo[i], cantidad[i], unidad_insumo[i], valor_unitario[i].replace(".", ""), valor_total[i].replace(".", ""))) {
                        System.out.println("imprimio4");
                        resultado = true;
                    }
                }
            

        } catch (SQLException se) {
            se.printStackTrace();

        } finally {
            try {
                if (resultado) {
                    co1.getConnection().commit();
                    
                    response.sendRedirect("inicio_fumigas.jsp");
                } else {
                    co1.getConnection().rollback();
                    response.sendRedirect("errorRegistro.jsp");
                }
                co1.getConnection().close();
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
