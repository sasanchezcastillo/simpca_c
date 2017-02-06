/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controladores.ConsultasSQL;
import Controladores.seleccionLote;
import controlador_admin.registrosAdministrador;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author LENOVO
 */
public class IniciarSesion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public static String CedulaSeleccion;
    public static String ContrasenaSeleccion;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String cedula = request.getParameter("cedula");
        String aux = cedula;
        CedulaSeleccion = aux;
        String contraseña = request.getParameter("pass");
        ContrasenaSeleccion = contraseña;
        ArrayList<String> lo = null;  

        ConsultasSQL co = new ConsultasSQL();
        registrosAdministrador r = new registrosAdministrador();
        
        if (co.ingresar(cedula, contraseña)) {
           // String tipo_get = request.getParameter("tipo");
            //System.out.println("Esto es el tipo de usuario "+tipo_get);
            if (co.getTipo().equals("Usuario")) {

                seleccionLote lote = new seleccionLote();
                lo = lote.getContactos(cedula);

                if (lo.isEmpty() == false) {
                    String nombre = co.getNombre();
                    HttpSession objSession = request.getSession();
                    objSession.setAttribute("cedula", cedula);
                    objSession.setAttribute("nombre", nombre);

                    request.setAttribute("lista", new Controladores.seleccionLote().getContactos(cedula));
                    request.getRequestDispatcher("seleccione_lote.jsp").forward(request, response);
                    
                } //response.sendRedirect("seleccione_lote.jsp");
                else {
                    String nombre = co.getNombre();
                    HttpSession objSession = request.getSession();
                    objSession.setAttribute("cedula", cedula);
                    objSession.setAttribute("nombre", nombre);
                    request.getRequestDispatcher("registro_lote.jsp").forward(request, response);

                }
            } else {
                String nombre = co.getNombre();
                HttpSession session = request.getSession();
                session.setAttribute("nombre", nombre);
                response.sendRedirect("administrador/BootstrapMenuAdministrador.jsp");
            }
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
