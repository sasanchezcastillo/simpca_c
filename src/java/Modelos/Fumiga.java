
package Modelos;


public class Fumiga {
    
    private String fecha_fumiga;
    private String nombre_fumiga_fumiga;
    private String cantidad_mano_obra_fumiga;
    private String valor_uni_mano_obra_fumiga;
    private String valor_total_mano_obra_fumiga;
    private String valor_total_fumiga;
    private String num_lote;
    private String id_fumiga;

    public Fumiga(String fecha_fumiga, String nombre_fumiga_fumiga, String cantidad_mano_obra_fumiga, String valor_uni_mano_obra_fumiga, String valor_total_mano_obra_fumiga, String valor_total_fumiga, String num_lote, String id_fumiga) {
        this.fecha_fumiga = fecha_fumiga;
        this.nombre_fumiga_fumiga = nombre_fumiga_fumiga;
        this.cantidad_mano_obra_fumiga = cantidad_mano_obra_fumiga;
        this.valor_uni_mano_obra_fumiga = valor_uni_mano_obra_fumiga;
        this.valor_total_mano_obra_fumiga = valor_total_mano_obra_fumiga;
        this.valor_total_fumiga = valor_total_fumiga;
        this.num_lote = num_lote;
        this.id_fumiga = id_fumiga;
    }

    public String getFecha_fumiga() {
        return fecha_fumiga;
    }

    public void setFecha_fumiga(String fecha_fumiga) {
        this.fecha_fumiga = fecha_fumiga;
    }

    public String getNombre_fumiga_fumiga() {
        return nombre_fumiga_fumiga;
    }

    public void setNombre_fumiga_fumiga(String nombre_fumiga_fumiga) {
        this.nombre_fumiga_fumiga = nombre_fumiga_fumiga;
    }

    public String getCantidad_mano_obra_fumiga() {
        return cantidad_mano_obra_fumiga;
    }

    public void setCantidad_mano_obra_fumiga(String cantidad_mano_obra_fumiga) {
        this.cantidad_mano_obra_fumiga = cantidad_mano_obra_fumiga;
    }

    public String getValor_uni_mano_obra_fumiga() {
        return valor_uni_mano_obra_fumiga;
    }

    public void setValor_uni_mano_obra_fumiga(String valor_uni_mano_obra_fumiga) {
        this.valor_uni_mano_obra_fumiga = valor_uni_mano_obra_fumiga;
    }

    public String getValor_total_mano_obra_fumiga() {
        return valor_total_mano_obra_fumiga;
    }

    public void setValor_total_mano_obra_fumiga(String valor_total_mano_obra_fumiga) {
        this.valor_total_mano_obra_fumiga = valor_total_mano_obra_fumiga;
    }

    public String getValor_total_fumiga() {
        return valor_total_fumiga;
    }

    public void setValor_total_fumiga(String valor_total_fumiga) {
        this.valor_total_fumiga = valor_total_fumiga;
    }

    public String getNum_lote() {
        return num_lote;
    }

    public void setNum_lote(String num_lote) {
        this.num_lote = num_lote;
    }

    public String getId_fumiga() {
        return id_fumiga;
    }

    public void setId_fumiga(String id_fumiga) {
        this.id_fumiga = id_fumiga;
    }
  
}
