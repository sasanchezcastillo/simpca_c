
package Modelos;


public class QuemaFisica {
    
    private String fecha_qf;
    private String cantidad_jornales_qf;
    private String valor_unidad_jornal_qf;
    private String valor_total_jornal_qf;
    private String cantidad_insumos_qf;
    private String unidad_insumo_qf;
    private String valor_unitario_insumo_qf;
    private String valor_total_insumo_qf;
    private String valor_total_qf;
    private String num_lote;
    private String id_qf;

    public QuemaFisica(String fecha_qf, String cantidad_jornales_qf, String valor_unidad_jornal_qf, String valor_total_jornal_qf, String cantidad_insumos_qf, String unidad_insumo_qf, String valor_unitario_insumo_qf, String valor_total_insumo_qf, String valor_total_qf, String num_lote, String id_qf) {
        this.fecha_qf = fecha_qf;
        this.cantidad_jornales_qf = cantidad_jornales_qf;
        this.valor_unidad_jornal_qf = valor_unidad_jornal_qf;
        this.valor_total_jornal_qf = valor_total_jornal_qf;
        this.cantidad_insumos_qf = cantidad_insumos_qf;
        this.unidad_insumo_qf = unidad_insumo_qf;
        this.valor_unitario_insumo_qf = valor_unitario_insumo_qf;
        this.valor_total_insumo_qf = valor_total_insumo_qf;
        this.valor_total_qf = valor_total_qf;
        this.num_lote = num_lote;
        this.id_qf = id_qf;
    }

    public String getFecha_qf() {
        return fecha_qf;
    }

    public void setFecha_qf(String fecha_qf) {
        this.fecha_qf = fecha_qf;
    }

    public String getCantidad_jornales_qf() {
        return cantidad_jornales_qf;
    }

    public void setCantidad_jornales_qf(String cantidad_jornales_qf) {
        this.cantidad_jornales_qf = cantidad_jornales_qf;
    }

    public String getValor_unidad_jornal_qf() {
        return valor_unidad_jornal_qf;
    }

    public void setValor_unidad_jornal_qf(String valor_unidad_jornal_qf) {
        this.valor_unidad_jornal_qf = valor_unidad_jornal_qf;
    }

    public String getValor_total_jornal_qf() {
        return valor_total_jornal_qf;
    }

    public void setValor_total_jornal_qf(String valor_total_jornal_qf) {
        this.valor_total_jornal_qf = valor_total_jornal_qf;
    }

    public String getCantidad_insumos_qf() {
        return cantidad_insumos_qf;
    }

    public void setCantidad_insumos_qf(String cantidad_insumos_qf) {
        this.cantidad_insumos_qf = cantidad_insumos_qf;
    }

    public String getUnidad_insumo_qf() {
        return unidad_insumo_qf;
    }

    public void setUnidad_insumo_qf(String unidad_insumo_qf) {
        this.unidad_insumo_qf = unidad_insumo_qf;
    }

    public String getValor_unitario_insumo_qf() {
        return valor_unitario_insumo_qf;
    }

    public void setValor_unitario_insumo_qf(String valor_unitario_insumo_qf) {
        this.valor_unitario_insumo_qf = valor_unitario_insumo_qf;
    }

    public String getValor_total_insumo_qf() {
        return valor_total_insumo_qf;
    }

    public void setValor_total_insumo_qf(String valor_total_insumo_qf) {
        this.valor_total_insumo_qf = valor_total_insumo_qf;
    }

    public String getValor_total_qf() {
        return valor_total_qf;
    }

    public void setValor_total_qf(String valor_total_qf) {
        this.valor_total_qf = valor_total_qf;
    }

    public String getNum_lote() {
        return num_lote;
    }

    public void setNum_lote(String num_lote) {
        this.num_lote = num_lote;
    }

    public String getId_qf() {
        return id_qf;
    }

    public void setId_qf(String id_qf) {
        this.id_qf = id_qf;
    }
    
    
    
}
