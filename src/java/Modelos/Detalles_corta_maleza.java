/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author USUARIO
 */
public class Detalles_corta_maleza {
    private String fecha_mrc;
    private String tipo_manejo_mrc;
    private String cantidad_hectareas_mrc;
    private String valor_hectareas_mrc;
    private String valor_total_mrc;
    private String id_mrc;

    public Detalles_corta_maleza(String fecha_mrc, String tipo_manejo_mrc, String cantidad_hectareas_mrc, String valor_hectareas_mrc, String valor_total_mrc, String id_mrc) {
        this.fecha_mrc = fecha_mrc;
        this.tipo_manejo_mrc = tipo_manejo_mrc;
        this.cantidad_hectareas_mrc = cantidad_hectareas_mrc;
        this.valor_hectareas_mrc = valor_hectareas_mrc;
        this.valor_total_mrc = valor_total_mrc;
        this.id_mrc = id_mrc;
    }

    public String getFecha_mrc() {
        return fecha_mrc;
    }

    public void setFecha_mrc(String fecha_mrc) {
        this.fecha_mrc = fecha_mrc;
    }

    public String getTipo_manejo_mrc() {
        return tipo_manejo_mrc;
    }

    public void setTipo_manejo_mrc(String tipo_manejo_mrc) {
        this.tipo_manejo_mrc = tipo_manejo_mrc;
    }

    public String getCantidad_hectareas_mrc() {
        return cantidad_hectareas_mrc;
    }

    public void setCantidad_hectareas_mrc(String cantidad_hectareas_mrc) {
        this.cantidad_hectareas_mrc = cantidad_hectareas_mrc;
    }

    public String getValor_hectareas_mrc() {
        return valor_hectareas_mrc;
    }

    public void setValor_hectareas_mrc(String valor_hectareas_mrc) {
        this.valor_hectareas_mrc = valor_hectareas_mrc;
    }

    public String getValor_total_mrc() {
        return valor_total_mrc;
    }

    public void setValor_total_mrc(String valor_total_mrc) {
        this.valor_total_mrc = valor_total_mrc;
    }

    public String getId_mrc() {
        return id_mrc;
    }

    public void setId_mrc(String id_mrc) {
        this.id_mrc = id_mrc;
    }

   
    
}
