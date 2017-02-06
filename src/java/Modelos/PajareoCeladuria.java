
package Modelos;


public class PajareoCeladuria {
    
    private String fecha_pcp;
    private String cantidad_mano_obra_pcp;
    private String valor_mano_obra_pcp;
    private String valor_total_mano_obra_pcp;
    private String cantidad_polvora_pcp;
    private String valor_polvora_pcp;
    private String valor_total_polvora_pcp;
    private String valor_total_pcp;
    private String num_lote;
    private String id_pcp;

    public PajareoCeladuria(String fecha_pcp, String cantidad_mano_obra_pcp, String valor_mano_obra_pcp, String valor_total_mano_obra_pcp, String cantidad_polvora_pcp, String valor_polvora_pcp, String valor_total_polvora_pcp, String valor_total_pcp, String num_lote, String id_pcp) {
        this.fecha_pcp = fecha_pcp;
        this.cantidad_mano_obra_pcp = cantidad_mano_obra_pcp;
        this.valor_mano_obra_pcp = valor_mano_obra_pcp;
        this.valor_total_mano_obra_pcp = valor_total_mano_obra_pcp;
        this.cantidad_polvora_pcp = cantidad_polvora_pcp;
        this.valor_polvora_pcp = valor_polvora_pcp;
        this.valor_total_polvora_pcp = valor_total_polvora_pcp;
        this.valor_total_pcp = valor_total_pcp;
        this.num_lote = num_lote;
        this.id_pcp = id_pcp;
    }

    public String getFecha_pcp() {
        return fecha_pcp;
    }

    public void setFecha_pcp(String fecha_pcp) {
        this.fecha_pcp = fecha_pcp;
    }

    public String getCantidad_mano_obra_pcp() {
        return cantidad_mano_obra_pcp;
    }

    public void setCantidad_mano_obra_pcp(String cantidad_mano_obra_pcp) {
        this.cantidad_mano_obra_pcp = cantidad_mano_obra_pcp;
    }

    public String getValor_mano_obra_pcp() {
        return valor_mano_obra_pcp;
    }

    public void setValor_mano_obra_pcp(String valor_mano_obra_pcp) {
        this.valor_mano_obra_pcp = valor_mano_obra_pcp;
    }

    public String getValor_total_mano_obra_pcp() {
        return valor_total_mano_obra_pcp;
    }

    public void setValor_total_mano_obra_pcp(String valor_total_mano_obra_pcp) {
        this.valor_total_mano_obra_pcp = valor_total_mano_obra_pcp;
    }

    public String getCantidad_polvora_pcp() {
        return cantidad_polvora_pcp;
    }

    public void setCantidad_polvora_pcp(String cantidad_polvora_pcp) {
        this.cantidad_polvora_pcp = cantidad_polvora_pcp;
    }

    public String getValor_polvora_pcp() {
        return valor_polvora_pcp;
    }

    public void setValor_polvora_pcp(String valor_polvora_pcp) {
        this.valor_polvora_pcp = valor_polvora_pcp;
    }

    public String getValor_total_polvora_pcp() {
        return valor_total_polvora_pcp;
    }

    public void setValor_total_polvora_pcp(String valor_total_polvora_pcp) {
        this.valor_total_polvora_pcp = valor_total_polvora_pcp;
    }

    public String getValor_total_pcp() {
        return valor_total_pcp;
    }

    public void setValor_total_pcp(String valor_total_pcp) {
        this.valor_total_pcp = valor_total_pcp;
    }

    public String getNum_lote() {
        return num_lote;
    }

    public void setNum_lote(String num_lote) {
        this.num_lote = num_lote;
    }

    public String getId_pcp() {
        return id_pcp;
    }

    public void setId_pcp(String id_pcp) {
        this.id_pcp = id_pcp;
    }
    
    

    
}
