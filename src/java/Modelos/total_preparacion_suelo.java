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
public class total_preparacion_suelo {
    private Long total_preparacions;

    
    public total_preparacion_suelo(Long total_preparacions) {
        this.total_preparacions = total_preparacions;
    }

    public Long gettotal_preparacion_suelo() {
        return total_preparacions;
    }

    public void settotal_preparacion_suelo(Long total_preparacions) {
        this.total_preparacions = total_preparacions;
    } 
}