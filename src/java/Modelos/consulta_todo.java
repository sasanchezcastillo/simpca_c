/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Jesus
 */
public class consulta_todo {
    
   private String valor_total_abonada;
   private String valor_total_corta;
   private String valor_total_granel;

    public consulta_todo(String valor_total_abonada, String valor_total_corta, String valor_total_granel) {
        this.valor_total_abonada = valor_total_abonada;
        this.valor_total_corta = valor_total_corta;
        this.valor_total_granel = valor_total_granel;
    }

    public String getValor_total_abonada() {
        return valor_total_abonada;
    }

    public void setValor_total_abonada(String valor_total_abonada) {
        this.valor_total_abonada = valor_total_abonada;
    }

    public String getValor_total_corta() {
        return valor_total_corta;
    }

    public void setValor_total_corta(String valor_total_corta) {
        this.valor_total_corta = valor_total_corta;
    }

    public String getValor_total_granel() {
        return valor_total_granel;
    }

    public void setValor_total_granel(String valor_total_granel) {
        this.valor_total_granel = valor_total_granel;
    }
   
   
   
           
}
