/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import java.sql.PreparedStatement;  
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JOptionPane; 


/**
 * @author Grupo de Proyecto ADSI (2015-2017)
 * Adriana Milena Vera R.
 * Ana Karime Sepulveda C.
 * Angelica Maria Barrientos V.
 * Carlos Eduardo Torres N.
 * Deiby Brayan Diaz R.
 * Drawly Celied Ortega G.
 * Heyllem Dayana Sandoval R.
 * Jose Luis Alvarez R.
 * Jose Yesid Olivar
 * Kelly Yulieth Lopez N.
 * Luis Enrique Gelvis C.
 * Naudy Javier Rincon M.
 * Paola Andrea Paladinez S.
 * Samuel Antonio Sanchez
 * ///////////////////////////////////////
 * Clase seleccionLote, Contiene los metodos:
 * getContactos
 */

public class seleccionLote extends ConexionBD{
    
    private String num_lote;
    private String usuario_cedula;
    private String area_lote;
    private String arriendo_lote;
    private ResultSet resultado;
    private ArrayList<String> lista;
    
//Constructor de la Clase seleccionLote Vacio
    public seleccionLote() {
    }
    
//Constructor de la Clase seleccionLote 
public seleccionLote(String num_lote, String usuario_cedula, String area_lote, String arriendo_lote) {
    this.num_lote = num_lote;
    this.usuario_cedula = usuario_cedula;
    this.area_lote = area_lote;
    this.arriendo_lote = arriendo_lote;
}

//Get and Set de los Atributos Anteriores
    public String getNum_lote() {
        return num_lote;
    }

    public void setNum_lote(String num_lote) {
        this.num_lote = num_lote;
    }

    public String getUsuario_cedula() {
        return usuario_cedula;
    }

    public void setUsuario_cedula(String usuario_cedula) {
        this.usuario_cedula = usuario_cedula;
    }

    public String getArea_lote() {
        return area_lote;
    }

    public void setArea_lote(String area_lote) {
        this.area_lote = area_lote;
    }

    public String getArriendo_lote() {
        return arriendo_lote;
    }

    public void setArriendo_lote(String arriendo_lote) {
        this.arriendo_lote = arriendo_lote;
    }
    
    
    /**
     * Metodo getContactos: Permite mostrar el numero de lotes asociados a un usuario
     * @param cedula
     * @return Arraylist
     */
   public ArrayList<String> getContactos(String cedula){
        lista = new ArrayList();
        PreparedStatement pst = null;
        
        try {
            String sql = "select num_lote from lote where usuario_cedula ='"+cedula+"'";
            stmt=getConnection().prepareStatement(sql);
            resultado=stmt.executeQuery(sql);
            
            System.out.println("Lo que arroja la consulta "+resultado);
            
            while(resultado.next()){
                lista.add(
                    resultado.getString("num_lote")
                );
                  
            }
            
        } catch (Exception e) {
            System.err.println("ER"+e);
        }
        return lista;
    }
    
   
//Prueba del ArrayList
     public static void main(String[] args) {
    seleccionLote c = new seleccionLote();
    JOptionPane.showMessageDialog(null,c.getContactos("0"));
    }
}
