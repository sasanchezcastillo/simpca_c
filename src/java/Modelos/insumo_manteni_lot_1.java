/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author SENA-CEDRUM
 */
public class insumo_manteni_lot_1 {
      
    private String tipo_insumo;
    private String nombre_insumo;
    private String cantidad_insumo;
    private String unidad_insumo; 
    private String valor_unitario_insumo;      
    private String valor_total_insumos;
    private String id_mntlote;
    
    
   public  insumo_manteni_lot_1(){
       
   }

    public insumo_manteni_lot_1(String tipo_insumo, String nombre_insumo, String cantidad_insumo, String unidad_insumo, String valor_unitario_insumo, String valor_total_insumos, String id_mntlote) {
        this.tipo_insumo = tipo_insumo;
        this.nombre_insumo = nombre_insumo;
        this.cantidad_insumo = cantidad_insumo;
        this.unidad_insumo = unidad_insumo;
        this.valor_unitario_insumo = valor_unitario_insumo;
        this.valor_total_insumos = valor_total_insumos;
        this.id_mntlote = id_mntlote;
    }

    public String getTipo_insumo() {
        return tipo_insumo;
    }

    public void setTipo_insumo(String tipo_insumo) {
        this.tipo_insumo = tipo_insumo;
    }

    public String getNombre_insumo() {
        return nombre_insumo;
    }

    public void setNombre_insumo(String nombre_insumo) {
        this.nombre_insumo = nombre_insumo;
    }

    public String getCantidad_insumo() {
        return cantidad_insumo;
    }

    public void setCantidad_insumo(String cantidad_insumo) {
        this.cantidad_insumo = cantidad_insumo;
    }

    public String getUnidad_insumo() {
        return unidad_insumo;
    }

    public void setUnidad_insumo(String unidad_insumo) {
        this.unidad_insumo = unidad_insumo;
    }

    public String getValor_unitario_insumo() {
        return valor_unitario_insumo;
    }

    public void setValor_unitario_insumo(String valor_unitario_insumo) {
        this.valor_unitario_insumo = valor_unitario_insumo;
    }

    public String getValor_total_insumos() {
        return valor_total_insumos;
    }

    public void setValor_total_insumos(String valor_total_insumos) {
        this.valor_total_insumos = valor_total_insumos;
    }

    public String getId_mntlote() {
        return id_mntlote;
    }

    public void setId_mntlote(String id_mntlote) {
        this.id_mntlote = id_mntlote;
    }
    
}

    

