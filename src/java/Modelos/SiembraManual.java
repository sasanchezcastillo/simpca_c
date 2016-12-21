
package Modelos;


public class SiembraManual {
    
    private String fecha_sim;
    private String variedad_semilla_sim;
    private String cantidad_bultos_sim;
    private String precio_bulto_sim;
    private String costo_semilla_sim;
    private String costo_transporte_sim;
    private String costo_secado_semilla_sim;
    private String pago_total_obreros_sim;
    private String valor_total_sim;
    private String num_lote;
    private String id_sim;

    public SiembraManual(String fecha_sim, String variedad_semilla_sim, String cantidad_bultos_sim, String precio_bulto_sim, String costo_semilla_sim, String costo_transporte_sim, String costo_secado_semilla_sim, String pago_total_obreros_sim, String valor_total_sim, String num_lote, String id_sim) {
        this.fecha_sim = fecha_sim;
        this.variedad_semilla_sim = variedad_semilla_sim;
        this.cantidad_bultos_sim = cantidad_bultos_sim;
        this.precio_bulto_sim = precio_bulto_sim;
        this.costo_semilla_sim = costo_semilla_sim;
        this.costo_transporte_sim = costo_transporte_sim;
        this.costo_secado_semilla_sim = costo_secado_semilla_sim;
        this.pago_total_obreros_sim = pago_total_obreros_sim;
        this.valor_total_sim = valor_total_sim;
        this.num_lote = num_lote;
        this.id_sim = id_sim;
    }

    public String getFecha_sim() {
        return fecha_sim;
    }

    public void setFecha_sim(String fecha_sim) {
        this.fecha_sim = fecha_sim;
    }

    public String getVariedad_semilla_sim() {
        return variedad_semilla_sim;
    }

    public void setVariedad_semilla_sim(String variedad_semilla_sim) {
        this.variedad_semilla_sim = variedad_semilla_sim;
    }

    public String getCantidad_bultos_sim() {
        return cantidad_bultos_sim;
    }

    public void setCantidad_bultos_sim(String cantidad_bultos_sim) {
        this.cantidad_bultos_sim = cantidad_bultos_sim;
    }

    public String getPrecio_bulto_sim() {
        return precio_bulto_sim;
    }

    public void setPrecio_bulto_sim(String precio_bulto_sim) {
        this.precio_bulto_sim = precio_bulto_sim;
    }

    public String getCosto_semilla_sim() {
        return costo_semilla_sim;
    }

    public void setCosto_semilla_sim(String costo_semilla_sim) {
        this.costo_semilla_sim = costo_semilla_sim;
    }

    public String getCosto_transporte_sim() {
        return costo_transporte_sim;
    }

    public void setCosto_transporte_sim(String costo_transporte_sim) {
        this.costo_transporte_sim = costo_transporte_sim;
    }

    public String getCosto_secado_semilla_sim() {
        return costo_secado_semilla_sim;
    }

    public void setCosto_secado_semilla_sim(String costo_secado_semilla_sim) {
        this.costo_secado_semilla_sim = costo_secado_semilla_sim;
    }

    public String getPago_total_obreros_sim() {
        return pago_total_obreros_sim;
    }

    public void setPago_total_obreros_sim(String pago_total_obreros_sim) {
        this.pago_total_obreros_sim = pago_total_obreros_sim;
    }

    public String getValor_total_sim() {
        return valor_total_sim;
    }

    public void setValor_total_sim(String valor_total_sim) {
        this.valor_total_sim = valor_total_sim;
    }

    public String getNum_lote() {
        return num_lote;
    }

    public void setNum_lote(String num_lote) {
        this.num_lote = num_lote;
    }

    public String getId_sim() {
        return id_sim;
    }

    public void setId_sim(String id_sim) {
        this.id_sim = id_sim;
    }
    
    
    
}
