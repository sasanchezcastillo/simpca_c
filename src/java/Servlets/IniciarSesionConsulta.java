/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controladores.ConsultasSQL;
import Controladores.seleccionLote;
import static Servlets.IniciarSesion.CedulaSeleccion;
import static Servlets.IniciarSesion.ContrasenaSeleccion;
import controlador_admin.registrosAdministrador;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author P SENA1
 */
public class IniciarSesionConsulta extends HttpServlet {

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

        String cedula = request.getParameter("cedula");
        String contraseña = request.getParameter("pass");
        String num_lote = (String) request.getSession().getAttribute("lote");
        System.out.println("esta es la variable de sesion " + num_lote);

        ConsultasSQL co = new ConsultasSQL();
        System.out.println("cedula del login " + co.cedulaLogin);
        System.out.println("contraseña del login " + co.passLogin);
        if (co.cedulaLogin.equals(cedula) & co.passLogin.equals(contraseña)) {
            // String tipo_get = request.getParameter("tipo");
            //System.out.println("Esto es el tipo de usuario "+tipo_get);

            request.setAttribute("numero_lote", num_lote);
            RequestDispatcher objRequestDispatcher = request.getRequestDispatcher("/DetallesTotal");
            objRequestDispatcher.forward(request, response);

        } else {
            request.setAttribute("_mensajeErrorInicio", "El usuario o contraseña son incorrectos");
            request.getRequestDispatcher("Inicio_sesion.jsp").forward(request, response);
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
