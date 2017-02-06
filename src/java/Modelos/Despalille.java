
package Modelos;


public class Despalille {
    
    private String fecha_dsp;
    private String cantidad_mano_obra_dsp;
    private String precio_mano_obra_dsp;
    private String total_mano_obra_dsp;
    private String valor_total_dsp;
    private String num_lote;
    private String id_dsp;

    public Despalille(String fecha_dsp, String cantidad_mano_obra_dsp, String precio_mano_obra_dsp, String total_mano_obra_dsp, String valor_total_dsp, String num_lote, String id_dsp) {
        this.fecha_dsp = fecha_dsp;
        this.cantidad_mano_obra_dsp = cantidad_mano_obra_dsp;
        this.precio_mano_obra_dsp = precio_mano_obra_dsp;
        this.total_mano_obra_dsp = total_mano_obra_dsp;
        this.valor_total_dsp = valor_total_dsp;
        this.num_lote = num_lote;
        this.id_dsp = id_dsp;
    }

    public String getFecha_dsp() {
        return fecha_dsp;
    }

    public void setFecha_dsp(String fecha_dsp) {
        this.fecha_dsp = fecha_dsp;
    }

    public String getCantidad_mano_obra_dsp() {
        return cantidad_mano_obra_dsp;
    }

    public void setCantidad_mano_obra_dsp(String cantidad_mano_obra_dsp) {
        this.cantidad_mano_obra_dsp = cantidad_mano_obra_dsp;
    }

    public String getPrecio_mano_obra_dsp() {
        return precio_mano_obra_dsp;
    }

    public void setPrecio_mano_obra_dsp(String precio_mano_obra_dsp) {
        this.precio_mano_obra_dsp = precio_mano_obra_dsp;
    }

    public String getTotal_mano_obra_dsp() {
        return total_mano_obra_dsp;
    }

    public void setTotal_mano_obra_dsp(String total_mano_obra_dsp) {
        this.total_mano_obra_dsp = total_mano_obra_dsp;
    }

    public String getValor_total_dsp() {
        return valor_total_dsp;
    }

    public void setValor_total_dsp(String valor_total_dsp) {
        this.valor_total_dsp = valor_total_dsp;
    }

    public String getNum_lote() {
        return num_lote;
    }

    public void setNum_lote(String num_lote) {
        this.num_lote = num_lote;
    }

    public String getId_dsp() {
        return id_dsp;
    }

    public void setId_dsp(String id_dsp) {
        this.id_dsp = id_dsp;
    }
    
    

    
}