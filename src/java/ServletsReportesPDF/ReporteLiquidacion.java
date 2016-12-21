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
public class ReporteLiquidacion extends HttpServlet {

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
                ResultSet rs = null;
                ResultSet rs2 = null;
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");

                st = (Statement) con.createStatement();
                st2 = (Statement) con.createStatement();
                rs = st.executeQuery("SELECT usuario.cedula,nombre,apellido,telefono FROM usuario JOIN lote ON lote.usuario_cedula=usuario.cedula WHERE lote.num_lote='" + num_lote + "'");
                rs2 = st2.executeQuery("SELECT * from liquidacion where num_lote ='" + num_lote + "'");
                if (con != null) {
                    Document documento = new Document(A4.rotate());
                   PdfWriter writer = PdfWriter.getInstance(documento, out);
                   FooterPiePaginaiText footer = new FooterPiePaginaiText();
                    writer.setPageEvent(footer);
                    
                    documento.open();
                    
                    try {

                        Image imagenes = Image.getInstance("C:\\Users\\LENOVO\\Desktop\\Proyecto_SIMPCA_1\\web\\ImagenesR\\logof.png");
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
                        Font fontUsuario = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.NORMAL, BaseColor.DARK_GRAY);
                        par7.add(new Phrase("Nombre:   " +nombre +"  " +Apellido , fontUsuario));
                        par7.add(new Phrase("\nc.c:   " +cedula , fontUsuario));
                        par7.setAlignment(Element.ALIGN_LEFT);
                        par7.add(new Phrase(Chunk.NEWLINE));
                        documento.add(par7);

                        Paragraph par3 = new Paragraph();
                        Font fontDescri = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.NORMAL, BaseColor.DARK_GRAY);
                        par3.add(new Phrase("Numero Lote:\n " + num_lote, fontDescri));
                        par3.setAlignment(Element.ALIGN_CENTER);
                        par3.add(new Phrase(Chunk.NEWLINE));
                        documento.add(par3);

                    } catch (Exception eX) {
                        eX.getMessage();
                    }

                    try {
                        
                        Paragraph par1 = new Paragraph();
                        Font fonttitulo = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD, BaseColor.ORANGE);
                        par1.add(new Phrase(Chunk.NEWLINE));
                        par1.add(new Phrase(Chunk.NEWLINE));
                        par1.add(new Phrase(Chunk.NEWLINE));
                        par1.add(new Phrase("REPORTE LIQUIDACIÓN", fonttitulo));
                        par1.setAlignment(Element.ALIGN_CENTER);
                        par1.add(new Phrase(Chunk.NEWLINE));

                        documento.add(par1);

                        PdfPTable tabla = new PdfPTable(14);
                        FontFactory.registerDirectories();
                        documento.add(new Paragraph("\n"));
                        PdfPCell celda1 = new PdfPCell(new Paragraph("Fecha", FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));
                        PdfPCell celda2 = new PdfPCell(new Paragraph("Número de Tiquete", FontFactory.getFont("Times New Roman", 12,
                                Font.BOLD, BaseColor.BLACK)));
                        PdfPCell celda3 = new PdfPCell(new Paragraph("Peso Neto", FontFactory.getFont("Times New Roman", 12,
                                Font.BOLD, BaseColor.BLACK)));
                        PdfPCell celda4 = new PdfPCell(new Paragraph("Peso Final", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        PdfPCell celda5 = new PdfPCell(new Paragraph("F(24)", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        PdfPCell celda6 = new PdfPCell(new Paragraph("F(4)", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        PdfPCell celda7 = new PdfPCell(new Paragraph("Valor Unitario", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        PdfPCell celda8 = new PdfPCell(new Paragraph("Cantidad Bultos", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        PdfPCell celda9 = new PdfPCell(new Paragraph("Kilos Verdes", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        PdfPCell celda10 = new PdfPCell(new Paragraph("Total", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        PdfPCell celda11 = new PdfPCell(new Paragraph("Peso Final", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        PdfPCell celda12 = new PdfPCell(new Paragraph("Total Kilos Verdes", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        PdfPCell celda13 = new PdfPCell(new Paragraph("Total Valor Unitario", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));
                        PdfPCell celda14 = new PdfPCell(new Paragraph("Valor Total", FontFactory.getFont("Times New Roman", 12, Font.BOLD,
                                BaseColor.BLACK)));

                        tabla.addCell(celda1);
                        tabla.addCell(celda2);
                        tabla.addCell(celda3);
                        tabla.addCell(celda4);
                        tabla.addCell(celda5);
                        tabla.addCell(celda6);
                        tabla.addCell(celda7);
                        tabla.addCell(celda8);
                        tabla.addCell(celda9);
                        tabla.addCell(celda10);
                        tabla.addCell(celda11);
                        tabla.addCell(celda12);
                        tabla.addCell(celda13);
                        tabla.addCell(celda14);
                        
                        while (rs2.next()) {

                            tabla.addCell(rs2.getString("fecha_liquidacion"));
                            tabla.addCell(rs2.getString("n_tiquete_liquidacion"));
                            tabla.addCell(rs2.getString("peso_neto_liquidacion"));
                            tabla.addCell(rs2.getString("peso_final_liquidacion"));
                            tabla.addCell(rs2.getString("f_24_liquidacion"));
                            tabla.addCell(rs2.getString("f_4_liquidacion"));
                            tabla.addCell(rs2.getString("valor_unitario_liquidacion"));
                            tabla.addCell(rs2.getString("bultos_liquidacion"));
                            tabla.addCell(rs2.getString("kls_verdes_liquidacion"));
                            tabla.addCell(rs2.getString("valor_total_liquidacion"));
                            tabla.addCell(rs2.getString("total_liquidacion"));
                            tabla.addCell(rs2.getString("total_peso_final"));
                            tabla.addCell(rs2.getString("total_kilos_verdes"));
                            tabla.addCell(rs2.getString("total_valor_unitario"));
                            
                        }
                        documento.add(tabla);

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