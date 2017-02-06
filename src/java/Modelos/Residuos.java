
package Modelos;


public class Residuos {
    
    private String fecha_mrc;
    private String tipo_manejo_mrc;
    private String cantidad_hectareas_mrc;
    private String valor_hectareas_mrc;
    private String valor_total_mrc;
    private String num_lote;
    
    public Residuos() {
    }

    public Residuos(String fecha_mrc, String tipo_manejo_mrc, String cantidad_hectareas_mrc, String valor_hectareas_mrc, String valor_total_mrc, String num_lote) {
        this.fecha_mrc = fecha_mrc;
        this.tipo_manejo_mrc = tipo_manejo_mrc;
        this.cantidad_hectareas_mrc = cantidad_hectareas_mrc;
        this.valor_hectareas_mrc = valor_hectareas_mrc;
        this.valor_total_mrc = valor_total_mrc;
        this.num_lote = num_lote;
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

    public String getNum_lote() {
        return num_lote;
    }

    public void setNum_lote(String num_lote) {
        this.num_lote = num_lote;
    }

   
    
}
