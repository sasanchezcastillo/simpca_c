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
public class RegistrarLiquidacion extends HttpServlet {

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
        System.out.println("iniciando el servlet");
        
        String bolsa_retencion = request.getParameter("bolsa_retencion").replace(".","");
        String fomento_arrocero = request.getParameter("fomento_arrocero").replace(".","");
        String asistencia_tecnica = request.getParameter("asistencia_tecnica").replace(".","");
        String intereses = request.getParameter("intereses").replace(".","");
        
        String[] fecha = request.getParameterValues("fecha");
        String[] tiquete = request.getParameterValues("tiquete");
        String[]  pesoNeto = request.getParameterValues("pesoNeto");
        String[]  bultos = request.getParameterValues("bultos");
        String[]  pesoFinal = request.getParameterValues("pesoFinal");
        String[]  f24 = request.getParameterValues("f24");
        String[]  f4 = request.getParameterValues("f4");
        String[]  kilosVerde = request.getParameterValues("kilosVerde");
        String[]  valorUnitario = request.getParameterValues("valorUnitario");
        String[]  valorTotal = request.getParameterValues("valorTotal");
        
        String numLote = request.getParameter("num_lote");
        String totalpesoFinal = request.getParameter("totalpesoFinal").replace(".", "");
        String totalkilosVerde = request.getParameter("totalkilosVerde").replace(".", "");
        String totalvalorUnitario = request.getParameter("totalvalorUnitario").replace(".", "");
        String totalvalorTotal = request.getParameter("totalvalorTotal").replace(".", "");
        
      
       
   
        
        ConsultasSQL co = new ConsultasSQL();
        boolean resultado = false;
        System.out.println("imprimio1");
        try {
            co.getConnection().setAutoCommit(false);
            System.out.println("imprimio2");
                System.out.println("imprimio3");
                for(int i=0 ; i < fecha.length; i++ ){
                    System.out.println("imprimio4");
                    if(co.liquidacion(tiquete[i], numLote, fecha[i], pesoNeto[i],pesoFinal[i].replace(".", ""), bultos[i],  f24[i], f4[i], kilosVerde[i], valorUnitario[i].replace(".", ""), valorTotal[i].replace(".", ""),totalvalorTotal,totalpesoFinal,totalkilosVerde,totalvalorUnitario)){
                        if(co.Registrarparafiscales(numLote, fomento_arrocero, bolsa_retencion, asistencia_tecnica, intereses)){
                           resultado = true; 
                        }else{
                            System.out.println("2 if");
                        }
                        resultado=true;
                    }else{
                        System.out.println("1 if");
                    }
            }
                
           } catch (SQLException se) {
               System.out.println("este es el caaaatch"+se);
            se.printStackTrace();

        }finally{
            try {
                if(resultado){
                    co.getConnection().commit();
                    response.sendRedirect("liquidacion.jsp");
                }else{
                    co.getConnection().rollback();
                    response.sendRedirect("errorRegistro2.jsp");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
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
