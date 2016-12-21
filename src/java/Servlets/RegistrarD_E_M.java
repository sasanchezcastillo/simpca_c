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
public class RegistrarD_E_M extends HttpServlet {

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
        
        String fechaDespalille = request.getParameter("fecha");
        String numLoteDespalille = request.getParameter("numLote");
        String cantidadManoObraDespalille = request.getParameter("cantidadManoObraDespalille");
        String precioManoObraDespalille = request.getParameter("precioManoObraDespalille").replace(".", "");
        String valorTotalDespalille = request.getParameter("valorTotalDespalille").replace(".", "");
        String totalDespalille = request.getParameter("Total").replace(".", "");
        
        String fechaEntresaque = request.getParameter("fecha");
        String numLoteEntresaque = request.getParameter("numLote");
        String cantidadManoObraEntresaque = request.getParameter("cantidadManoObraEntresaque");
        String precioManoObraEntresaque = request.getParameter("precioManoObraEntresaque").replace(".", "");
        String valorTotalEntresaque = request.getParameter("valorTotalEntresaque").replace(".", "");
        String totalEntresaque = request.getParameter("Total").replace(".", "");
        
        String fechaMacheteada = request.getParameter("fecha");
        String numLoteMacheteada = request.getParameter("numLote");
        String cantidadManoObraMacheteada = request.getParameter("cantidadManoObraMacheteada");
        String precioManoObraMacheteada = request.getParameter("precioManoObraMacheteada").replace(".", "");
        String valorTotalMacheteada = request.getParameter("valorTotalMacheteada").replace(".", "");
        String totalMacheteada = request.getParameter("Total").replace(".", "");
        
        
        
        ConsultasSQL co = new ConsultasSQL();
        boolean resultado = false;
        System.out.println("imprimio1");
        try {
            co.getConnection().setAutoCommit(false);
        if(co.RegistrarDespalille(fechaDespalille, numLoteDespalille, cantidadManoObraDespalille, precioManoObraDespalille, valorTotalDespalille, totalDespalille)) {
            System.out.println("imprimio2");
            if(co.RegistrarEntresaque(fechaEntresaque, numLoteEntresaque, cantidadManoObraEntresaque, precioManoObraEntresaque, valorTotalEntresaque, totalEntresaque)) {
                System.out.println("imprimio3");
                if(co.RegistrarMacheteada(fechaMacheteada, numLoteMacheteada, cantidadManoObraMacheteada, precioManoObraMacheteada, valorTotalMacheteada, totalMacheteada)) {
                    System.out.println("imprimio4");
                     resultado = true;
                }
            }
        }
        
       } catch (SQLException se) {
            se.printStackTrace();

        } finally {
            try {
                if (resultado) {
                    co.getConnection().commit();
                    response.sendRedirect("despalille.jsp");
                } else {
                    co.getConnection().rollback();
                    response.sendRedirect("errorRegistro.jsp");
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
