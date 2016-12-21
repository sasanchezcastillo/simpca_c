
package Modelos;


public class PreparacionSuelo {
    
    private String fecha_preparacions;
    private String tipo_preparacions;
    private String cantidad_hect_horas_preparacions;
    private String pases_preparacions;
    private String valor_unitario_preparacions;
    private String valor_total_preparacions;
    private String total_preparacions;
    private String num_lote;
    private String id_preparacions;

    public PreparacionSuelo(String fecha_preparacions, String tipo_preparacions, String cantidad_hect_horas_preparacions, String pases_preparacions, String valor_unitario_preparacions, String valor_total_preparacions, String total_preparacions, String num_lote, String id_preparacions) {
        this.fecha_preparacions = fecha_preparacions;
        this.tipo_preparacions = tipo_preparacions;
        this.cantidad_hect_horas_preparacions = cantidad_hect_horas_preparacions;
        this.pases_preparacions = pases_preparacions;
        this.valor_unitario_preparacions = valor_unitario_preparacions;
        this.valor_total_preparacions = valor_total_preparacions;
        this.total_preparacions = total_preparacions;
        this.num_lote = num_lote;
        this.id_preparacions = id_preparacions;
    }

    public String getFecha_preparacions() {
        return fecha_preparacions;
    }

    public void setFecha_preparacions(String fecha_preparacions) {
        this.fecha_preparacions = fecha_preparacions;
    }

    public String getTipo_preparacions() {
        return tipo_preparacions;
    }

    public void setTipo_preparacions(String tipo_preparacions) {
        this.tipo_preparacions = tipo_preparacions;
    }

    public String getCantidad_hect_horas_preparacions() {
        return cantidad_hect_horas_preparacions;
    }

    public void setCantidad_hect_horas_preparacions(String cantidad_hect_horas_preparacions) {
        this.cantidad_hect_horas_preparacions = cantidad_hect_horas_preparacions;
    }

    public String getPases_preparacions() {
        return pases_preparacions;
    }

    public void setPases_preparacions(String pases_preparacions) {
        this.pases_preparacions = pases_preparacions;
    }

    public String getValor_unitario_preparacions() {
        return valor_unitario_preparacions;
    }

    public void setValor_unitario_preparacions(String valor_unitario_preparacions) {
        this.valor_unitario_preparacions = valor_unitario_preparacions;
    }

    public String getValor_total_preparacions() {
        return valor_total_preparacions;
    }

    public void setValor_total_preparacions(String valor_total_preparacions) {
        this.valor_total_preparacions = valor_total_preparacions;
    }

    public String getTotal_preparacions() {
        return total_preparacions;
    }

    public void setTotal_preparacions(String total_preparacions) {
        this.total_preparacions = total_preparacions;
    }

    public String getNum_lote() {
        return num_lote;
    }

    public void setNum_lote(String num_lote) {
        this.num_lote = num_lote;
    }

    public String getId_preparacions() {
        return id_preparacions;
    }

    public void setId_preparacions(String id_preparacions) {
        this.id_preparacions = id_preparacions;
    }
   
}
