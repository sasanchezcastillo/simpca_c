/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletsConsulta;

import Controladores.Conexion;
import static ServletsConsulta.DetallesTotal.cero;
import static ServletsConsulta.DetallesTotal.con;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USUARIO
 */
public class DetallesTotal extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
        
    public static int cero = 0;
    public static Conexion con = new Conexion();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
   String num_lote = request.getParameter("num_lote");
        
        
        if(con.getTotalAbonada(num_lote) != null){
            request.setAttribute("Valor_total_abonada", new Conexion().getTotalAbonada(num_lote));
        }else{
            request.setAttribute("Valor_total_abonada", cero);
        }
        if(con.gettotal_quema_fisica(num_lote) != null){
            request.setAttribute("total_quema_fisica", new Conexion().gettotal_quema_fisica(num_lote));
        }else{
            request.setAttribute("total_quema_fisica", cero);
        }
        if(con.gettotal_quema_quimica(num_lote) != null){
            request.setAttribute("total_quema_quimica", new Conexion().gettotal_quema_quimica(num_lote));
        }else{
            request.setAttribute("total_quema_quimica", cero);
        }
        if(con.gettotal_residuos(num_lote) != null){
            request.setAttribute("total_residuos", new Conexion().gettotal_residuos(num_lote));
        }else{
            request.setAttribute("total_residuos", cero);
        }
        if(con.gettotal_preparacion_suelo(num_lote) != null){
            request.setAttribute("total_preparacion_suelo", new Conexion().gettotal_preparacion_suelo(num_lote));
        }else{
            request.setAttribute("total_preparacion_suelo", cero);
        }
        if(con.gettotal_mantenimiento_lote(num_lote) != null){
            request.setAttribute("total_mantenimiento_lote", new Conexion().gettotal_mantenimiento_lote(num_lote));
        }else{
            request.setAttribute("total_mantenimiento_lote", cero);
        }
        if(con.gettotal_riego(num_lote) != null){
            request.setAttribute("total_riego", new Conexion().gettotal_riego(num_lote));
        }else{
            request.setAttribute("total_riego", cero);
        }
        if(con.gettotal_siembra_manual(num_lote) != null){
            request.setAttribute("total_siembra_manual", new Conexion().gettotal_siembra_manual(num_lote));
        }else{
            request.setAttribute("total_siembra_manual", cero);
        }
        if(con.gettotal_siembra_mecanizada(num_lote) != null){
            request.setAttribute("total_siembra_mecanizada", new Conexion().gettotal_siembra_mecanizada(num_lote));
        }else{
            request.setAttribute("total_siembra_mecanizada", cero);
        }
        if(con.gettotal_pajareo(num_lote) != null){
            request.setAttribute("total_pajareo", new Conexion().gettotal_pajareo(num_lote));
        }else{
            request.setAttribute("total_pajareo", cero);
        }
        if(con.gettotal_fumiga(num_lote) != null){
            request.setAttribute("total_fumiga", new Conexion().gettotal_fumiga(num_lote));
        }else{
            request.setAttribute("total_fumiga", cero);
        }
        if(con.gettotal_despalille(num_lote) != null){
            request.setAttribute("total_despalille", new Conexion().gettotal_despalille(num_lote));
        }else{
            request.setAttribute("total_despalille", cero);
        }
        if(con.gettotal_entresaque(num_lote) != null){
            request.setAttribute("total_entresaque", new Conexion().gettotal_entresaque(num_lote));
        }else{
            request.setAttribute("total_entresaque", cero);
        }
        if(con.gettotal_macheteada(num_lote) != null){
            request.setAttribute("total_macheteada", new Conexion().gettotal_macheteada(num_lote));
        }else{
            request.setAttribute("total_macheteada", cero);
        }
        if(con.gettotal_corta_bultos(num_lote) != null){
            request.setAttribute("total_corta_bultos", new Conexion().gettotal_corta_bultos(num_lote));
        }else{
            request.setAttribute("total_corta_bultos", cero);
        }
        if(con.gettotal_corta_granel(num_lote) != null){
            request.setAttribute("total_corta_granel", new Conexion().gettotal_corta_granel(num_lote));
        }else{
            request.setAttribute("total_corta_granel", cero);
        }
        if (con.getTotal_Corta_maleza(num_lote) != null){
            request.setAttribute("valor_total_mrc", new Conexion().getTotal_Corta_maleza(num_lote));
        } else {
            request.setAttribute("valor_total_mrc", cero);
        }
        if (con.getLiquidaciontotal(num_lote) != null){
            request.setAttribute("valor_total_liquidacion", new Conexion().getLiquidaciontotal(num_lote));
        } else {
            request.setAttribute("valor_total_liquidacion", cero);
        }
        
        if (con.getValortotal(num_lote) != null){
            System.err.println("eeeeeeeeeeeeeeeeeeeeeeee"+con.getValortotal(num_lote));
            request.setAttribute("valor_total", new Conexion().getValortotal(num_lote));
        } else {
            request.setAttribute("valor_total", cero);
        }
        if (con.getTotal_gastos(num_lote) != null){
            System.err.println("eeeeeeeeeeeeeeeeeeeeeeee"+con.getTotal_gastos(num_lote));
            request.setAttribute("total_gastos", new Conexion().getTotal_gastos(num_lote));
        } else {
            request.setAttribute("total_gastos", cero);
        }
        if (con.getValor_ganancia(num_lote) != null){
            System.err.println("eeeeeeeeeeeeeeeeeeeeeeee"+con.getValor_ganancia(num_lote));
            request.setAttribute("valor_ganancia", new Conexion().getValor_ganancia(num_lote));
        } else {
            request.setAttribute("valor_ganancia", cero);
        }
        if (con.getValor_kilogramo(num_lote) != null){
            System.err.println("eeeeeeeeeeeeeeeeeeeeeeee"+con.getValor_kilogramo(num_lote));
            request.setAttribute("valor_kilogramo", new Conexion().getValor_kilogramo(num_lote));
        } else {
            request.setAttribute("valor_kilogramo", cero);
        }
        if (con.getValor_insumos(num_lote) != null){
            request.setAttribute("valor_insumos", new Conexion().getValor_insumos(num_lote));
        } else {
            request.setAttribute("valor_insumos", cero);
        }
        request.getRequestDispatcher("consultar.jsp").forward(request, response);
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
