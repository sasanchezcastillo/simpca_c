/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletsReportesPDF;

import Controladores.ConexionBD;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import static com.itextpdf.text.PageSize.A4;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LENOVO
 */
public class ReporteAbonadas extends HttpServlet {

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
        
        String num_lote = request.getParameter("num_lote");

        response.setContentType("application/pdf");
        OutputStream out = response.getOutputStream();
        
        
        try {
            try {

                Statement st = null;
                Statement st2 = null;
                Statement st3 = null;
                Statement st4 = null;
                Statement st5 = null;
                ResultSet rs = null;
                ResultSet rs2 = null;
                ResultSet rs3 = null;
                ResultSet rs4 = null;
                ResultSet rs5 = null;
                java.sql.Connection con = new ConexionBD().ConexionBD2();
                

                st = (Statement) con.createStatement();
                st2 = (Statement) con.createStatement();
                st3 = (Statement) con.createStatement();
                st4 = (Statement) con.createStatement();
                st5 = (Statement) con.createStatement();
                rs = st.executeQuery("SELECT usuario.cedula,nombre,apellido,telefono FROM usuario JOIN lote ON lote.usuario_cedula=usuario.cedula WHERE lote.num_lote='" + num_lote + "'");
                rs2 = st2.executeQuery("SELECT * from abonada a JOIN insumos_abonada i on i.id_abonada = a.id_abonada where a.num_lote ='" + num_lote + "'");
                rs3 = st3.executeQuery("SELECT * from abonada a JOIN insumos_abonada i on i.id_abonada = a.id_abonada where a.num_lote ='" + num_lote + "'");
                rs4 = st4.executeQuery("select * from abonada where num_lote = '"+num_lote+"'");
                rs5 = st5.executeQuery("SELECT * from abonada a JOIN insumos_abonada i on i.id_abonada = a.id_abonada where a.num_lote ='" + num_lote + "'");
                if (con != null) {
                    Document documento = new Document(A4.rotate());
                   PdfWriter writer = PdfWriter.getInstance(documento, out);
                   FooterPiePaginaiText footer = new FooterPiePaginaiText();
                    writer.setPageEvent(footer);
                    
                    documento.open();
                    
                    try {

                        Image imagenes = Image.getInstance("C:\\Users\\USUARIO\\Desktop\\simpca\\SIMPCA Coagronorte\\web\\ImagenesR\\coagronorte-slogan.png");
                        imagenes.setAlignment(Element.ALIGN_RIGHT);
                        imagenes.scaleToFit(120, 120);
                        documento.add(imagenes);
                       

                        
                        //documento.add(imagenes);
                        Paragraph par21 = new Paragraph();
                        Font fontDescrip = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.ITALIC, BaseColor.BLACK);
                        par21.add(new Phrase("Cooperativa Agropecuaria de Norte de Santander", fontDescrip));
                        par21.setAlignment(Element.ALIGN_CENTER);
                        par21.add(new Phrase(Chunk.NEWLINE));
                        documento.add(par21);
                        
                         String nombre= null;
                        String Apellido= null;
                        String cedula= null;
                        while (rs.next()) {
                            nombre =(rs.getString("nombre"));
                            cedula =(rs.getString("cedula"));
                            Apellido=(rs.getString("apellido"));
                        }
                        
                        Paragraph par2 = new Paragraph();
                        Font fontfecha = new Font(Font.FontFamily.TIMES_ROMAN, 13, Font.NORMAL, BaseColor.BLACK);
                        Date date = new Date();
                        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
                        par2.add(new Paragraph("Fecha:  " + dateFormat.format(date), fontfecha));
                        //par2.add(new Paragraph(new Date().toString()));
                        par2.setAlignment(Element.ALIGN_RIGHT);;
                        documento.add(par2);
                        
                        Paragraph par7 = new Paragraph();
                        Font fontUsuario = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.NORMAL, BaseColor.BLACK);
                        par7.add(new Phrase("Nombre:   " +nombre +"  " +Apellido , fontUsuario));
                        par7.add(new Phrase("\nc.c:   " +cedula , fontUsuario));
                        par7.setAlignment(Element.ALIGN_LEFT);
                        par7.add(new Phrase(Chunk.NEWLINE));
                        documento.add(par7);

                        Paragraph par3 = new Paragraph();
                        Font fontDescri = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.NORMAL, BaseColor.BLACK);
                        par3.add(new Phrase("Numero Lote:\n " + num_lote, fontDescri));
                        par3.setAlignment(Element.ALIGN_CENTER);
                        par3.add(new Phrase(Chunk.NEWLINE));
                        documento.add(par3);

                    } catch (Exception eX) {
                        eX.getMessage();
                    }

