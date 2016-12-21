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
public class total_pajareo {
    private Long valor_total_pcp;

    
    public total_pajareo(Long valor_total_pcp) {
        this.valor_total_pcp = valor_total_pcp;
    }

    public Long gettotal_pajareo() {
        return valor_total_pcp;
    }

    public void settotal_pajareo(Long valor_total_pcp) {
        this.valor_total_pcp = valor_total_pcp;
    }
    
    
    
}
