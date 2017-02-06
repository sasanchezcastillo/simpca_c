
package Modelos;


public class Macheteada {
    
    private String fecha_mchd;
    private String cantidad_mano_obra_mchd;
    private String precio_mano_obra_mchd;
    private String total_mano_obra_mchd;
    private String valor_total_mchd;
    private String num_lote;
    private String id_mchd;

    public Macheteada(String fecha_mchd, String cantidad_mano_obra_mchd, String precio_mano_obra_mchd, String total_mano_obra_mchd, String valor_total_mchd, String num_lote, String id_mchd) {
        this.fecha_mchd = fecha_mchd;
        this.cantidad_mano_obra_mchd = cantidad_mano_obra_mchd;
        this.precio_mano_obra_mchd = precio_mano_obra_mchd;
        this.total_mano_obra_mchd = total_mano_obra_mchd;
        this.valor_total_mchd = valor_total_mchd;
        this.num_lote = num_lote;
        this.id_mchd = id_mchd;
    }

    public String getFecha_mchd() {
        return fecha_mchd;
    }

    public void setFecha_mchd(String fecha_mchd) {
        this.fecha_mchd = fecha_mchd;
    }

    public String getCantidad_mano_obra_mchd() {
        return cantidad_mano_obra_mchd;
    }

    public void setCantidad_mano_obra_mchd(String cantidad_mano_obra_mchd) {
        this.cantidad_mano_obra_mchd = cantidad_mano_obra_mchd;
    }

    public String getPrecio_mano_obra_mchd() {
        return precio_mano_obra_mchd;
    }

    public void setPrecio_mano_obra_mchd(String precio_mano_obra_mchd) {
        this.precio_mano_obra_mchd = precio_mano_obra_mchd;
    }

    public String getTotal_mano_obra_mchd() {
        return total_mano_obra_mchd;
    }

    public void setTotal_mano_obra_mchd(String total_mano_obra_mchd) {
        this.total_mano_obra_mchd = total_mano_obra_mchd;
    }

    public String getValor_total_mchd() {
        return valor_total_mchd;
    }

    public void setValor_total_mchd(String valor_total_mchd) {
        this.valor_total_mchd = valor_total_mchd;
    }

    public String getNum_lote() {
        return num_lote;
    }

    public void setNum_lote(String num_lote) {
        this.num_lote = num_lote;
    }

    public String getId_mchd() {
        return id_mchd;
    }

    public void setId_mchd(String id_mchd) {
        this.id_mchd = id_mchd;
    }
    
    
}