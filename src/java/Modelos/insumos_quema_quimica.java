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
public class insumos_quema_quimica {
    
    
  
    private String tipo_insumo;
    private String nombre_insumo; 
    private String cantidad_insumo;      
    private String unidad_insumo;
    private String valor_unitario_insumo;
    private String valor_total_insumos;
    private String id_quemaq;
    
    public insumos_quema_quimica(){
        
    }

    public insumos_quema_quimica(String tipo_insumo, String nombre_insumo, String cantidad_insumo, String unidad_insumo, String valor_unitario_insumo, String valor_total_insumos, String id_quemaq) {
        this.tipo_insumo = tipo_insumo;
        this.nombre_insumo = nombre_insumo;
        this.cantidad_insumo = cantidad_insumo;
        this.unidad_insumo = unidad_insumo;
        this.valor_unitario_insumo = valor_unitario_insumo;
        this.valor_total_insumos = valor_total_insumos;
        this.id_quemaq = id_quemaq;
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

    public String getId_quemaq() {
        return id_quemaq;
    }

    public void setId_quemaq(String id_quemaq) {
        this.id_quemaq = id_quemaq;
    }
    

    
}
