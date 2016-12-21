/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletsReportesPDF;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPageEventHelper;

import java.awt.Color;

/**
 *
 * @author Administrador
 */

public class FooterPiePaginaiText extends  PdfPageEventHelper{
    
 public void onEndPage(PdfWriter writer, Document document) {
  ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Sistema de Información para el Manejo de Producción y Costos del Arroz\nSIMPCA"), 420,28,0);
  ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("SIMPCA"), 425,16,0);
 }
 
}
    