                    try {
                        
                        Paragraph par1 = new Paragraph();
                        Font fonttitulo = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD, BaseColor.BLACK);
                        par1.add(new Phrase(Chunk.NEWLINE));
                        par1.add(new Phrase(Chunk.NEWLINE));
                        par1.add(new Phrase(Chunk.NEWLINE));
                        par1.add(new Phrase("REPORTE ABONADAS", fonttitulo));
                        par1.setAlignment(Element.ALIGN_CENTER);
                        par1.add(new Phrase(Chunk.NEWLINE));

                        documento.add(par1);

                        PdfPTable tabla = new PdfPTable(6);
                        FontFactory.registerDirectories();
                        documento.add(new Paragraph("\n"));
                        PdfPCell celda1 = new PdfPCell(new Paragraph("Fecha", FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));
                        PdfPCell celda2 = new PdfPCell(new Paragraph("Tipo Abonada", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        PdfPCell celda3 = new PdfPCell(new Paragraph("Cantidad Bultos", FontFactory.getFont("Times New Roman", 12,
                                Font.BOLD, BaseColor.BLACK)));
                        PdfPCell celda4 = new PdfPCell(new Paragraph("Costo Bulto", FontFactory.getFont("Times New Roman", 12,
                                Font.BOLD, BaseColor.BLACK)));
                        PdfPCell celda5 = new PdfPCell(new Paragraph("Valor Total Bultos", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        PdfPCell celda6 = new PdfPCell(new Paragraph("Unidad", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));

                        tabla.addCell(celda1);
                        tabla.addCell(celda2);
                        tabla.addCell(celda3);
                        tabla.addCell(celda4);
                        tabla.addCell(celda5);
                        tabla.addCell(celda6);
                        
                        while (rs2.next()) {

                            tabla.addCell(rs2.getString("fecha_abonada"));
                            tabla.addCell(rs2.getString("nombre_abonada"));
                            tabla.addCell(rs2.getString("cantidad_bulto_aplicado_abonada"));
                            tabla.addCell(rs2.getString("costo_unitario_bulto_abonada"));
                            tabla.addCell(rs2.getString("valor_total_bulto_abonada"));
                            tabla.addCell(rs2.getString("unidad_mano_obra_abonada"));
                            
                        }
                        documento.add(tabla);
                        
                        } catch (Exception eX) {
                        eX.getMessage();
                    }
                    
                    try {
                        Paragraph par4 = new Paragraph();
                        
                        par4.add(new Phrase(Chunk.NEWLINE));
                        par4.add(new Phrase(Chunk.NEWLINE));
                        par4.add(new Phrase(Chunk.NEWLINE));
                        Font fontFooter2 = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD, BaseColor.BLACK);
                        par4.add(new Phrase("REPORTE MANO DE OBRA ABONADAS", fontFooter2));
                        par4.setAlignment(Element.ALIGN_CENTER);
                        par4.add(new Phrase(Chunk.NEWLINE));
                        par4.add(new Phrase(Chunk.NEWLINE));
                        documento.add(par4);
                       
                        PdfPTable tabla2 = new PdfPTable(3);
                        FontFactory.registerDirectories();
                        PdfPCell celda10 = new PdfPCell(new Paragraph("Cantidad Mano Obra", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda10.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda20 = new PdfPCell(new Paragraph("Costo Mano Obra", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda20.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda30 = new PdfPCell(new Paragraph("Valor Total Mano Obra", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda30.setHorizontalAlignment(Element.ALIGN_CENTER);

                        tabla2.addCell(celda10);
                        tabla2.addCell(celda20);
                        tabla2.addCell(celda30);
                        
                        while(rs3.next()){
                            tabla2.addCell(rs3.getString("cantidad_mano_obra_abonada"));
                            tabla2.addCell(rs3.getString("costo_unitario_mano_obra_abonada"));
                            tabla2.addCell(rs3.getString("valor_total_mano_obra_abonada"));
                        }

                        documento.add(tabla2);
                        
                        } catch (Exception eX) {
                        eX.getMessage();
                    }
                    
                    try {
                        Paragraph par11 = new Paragraph();
                        
                        par11.add(new Phrase(Chunk.NEWLINE));
                        par11.add(new Phrase(Chunk.NEWLINE));
                        par11.add(new Phrase(Chunk.NEWLINE));
                        Font fontFooter3 = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD, BaseColor.BLACK);
                        par11.add(new Phrase("OTROS", fontFooter3));
                        par11.setAlignment(Element.ALIGN_CENTER);
                        par11.add(new Phrase(Chunk.NEWLINE));
                        par11.add(new Phrase(Chunk.NEWLINE));
                        documento.add(par11);
                       
                        PdfPTable tabla3 = new PdfPTable(4);
                        FontFactory.registerDirectories();
                        PdfPCell celda21 = new PdfPCell(new Paragraph("Cantidad Transporte", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda21.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda22 = new PdfPCell(new Paragraph("Costo Transporte", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda22.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda23 = new PdfPCell(new Paragraph("Valor Total Transporte", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda23.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda24 = new PdfPCell(new Paragraph("Valor Total Abonada", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda24.setHorizontalAlignment(Element.ALIGN_CENTER);

                        tabla3.addCell(celda21);
                        tabla3.addCell(celda22);
                        tabla3.addCell(celda23);
                        tabla3.addCell(celda24);
                        
                        while(rs4.next()){
                            tabla3.addCell(rs4.getString("cantidad_transporte_abonada"));
                            tabla3.addCell(rs4.getString("costo_transporte_abonada"));
                            tabla3.addCell(rs4.getString("valor_total_transporte_abonada"));
                            tabla3.addCell(rs4.getString("valor_total_abonada"));
                        }

                        documento.add(tabla3);
                        
                        } catch (Exception eX) {
                        eX.getMessage();
                    }
                    
                    try{
                        Paragraph par7 = new Paragraph();
                        
                        par7.add(new Phrase(Chunk.NEWLINE));
                        par7.add(new Phrase(Chunk.NEWLINE));
                        par7.add(new Phrase(Chunk.NEWLINE));
                        Font fontFooter4 = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD, BaseColor.BLACK);
                        par7.add(new Phrase("REPORTE INSUMOS ABONADAS", fontFooter4));
                        par7.setAlignment(Element.ALIGN_CENTER);
                        par7.add(new Phrase(Chunk.NEWLINE));
                        par7.add(new Phrase(Chunk.NEWLINE));
                        documento.add(par7);
                       
                        PdfPTable tabla4 = new PdfPTable(6);
                        FontFactory.registerDirectories();
                        PdfPCell celda31 = new PdfPCell(new Paragraph("Tipo", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda31.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda32 = new PdfPCell(new Paragraph("Nombre", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda32.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda33 = new PdfPCell(new Paragraph("Cantidad", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda33.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda34 = new PdfPCell(new Paragraph("Unidad", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda34.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda35 = new PdfPCell(new Paragraph("Valor Unitario", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda35.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda36 = new PdfPCell(new Paragraph("Valor Total", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda36.setHorizontalAlignment(Element.ALIGN_CENTER);
                        

                        tabla4.addCell(celda31);
                        tabla4.addCell(celda32);
                        tabla4.addCell(celda33);
                        tabla4.addCell(celda34);
                        tabla4.addCell(celda35);
                        tabla4.addCell(celda36);
                        
                        while(rs5.next()){
                            tabla4.addCell(rs5.getString("tipo_insumo"));
                            tabla4.addCell(rs5.getString("nombre_insumo"));
                            tabla4.addCell(rs5.getString("cantidad_insumo"));
                            tabla4.addCell(rs5.getString("unidad_insumo"));
                            tabla4.addCell(rs5.getString("valor_unitario_insumo"));
                            tabla4.addCell(rs5.getString("valor_total_insumos"));
                        }

                        documento.add(tabla4);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    
                    
                    documento.close();
                
                }
            } catch (Exception e) {
                e.getMessage();
            }

        } finally {
            out.close();
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