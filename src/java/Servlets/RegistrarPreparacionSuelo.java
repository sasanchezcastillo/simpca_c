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

/**
 *
 * @author LENOVO
 */
public class RegistrarPreparacionSuelo extends HttpServlet {

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
       
        ConsultasSQL n= new ConsultasSQL();
        
        boolean Caba = false;
        boolean Cinc = false;
        boolean Grada = false;
        boolean Pala = false;
        boolean PC = false;
        boolean PL = false;
        boolean Palo = false;
        boolean Rasta = false;
        boolean Rastrillo = false;
        boolean Taipa = false;
        boolean Zanja = false;
        
        String lote= request.getParameter("lote");
        String fechaPS= request.getParameter("fechaNS");
        String total = request.getParameter("Total").replace(".", "");
        String cantCab= request.getParameter("cantCab");
        String pasesCab=request.getParameter("pasesCab");
        String valorUniCab= request.getParameter("valorUnitarioCab").replace(".", "");
        String valorTotalCab= request.getParameter("valorTotalCab").replace(".", "");
        
        if(!cantCab.isEmpty() && !pasesCab.isEmpty()){
             Caba = n.registrarNivSuelo(fechaPS,lote, "CABALLONEO", cantCab, pasesCab, valorUniCab, valorTotalCab, total);
           
        }
        
        String cantCin= request.getParameter("cantCin");
        String pasesCin=request.getParameter("pasesCin");
        String valorUniCin= request.getParameter("valorUnitarioCin").replace(".", "");
        String valorTotalCin= request.getParameter("valorTotalCin").replace(".", "");
        
        if(!cantCin.isEmpty() && !pasesCin.isEmpty()){
           Cinc = n.registrarNivSuelo(fechaPS,lote,"CINCEL", cantCin, pasesCin, valorUniCin, valorTotalCin, total);
           
        }
        
        String  cantGrada=request.getParameter("cantGrada");
        String pasesGrada=request.getParameter("pasesGrada");
        String valorUniGrada= request.getParameter("valorUnitarioGrada").replace(".", "");
        String valorTotalGrada= request.getParameter("valorTotalGrada").replace(".", "");
        
        if(!cantGrada.isEmpty() && !pasesGrada.isEmpty()){
            Grada = n.registrarNivSuelo(fechaPS,lote, "GRADA", cantGrada, pasesGrada, valorUniGrada, valorTotalGrada, total);
           
        }
        
        String cantPala=request.getParameter("cantPala");
        String pasesPala=request.getParameter("pasesPala");
        String valorUniPala= request.getParameter("valorUnitarioPala").replace(".", "");
        String valorTotalPala= request.getParameter("valorTotalPala").replace(".", "");
        
        if(!cantPala.isEmpty() && !pasesPala.isEmpty()){
             Pala = n.registrarNivSuelo(fechaPS,lote, "PALA", cantPala, pasesPala, valorUniPala, valorTotalPala, total);
           
        }
        
        String cantPC=request.getParameter("cantPC");
        String pasesPC=request.getParameter("pasesPC");
        String valorUniPC= request.getParameter("valorUnitarioPC").replace(".", "");
        String valorTotalPC= request.getParameter("valorTotalPC").replace(".", "");
        
        if(!cantPC.isEmpty() && !pasesPC.isEmpty()){
            PC = n.registrarNivSuelo(fechaPS,lote, "PALA CAJON", cantPC, pasesPC, valorUniPC, valorTotalPC, total);
           
        }
        
        String cantPL=request.getParameter("cantPL");
        String pasesPL=request.getParameter("pasesPL");
        String valorUniPL= request.getParameter("valorUnitarioPL").replace(".", "");
        String valorTotalPL= request.getParameter("valorTotalPL").replace(".", "");
        
        if(!cantPL.isEmpty() && !pasesPL.isEmpty()){
             PL = n.registrarNivSuelo(fechaPS,lote, "PALA LASER", cantPL, pasesPL, valorUniPL, valorTotalPL, total);
           
        }
    
        String cantPalo=request.getParameter("cantPalo");
        String pasesPalo=request.getParameter("pasesPalo");
        String valorUniPalo= request.getParameter("valorUnitarioPalo").replace(".", "");
        String valorTotalPalo= request.getParameter("valorTotalPalo").replace(".", "");
        
        if(cantPalo.isEmpty() && !pasesPalo.isEmpty()){
             Palo = n.registrarNivSuelo(fechaPS,lote, "PALO", cantPalo, pasesPalo, valorUniPalo, valorTotalPalo, total);
           
        }
        
        String cantRastra=request.getParameter("cantRastra");
        String pasesRastra=request.getParameter("pasesRastra");
        String valorUniRastra= request.getParameter("valorUnitarioRastra").replace(".", "");
        String valorTotalRastra= request.getParameter("valorTotalRastra").replace(".", "");
        
        if(!cantRastra.isEmpty() && !pasesRastra.isEmpty()){
             Rasta = n.registrarNivSuelo(fechaPS, lote, "RASTRA", cantRastra, pasesRastra, valorUniRastra, valorTotalRastra, total);
           
        }
        
        String cantRastrillo=request.getParameter("cantRast");
        String pasesRastrillo=request.getParameter("pasesRast");
        String valorUniRastrillo= request.getParameter("valorUnitarioRast").replace(".", "");
        String valorTotalRastrillo= request.getParameter("valorTotalRast").replace(".", "");
        
        if(cantRastrillo != null && pasesRastrillo != null){
             Rastrillo = n.registrarNivSuelo(fechaPS, lote, "RASTRILLO", cantRastrillo, pasesRastrillo, valorUniRastrillo, valorTotalRastrillo, total);
           
        }
        
        String cantTaipa=request.getParameter("cantTaipa");
        String pasesTaipa=request.getParameter("pasesTaipa");
        String valorUniTaipa= request.getParameter("valorUnitarioTaipa").replace(".", "");
        String valorTotalTaipa= request.getParameter("valorTotalTaipa").replace(".", "");
        
        if(!cantTaipa.isEmpty() && !pasesTaipa.isEmpty()){
             Taipa = n.registrarNivSuelo(fechaPS, lote, "TAIPA", cantTaipa, pasesTaipa, valorUniTaipa, valorTotalTaipa, total);
           
        }
        
        String cantZanja=request.getParameter("cantZanja");
        String pasesZanja=request.getParameter("pasesZanja");
        String valorUniZanja= request.getParameter("valorUnitarioZanja").replace(".", "");
        String valorTotalZanja= request.getParameter("valorTotalZanja").replace(".", "");
        if(!cantZanja.isEmpty() && !pasesZanja.isEmpty()){
             Zanja = n.registrarNivSuelo(fechaPS, lote, "ZANJA", cantZanja, pasesZanja, valorUniZanja, valorTotalZanja, total);
           
        }
        if(Caba==true || Cinc ==true || Grada ==true || Pala ==true || PC ==true || PL ==true || Palo ==true  || Rasta ==true || Rastrillo ==true || Taipa ==true || Zanja ==true){
         request.getRequestDispatcher("preparacionSuelo.jsp").forward(request, response);
        } else{
            request.getRequestDispatcher("errorRegistro3.jsp").forward(request, response);
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