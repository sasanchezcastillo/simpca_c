
package Modelos;


public class Entresaque {
    
    private String fecha_etsq;
    private String cantidad_mano_obra_etsq;
    private String precio_mano_obra_etsq;
    private String total_mano_obra_etsq;
    private String valor_total_etsq;
    private String num_lote;
    private String id_etsq;

    public Entresaque(String fecha_etsq, String cantidad_mano_obra_etsq, String precio_mano_obra_etsq, String total_mano_obra_etsq, String valor_total_etsq, String num_lote, String id_etsq) {
        this.fecha_etsq = fecha_etsq;
        this.cantidad_mano_obra_etsq = cantidad_mano_obra_etsq;
        this.precio_mano_obra_etsq = precio_mano_obra_etsq;
        this.total_mano_obra_etsq = total_mano_obra_etsq;
        this.valor_total_etsq = valor_total_etsq;
        this.num_lote = num_lote;
        this.id_etsq = id_etsq;
    }

    public String getFecha_etsq() {
        return fecha_etsq;
    }

    public void setFecha_etsq(String fecha_etsq) {
        this.fecha_etsq = fecha_etsq;
    }

    public String getCantidad_mano_obra_etsq() {
        return cantidad_mano_obra_etsq;
    }

    public void setCantidad_mano_obra_etsq(String cantidad_mano_obra_etsq) {
        this.cantidad_mano_obra_etsq = cantidad_mano_obra_etsq;
    }

    public String getPrecio_mano_obra_etsq() {
        return precio_mano_obra_etsq;
    }

    public void setPrecio_mano_obra_etsq(String precio_mano_obra_etsq) {
        this.precio_mano_obra_etsq = precio_mano_obra_etsq;
    }

    public String getTotal_mano_obra_etsq() {
        return total_mano_obra_etsq;
    }

    public void setTotal_mano_obra_etsq(String total_mano_obra_etsq) {
        this.total_mano_obra_etsq = total_mano_obra_etsq;
    }

    public String getValor_total_etsq() {
        return valor_total_etsq;
    }

    public void setValor_total_etsq(String valor_total_etsq) {
        this.valor_total_etsq = valor_total_etsq;
    }

    public String getNum_lote() {
        return num_lote;
    }

    public void setNum_lote(String num_lote) {
        this.num_lote = num_lote;
    }

    public String getId_etsq() {
        return id_etsq;
    }

    public void setId_etsq(String id_etsq) {
        this.id_etsq = id_etsq;
    }
    
    
    
    

    
}
