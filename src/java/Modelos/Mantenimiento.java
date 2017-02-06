
package Modelos;


public class Mantenimiento {
    
    private String fecha_mntlote;
    private String tipo_limpieza_mntlote;
    private String cantidad_jornal_mntlote;
    private String valor_jornal_mntlote;
    private String valor_total_jornal_mntlote;
    private String valor_total_mntlote;
    private String num_lote;
    private String id_mntlote;

    public Mantenimiento(String fecha_mntlote, String tipo_limpieza_mntlote, String cantidad_jornal_mntlote, String valor_jornal_mntlote, String valor_total_jornal_mntlote, String valor_total_mntlote, String num_lote, String id_mntlote) {
        this.fecha_mntlote = fecha_mntlote;
        this.tipo_limpieza_mntlote = tipo_limpieza_mntlote;
        this.cantidad_jornal_mntlote = cantidad_jornal_mntlote;
        this.valor_jornal_mntlote = valor_jornal_mntlote;
        this.valor_total_jornal_mntlote = valor_total_jornal_mntlote;
        this.valor_total_mntlote = valor_total_mntlote;
        this.num_lote = num_lote;
        this.id_mntlote = id_mntlote;
    }

    public String getFecha_mntlote() {
        return fecha_mntlote;
    }

    public void setFecha_mntlote(String fecha_mntlote) {
        this.fecha_mntlote = fecha_mntlote;
    }

    public String getTipo_limpieza_mntlote() {
        return tipo_limpieza_mntlote;
    }

    public void setTipo_limpieza_mntlote(String tipo_limpieza_mntlote) {
        this.tipo_limpieza_mntlote = tipo_limpieza_mntlote;
    }

    public String getCantidad_jornal_mntlote() {
        return cantidad_jornal_mntlote;
    }

    public void setCantidad_jornal_mntlote(String cantidad_jornal_mntlote) {
        this.cantidad_jornal_mntlote = cantidad_jornal_mntlote;
    }

    public String getValor_jornal_mntlote() {
        return valor_jornal_mntlote;
    }

    public void setValor_jornal_mntlote(String valor_jornal_mntlote) {
        this.valor_jornal_mntlote = valor_jornal_mntlote;
    }

    public String getValor_total_jornal_mntlote() {
        return valor_total_jornal_mntlote;
    }

    public void setValor_total_jornal_mntlote(String valor_total_jornal_mntlote) {
        this.valor_total_jornal_mntlote = valor_total_jornal_mntlote;
    }

    public String getValor_total_mntlote() {
        return valor_total_mntlote;
    }

    public void setValor_total_mntlote(String valor_total_mntlote) {
        this.valor_total_mntlote = valor_total_mntlote;
    }

    public String getNum_lote() {
        return num_lote;
    }

    public void setNum_lote(String num_lote) {
        this.num_lote = num_lote;
    }

    public String getId_mntlote() {
        return id_mntlote;
    }

    public void setId_mntlote(String id_mntlote) {
        this.id_mntlote = id_mntlote;
    }
    
    

    
}
