
package Modelos;


public class Abonada {
    
    private String fecha_abonada;
    private String nombre_abonada;
    private String cantidad_mano_obra_abonada;
    private String costo_unitario_mano_obra_abonada;
    private String valor_total_mano_obra_abonada;
    private String cantidad_transporte_abonada;
    private String costo_transporte_abonada;
    private String valor_total_transporte_abonada;
    private String valor_total_abonada;
    private String num_lote;
    private String id_abonada;

    public Abonada(String fecha_abonada, String nombre_abonada, String cantidad_mano_obra_abonada, String costo_unitario_mano_obra_abonada, String valor_total_mano_obra_abonada, String cantidad_transporte_abonada, String costo_transporte_abonada, String valor_total_transporte_abonada, String valor_total_abonada, String num_lote, String id_abonada) {
        this.fecha_abonada = fecha_abonada;
        this.nombre_abonada = nombre_abonada;
        this.cantidad_mano_obra_abonada = cantidad_mano_obra_abonada;
        this.costo_unitario_mano_obra_abonada = costo_unitario_mano_obra_abonada;
        this.valor_total_mano_obra_abonada = valor_total_mano_obra_abonada;
        this.cantidad_transporte_abonada = cantidad_transporte_abonada;
        this.costo_transporte_abonada = costo_transporte_abonada;
        this.valor_total_transporte_abonada = valor_total_transporte_abonada;
        this.valor_total_abonada = valor_total_abonada;
        this.num_lote = num_lote;
        this.id_abonada = id_abonada;
    }

    public String getFecha_abonada() {
        return fecha_abonada;
    }

    public void setFecha_abonada(String fecha_abonada) {
        this.fecha_abonada = fecha_abonada;
    }

    public String getNombre_abonada() {
        return nombre_abonada;
    }

    public void setNombre_abonada(String nombre_abonada) {
        this.nombre_abonada = nombre_abonada;
    }

    public String getCantidad_mano_obra_abonada() {
        return cantidad_mano_obra_abonada;
    }

    public void setCantidad_mano_obra_abonada(String cantidad_mano_obra_abonada) {
        this.cantidad_mano_obra_abonada = cantidad_mano_obra_abonada;
    }

    public String getCosto_unitario_mano_obra_abonada() {
        return costo_unitario_mano_obra_abonada;
    }

    public void setCosto_unitario_mano_obra_abonada(String costo_unitario_mano_obra_abonada) {
        this.costo_unitario_mano_obra_abonada = costo_unitario_mano_obra_abonada;
    }

    public String getValor_total_mano_obra_abonada() {
        return valor_total_mano_obra_abonada;
    }

    public void setValor_total_mano_obra_abonada(String valor_total_mano_obra_abonada) {
        this.valor_total_mano_obra_abonada = valor_total_mano_obra_abonada;
    }

    public String getCantidad_transporte_abonada() {
        return cantidad_transporte_abonada;
    }

    public void setCantidad_transporte_abonada(String cantidad_transporte_abonada) {
        this.cantidad_transporte_abonada = cantidad_transporte_abonada;
    }

    public String getCosto_transporte_abonada() {
        return costo_transporte_abonada;
    }

    public void setCosto_transporte_abonada(String costo_transporte_abonada) {
        this.costo_transporte_abonada = costo_transporte_abonada;
    }

    public String getValor_total_transporte_abonada() {
        return valor_total_transporte_abonada;
    }

    public void setValor_total_transporte_abonada(String valor_total_transporte_abonada) {
        this.valor_total_transporte_abonada = valor_total_transporte_abonada;
    }

    public String getValor_total_abonada() {
        return valor_total_abonada;
    }

    public void setValor_total_abonada(String valor_total_abonada) {
        this.valor_total_abonada = valor_total_abonada;
    }

    public String getNum_lote() {
        return num_lote;
    }

    public void setNum_lote(String num_lote) {
        this.num_lote = num_lote;
    }

    public String getId_abonada() {
        return id_abonada;
    }

    public void setId_abonada(String id_abonada) {
        this.id_abonada = id_abonada;
    }

 
}