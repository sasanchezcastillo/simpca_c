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
public class total_siembra_manual {
    private Long valor_total_sim;

    
    public total_siembra_manual(Long valor_total_sim) {
        this.valor_total_sim = valor_total_sim;
    }

    public Long gettotal_siembra_manual() {
        return valor_total_sim;
    }

    public void settotal_siembra_manual(Long valor_total_sim) {
        this.valor_total_sim = valor_total_sim;
    }
    
    
}
