/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletsConsulta;

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
public class EliminarConsultas extends HttpServlet {

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
        
        String op = request.getParameter("op");
        String id = request.getParameter("id");
        
        ConsultasSQL con = new ConsultasSQL();
        switch(op){
            case "eliminarQQ":
                con.eliminarQuemaQ(id);
                request.getServletContext().getRequestDispatcher("/ServletQuemaQuimica").forward(request, response);
                break;
            case "eliminarQF":
                con.eliminarQuemaF(id);
                request.getServletContext().getRequestDispatcher("/ServletQuemaFisica").forward(request, response);
                break;
                
            case "eliminarPS":
                con.eliminarPreparacionS(id);
                request.getServletContext().getRequestDispatcher("/ServletPreparacionSuelo").forward(request, response);
                break;
                
            case "eliminarMRC":
                con.eliminarMRC(id);
                request.getServletContext().getRequestDispatcher("/Detalles_corta_maleza").forward(request, response);
                break;
                
            case "eliminarSM":
                con.eliminarSM(id);
                request.getServletContext().getRequestDispatcher("/ServletSiembraMecanizada").forward(request, response);
                break;
                
            case "eliminarSMn":
                con.eliminarSManual(id);
                request.getServletContext().getRequestDispatcher("/ServletSiembraManual").forward(request, response);
                break;
            
            case "eliminarAbonada":
                con.eliminarAbonada(id);
                request.getServletContext().getRequestDispatcher("/ServletAbonada_insumos").forward(request, response);
                break;
                
            case "eliminarFumiga":
                con.eliminarFumiga(id);
                request.getServletContext().getRequestDispatcher("/ServletFumigas").forward(request, response);
                break;
                
            case "eliminarDespalille":
                con.eliminarDespalille(id);
                request.getServletContext().getRequestDispatcher("/ServletDespalille").forward(request, response);
                break;
                
            case "eliminarEntresaque":
                con.eliminarEntresaque(id);
                request.getServletContext().getRequestDispatcher("/ServletEntresaque").forward(request, response);
                break;
                
            case "eliminarMacheteada":
                con.eliminarMacheteada(id);
                request.getServletContext().getRequestDispatcher("/ServletMacheteada").forward(request, response);
                break;
                
            case "eliminarPajareo":
                con.eliminarPajareo(id);
                request.getServletContext().getRequestDispatcher("/ServletPajareoCeladuria").forward(request, response);
                break;
                
            case "eliminarRiego":
                con.eliminarRiego(id);
                request.getServletContext().getRequestDispatcher("/ServletRiego").forward(request, response);
                break;
                
            case "eliminarCortaBulto":
                con.eliminarCB(id);
                request.getServletContext().getRequestDispatcher("/ServletCortaBultos").forward(request, response);
                break;
                
            case "eliminarCortaGranel":
                con.eliminarCG(id);
                request.getServletContext().getRequestDispatcher("/ServletCortaGranel").forward(request, response);
                break;
                
            case "eliminarMantenimiento":
                con.eliminarMntlote(id);
                request.getServletContext().getRequestDispatcher("/ServletMantenimiento").forward(request, response);
                break;
             
            case "eliminarLiquidacion":
                con.eliminarLiquidacion(id);
                request.getServletContext().getRequestDispatcher("/LiquidacionDetalles").forward(request, response);
                break;
                
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
