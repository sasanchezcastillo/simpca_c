/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



/**
 *
 * @author popor
 */
public class Graficas_usuarios extends ConexionBD{
    private String gastos_insumos;
    private String gastos_mano_obra;
    private String gastos_otros;
    private String gastos_totales;
    private String total_quema_quimica;
    private String total_quema_ficica;
    private String total_preparacion_suelo;
    private String total_manejo_residuos;
    private String total_siembras;
    private String total_abonadas;
    private String total_fumigas;
    private String total_despalille;
    private String total_entresaque;
    private String total_macheteada;
    private String total_pajareo;
    private String total_riego;
    private String total_cortas;
    private String total_mantenimiento;
    private Connection con;

    public Graficas_usuarios() {
    }

   public Graficas_usuarios(Connection con){
       this.con =con;
   }

    public Graficas_usuarios(String gastos_insumos, String gastos_mano_obra, String gastos_otros, String gastos_totales, String total_quema_quimica, String total_quema_ficica, String total_preparacion_suelo, String total_manejo_residuos, String total_siembras, String total_abonadas, String total_fumigas, String total_despalille, String total_entresaque, String total_macheteada, String total_pajareo, String total_riego, String total_cortas, String total_mantenimiento) {
        this.gastos_insumos = gastos_insumos;
        this.gastos_mano_obra = gastos_mano_obra;
        this.gastos_otros = gastos_otros;
        this.gastos_totales = gastos_totales;
        this.total_quema_quimica = total_quema_quimica;
        this.total_quema_ficica = total_quema_ficica;
        this.total_preparacion_suelo = total_preparacion_suelo;
        this.total_manejo_residuos = total_manejo_residuos;
        this.total_siembras = total_siembras;
        this.total_abonadas = total_abonadas;
        this.total_fumigas = total_fumigas;
        this.total_despalille = total_despalille;
        this.total_entresaque = total_entresaque;
        this.total_macheteada = total_macheteada;
        this.total_pajareo = total_pajareo;
        this.total_riego = total_riego;
        this.total_cortas = total_cortas;
        this.total_mantenimiento = total_mantenimiento;
    }

    public String getGastos_insumos() {
        return gastos_insumos;
    }

    public void setGastos_insumos(String gastos_insumos) {
        this.gastos_insumos = gastos_insumos;
    }

    public String getGastos_mano_obra() {
        return gastos_mano_obra;
    }

    public void setGastos_mano_obra(String gastos_mano_obra) {
        this.gastos_mano_obra = gastos_mano_obra;
    }

    public String getGastos_otros() {
        return gastos_otros;
    }

    public void setGastos_otros(String gastos_otros) {
        this.gastos_otros = gastos_otros;
    }

    public String getGastos_totales() {
        return gastos_totales;
    }

    public void setGastos_totales(String gastos_totales) {
        this.gastos_totales = gastos_totales;
    }

    public String getTotal_quema_quimica() {
        return total_quema_quimica;
    }

    public void setTotal_quema_quimica(String total_quema_quimica) {
        this.total_quema_quimica = total_quema_quimica;
    }

    public String getTotal_quema_ficica() {
        return total_quema_ficica;
    }

    public void setTotal_quema_ficica(String total_quema_ficica) {
        this.total_quema_ficica = total_quema_ficica;
    }

    public String getTotal_preparacion_suelo() {
        return total_preparacion_suelo;
    }

    public void setTotal_preparacion_suelo(String total_preparacion_suelo) {
        this.total_preparacion_suelo = total_preparacion_suelo;
    }

    public String getTotal_manejo_residuos() {
        return total_manejo_residuos;
    }

    public void setTotal_manejo_residuos(String total_manejo_residuos) {
        this.total_manejo_residuos = total_manejo_residuos;
    }

    public String getTotal_siembras() {
        return total_siembras;
    }

    public void setTotal_siembras(String total_siembras) {
        this.total_siembras = total_siembras;
    }

    public String getTotal_abonadas() {
        return total_abonadas;
    }

    public void setTotal_abonadas(String total_abonadas) {
        this.total_abonadas = total_abonadas;
    }

    public String getTotal_fumigas() {
        return total_fumigas;
    }

    public void setTotal_fumigas(String total_fumigas) {
        this.total_fumigas = total_fumigas;
    }

    public String getTotal_despalille() {
        return total_despalille;
    }

    public void setTotal_despalille(String total_despalille) {
        this.total_despalille = total_despalille;
    }

    public String getTotal_entresaque() {
        return total_entresaque;
    }

    public void setTotal_entresaque(String total_entresaque) {
        this.total_entresaque = total_entresaque;
    }

    public String getTotal_macheteada() {
        return total_macheteada;
    }

    public void setTotal_macheteada(String total_macheteada) {
        this.total_macheteada = total_macheteada;
    }

    public String getTotal_pajareo() {
        return total_pajareo;
    }

    public void setTotal_pajareo(String total_pajareo) {
        this.total_pajareo = total_pajareo;
    }

    public String getTotal_riego() {
        return total_riego;
    }

    public void setTotal_riego(String total_riego) {
        this.total_riego = total_riego;
    }

    public String getTotal_cortas() {
        return total_cortas;
    }

    public void setTotal_cortas(String total_cortas) {
        this.total_cortas = total_cortas;
    }

    public String getTotal_mantenimiento() {
        return total_mantenimiento;
    }

    public void setTotal_mantenimiento(String total_mantenimiento) {
        this.total_mantenimiento = total_mantenimiento;
    }
   

    public Graficas_usuarios datos (String num_lote){
        PreparedStatement pst = null;
        try {
            String sql = "call graficas(?)";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1,num_lote);
            ResultSet rs = pst.executeQuery();
            while ( rs.next()) {
               Graficas_usuarios user = new Graficas_usuarios();
               user.setGastos_insumos(rs.getString("Gastos_insumos"));
               user.setGastos_mano_obra(rs.getString("gastos_mano_obra"));
               user.setGastos_otros(rs.getString("Gastos_otros"));
               user.setGastos_totales(rs.getString("Gastos_totales"));
               user.setTotal_abonadas(rs.getString("Total_abonadas"));
               user.setTotal_cortas(rs.getString("Total_cortas"));
               user.setTotal_despalille(rs.getString("Total_despalille"));
               user.setTotal_entresaque(rs.getString("Total_entresaque"));
               user.setTotal_fumigas(rs.getString("Total_fumigas"));
               user.setTotal_macheteada(rs.getString("Total_macheteada"));
               user.setTotal_manejo_residuos(rs.getString("Total_manejo_residuos"));
               user.setTotal_mantenimiento(rs.getString("Total_mantenimiento"));
               user.setTotal_pajareo(rs.getString("Total_pajareo"));
               user.setTotal_preparacion_suelo(rs.getString("Total_preparacion_suelo"));
               user.setTotal_quema_ficica(rs.getString("Total_quema_ficica"));
               user.setTotal_quema_quimica(rs.getString("Total_quema_quimica"));
               user.setTotal_riego(rs.getString("Total_riego"));
               user.setTotal_siembras(rs.getString("Total_siembras"));
               
               return user;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
       
    }
    public static void main(String[] args) {
        Graficas_usuarios co = new Graficas_usuarios();
       
    }
    
    
}
