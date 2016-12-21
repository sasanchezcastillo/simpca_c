/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author SENA-CEDRUM
 */
public class total_riego {
    
    private Long valor_total_riego;

   
    public total_riego(Long valor_total_riego) {
        this.valor_total_riego = valor_total_riego;
    }

    public Long gettotal_riego() {
        return valor_total_riego;
    }

    public void settotal_riego(Long valor_total_riego) {
        this.valor_total_riego = valor_total_riego;
    }
    
    
}
