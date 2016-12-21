
package Modelos;


public class QuemaQuimica {
    
    
    private String fecha_quemaq;
    private String cantidad_mano_obra_quemaq;
    private String valor_mano_obra_quemaq;
    private String valor_total_mano_obra_quemaq;
    private String valor_total_quemaq;
    private String num_lote;
    private String id_quemaq;
    
    public QuemaQuimica() {
    }

    public QuemaQuimica(String fecha_quemaq, String cantidad_mano_obra_quemaq, String valor_mano_obra_quemaq, String valor_total_mano_obra_quemaq, String valor_total_quemaq, String num_lote, String id_quemaq) {
        
        this.fecha_quemaq = fecha_quemaq;
        this.cantidad_mano_obra_quemaq = cantidad_mano_obra_quemaq;
        this.valor_mano_obra_quemaq = valor_mano_obra_quemaq;
        this.valor_total_mano_obra_quemaq = valor_total_mano_obra_quemaq;
        this.valor_total_quemaq = valor_total_quemaq;
        this.num_lote = num_lote;
        this.id_quemaq = id_quemaq;
    }


    public String getFecha_quemaq() {
        return fecha_quemaq;
    }

    public void setFecha_quemaq(String fecha_quemaq) {
        this.fecha_quemaq = fecha_quemaq;
    }

    public String getCantidad_mano_obra_quemaq() {
        return cantidad_mano_obra_quemaq;
    }

    public void setCantidad_mano_obra_quemaq(String cantidad_mano_obra_quemaq) {
        this.cantidad_mano_obra_quemaq = cantidad_mano_obra_quemaq;
    }

    public String getValor_mano_obra_quemaq() {
        return valor_mano_obra_quemaq;
    }

    public void setValor_mano_obra_quemaq(String valor_mano_obra_quemaq) {
        this.valor_mano_obra_quemaq = valor_mano_obra_quemaq;
    }

    public String getValor_total_mano_obra_quemaq() {
        return valor_total_mano_obra_quemaq;
    }

    public void setValor_total_mano_obra_quemaq(String valor_total_mano_obra_quemaq) {
        this.valor_total_mano_obra_quemaq = valor_total_mano_obra_quemaq;
    }

    public String getValor_total_quemaq() {
        return valor_total_quemaq;
    }

    public void setValor_total_quemaq(String valor_total_quemaq) {
        this.valor_total_quemaq = valor_total_quemaq;
    }

    public String getNum_lote() {
        return num_lote;
    }

    public void setNum_lote(String num_lote) {
        this.num_lote = num_lote;
    }

public String getId_quemaq() {
        return id_quemaq;
    }

    public void setId_quemaq(String id_quemaq) {
        this.id_quemaq = id_quemaq;
    }    
    
}
