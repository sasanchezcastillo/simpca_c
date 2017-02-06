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
public class total_siembra_mecanizada {
    private  Long valor_total_smzd;

    
    public total_siembra_mecanizada(Long valor_total_smzd) {
        this.valor_total_smzd = valor_total_smzd;
    }

    public Long gettotal_smzd() {
        return valor_total_smzd;
    }

    public void settotal_smzd(Long valor_total_smzd) {
        this.valor_total_smzd = valor_total_smzd;
    }
    
    
    
}
