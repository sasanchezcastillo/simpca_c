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
public class total_mantenimiento_lote {
    
    private Long valor_total_mntlote;

    
    public total_mantenimiento_lote(Long valor_total_mntlote) {
        this.valor_total_mntlote = valor_total_mntlote;
    }

    public Long gettotal_mntlote() {
        return valor_total_mntlote;
    }

    public void settotal_mntlote(Long valor_total_mntlote) {
        this.valor_total_mntlote = valor_total_mntlote;
    }
    
    
    
}
