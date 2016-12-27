/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletsReportesPDF;

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
public class ReporteRiegos extends HttpServlet {

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

                Connection con = null;
                Statement st = null;
                Statement st2 = null;
                Statement st3 = null;
                Statement st4 = null;
                ResultSet rs = null;
                ResultSet rs2 = null;
                ResultSet rs3 = null;
                ResultSet rs4 = null;
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/simpca", "root", "9510");

                st = (Statement) con.createStatement();
                st2 = (Statement) con.createStatement();
                st3 = (Statement) con.createStatement();
                st4 = (Statement) con.createStatement();
                rs = st.executeQuery("SELECT usuario.cedula,nombre,apellido,telefono FROM usuario JOIN lote ON lote.usuario_cedula=usuario.cedula WHERE lote.num_lote='" + num_lote + "'");
                rs2 = st2.executeQuery("SELECT * from riego where num_lote ='" + num_lote + "'");
                rs3 = st3.executeQuery("SELECT * from riego where num_lote ='" + num_lote + "'");
                rs4 = st4.executeQuery("SELECT * from riego where num_lote ='" + num_lote + "'");
                if (con != null) {
                    Document documento = new Document(A4.rotate());
                   PdfWriter writer = PdfWriter.getInstance(documento, out);
                   FooterPiePaginaiText footer = new FooterPiePaginaiText();
                    writer.setPageEvent(footer);
                    
                    documento.open();
                    
                    try {

                        Image imagenes = Image.getInstance("C:\\Users\\USUARIO\\Desktop\\simpca\\SIMPCA Coagronorte\\web\\ImagenesR\\coagronorte-slogan.png");
                        imagenes.setAlignment(Element.ALIGN_RIGHT);
                        imagenes.scaleToFit(200, 200);
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
                        par1.add(new Phrase("REPORTE RIEGOS", fonttitulo));
                        par1.setAlignment(Element.ALIGN_CENTER);
                        par1.add(new Phrase(Chunk.NEWLINE));

                        documento.add(par1);

                        PdfPTable tabla = new PdfPTable(5);
                        FontFactory.registerDirectories();
                        documento.add(new Paragraph("\n"));
                        PdfPCell celda1 = new PdfPCell(new Paragraph("Fecha", FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));
                        PdfPCell celda2 = new PdfPCell(new Paragraph("Tipo de Riego", FontFactory.getFont("Times New Roman", 12,
                                Font.BOLD, BaseColor.BLACK)));
                        PdfPCell celda3 = new PdfPCell(new Paragraph("Cantidad Mano Obra", FontFactory.getFont("Times New Roman", 12,
                                Font.BOLD, BaseColor.BLACK)));
                        PdfPCell celda4 = new PdfPCell(new Paragraph("Valor Mano Obra", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        PdfPCell celda5 = new PdfPCell(new Paragraph("Valor Total Mano Obra", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));

                        tabla.addCell(celda1);
                        tabla.addCell(celda2);
                        tabla.addCell(celda3);
                        tabla.addCell(celda4);
                        tabla.addCell(celda5);
                        
                        while (rs2.next()) {

                            tabla.addCell(rs2.getString("fecha_riego"));
                            tabla.addCell(rs2.getString("tipo_riego"));
                            tabla.addCell(rs2.getString("cantidad_mano_obra_riego"));
                            tabla.addCell(rs2.getString("valor_mano_obra_riego"));
                            tabla.addCell(rs2.getString("total_mano_obra"));
                            
                        }
                        documento.add(tabla);
                        
                       
                        Paragraph par4 = new Paragraph();
                        
                        par4.add(new Phrase(Chunk.NEWLINE));
                        par4.add(new Phrase(Chunk.NEWLINE));
                        par4.add(new Phrase(Chunk.NEWLINE));
                        Font fontFooter2 = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD, BaseColor.BLACK);
                        par4.add(new Phrase("REPORTE INSUMOS RIEGO", fontFooter2));
                        par4.setAlignment(Element.ALIGN_CENTER);
                        par4.add(new Phrase(Chunk.NEWLINE));
                        par4.add(new Phrase(Chunk.NEWLINE));
                        documento.add(par4);
                       
                        PdfPTable tabla2 = new PdfPTable(7);
                        FontFactory.registerDirectories();
                        PdfPCell celda10 = new PdfPCell(new Paragraph("Tipo de Riego", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda10.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda20 = new PdfPCell(new Paragraph("Cantidad Aceite", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda20.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda30 = new PdfPCell(new Paragraph("Valor Aceite", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda30.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda40 = new PdfPCell(new Paragraph("Valor Total Aceite", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda40.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda50 = new PdfPCell(new Paragraph("Cantidad Combustible", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda50.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda60 = new PdfPCell(new Paragraph("Valor Combustible", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda60.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda70 = new PdfPCell(new Paragraph("Valor Total Combustible", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda70.setHorizontalAlignment(Element.ALIGN_CENTER);
                        

                        tabla2.addCell(celda10);
                        tabla2.addCell(celda20);
                        tabla2.addCell(celda30);
                        tabla2.addCell(celda40);
                        tabla2.addCell(celda50);
                        tabla2.addCell(celda60);
                        tabla2.addCell(celda70);
                        
                        while(rs3.next()){
                            tabla2.addCell(rs3.getString("tipo_riego"));
                            tabla2.addCell(rs3.getString("cantidad_aceite"));
                            tabla2.addCell(rs3.getString("valor_aceite"));
                            tabla2.addCell(rs3.getString("total_aceite"));
                            tabla2.addCell(rs3.getString("cantidad_combustible"));
                            tabla2.addCell(rs3.getString("valor_combustible"));
                            tabla2.addCell(rs3.getString("total_combustible_riego"));
                        }

                        documento.add(tabla2);
                        
                        Paragraph par8 = new Paragraph();
                        
                        par8.add(new Phrase(Chunk.NEWLINE));
                        par8.add(new Phrase(Chunk.NEWLINE));
                        par8.add(new Phrase(Chunk.NEWLINE));
                        Font fontFooter4 = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD, BaseColor.ORANGE);
                        par8.add(new Phrase("REPORTE COSTOS ADICIONALES", fontFooter4));
                        par8.setAlignment(Element.ALIGN_CENTER);
                        par8.add(new Phrase(Chunk.NEWLINE));
                        par8.add(new Phrase(Chunk.NEWLINE));
                        documento.add(par8);
                       
                        PdfPTable tabla3 = new PdfPTable(8);
                        FontFactory.registerDirectories();
                        PdfPCell celda80 = new PdfPCell(new Paragraph("Tipo de Riego", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda80.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda90 = new PdfPCell(new Paragraph("Cantidad Alquiler", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda90.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda100 = new PdfPCell(new Paragraph("Valor Alquiler", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda100.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda110 = new PdfPCell(new Paragraph("Valor Total Alquiler", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda110.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda120 = new PdfPCell(new Paragraph("Valor Tarifa Distrito", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda120.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda130 = new PdfPCell(new Paragraph("Valor Tarifa Corponor", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda130.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda140 = new PdfPCell(new Paragraph("Valor Total Tarifa", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda140.setHorizontalAlignment(Element.ALIGN_CENTER);
                        PdfPCell celda150 = new PdfPCell(new Paragraph("Costo Total", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        celda150.setHorizontalAlignment(Element.ALIGN_CENTER);

                        tabla3.addCell(celda80);
                        tabla3.addCell(celda90);
                        tabla3.addCell(celda100);
                        tabla3.addCell(celda110);
                        tabla3.addCell(celda120);
                        tabla3.addCell(celda130);
                        tabla3.addCell(celda140);
                        tabla3.addCell(celda150);
                        
                        while(rs4.next()){
                            tabla3.addCell(rs4.getString("tipo_riego"));
                            tabla3.addCell(rs4.getString("cantidad_alquiler_riego"));
                            tabla3.addCell(rs4.getString("valor_alquiler_riego"));
                            tabla3.addCell(rs4.getString("total_alquiler_riego"));
                            tabla3.addCell(rs4.getString("valor_tarifa_districto_riego"));
                            tabla3.addCell(rs4.getString("valor_tarifa_corponor_riego"));
                            tabla3.addCell(rs4.getString("total_tarifa_riego"));
                            tabla3.addCell(rs4.getString("valor_total_riego"));
                        }

                        documento.add(tabla3);

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