/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controladores.Graficas_usuarios;
import Controladores.ConexionBD;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author popor
 */
public class graficas extends HttpServlet {

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

        String num_lote = request.getParameter("num_lote");

        ConexionBD con = null;

        try {

            con = new ConexionBD();
            Graficas_usuarios suma = new Graficas_usuarios();
            Graficas_usuarios datos = new Graficas_usuarios(con.getConnection());
            Graficas_usuarios d = datos.datos(num_lote);

            Graficas_usuarios manoobra = datos.grafManoObra(num_lote);
            Graficas_usuarios insumos = datos.grafValorInsumos(num_lote);
            Graficas_usuarios otrosgastos = datos.GrafOtrosGastos(num_lote);
            out.print(num_lote);

            HttpSession session = request.getSession();
            if (d != null) {
                session.setAttribute("datos", d);

                if (manoobra != null) {
                    session.setAttribute("manoobra", manoobra);

                    if (insumos != null) {
                        session.setAttribute("insumos", insumos);
                    }
                    if (otrosgastos != null) {
                        session.setAttribute("otrosgastos", otrosgastos);
                    }
                }
                response.sendRedirect("graficas.jsp");

            } else {
                response.sendRedirect("inicio.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
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
