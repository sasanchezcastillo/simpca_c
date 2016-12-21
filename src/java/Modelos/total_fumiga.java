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
public class total_fumiga {    
    private  Long valor_total_fumiga;


    public total_fumiga(Long valor_total_fumiga) {
        this.valor_total_fumiga = valor_total_fumiga;
    }

    public Long gettotal_fumiga() {
        return valor_total_fumiga;
    }

    public void settotal_fumiga(Long valor_total_fumiga) {
        this.valor_total_fumiga = valor_total_fumiga;
    }   
}
