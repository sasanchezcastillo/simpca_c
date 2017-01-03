/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author popor
 */
public class Graficas_usuarios extends ConexionBD {

    private static String sumaTotalGraficaTorta;
    
    private String gastos_insumos;
    private String gastos_mano_obra;
    private String gastos_otros;
    private String gastos_totales;
    private String total_quema_quimica;
    private String total_quema_ficica;
    private String valor_total_preparacion_suelo;
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

    /* Gastos Mano de Obra*/
    private String mano_obra_total_abonada;
    private String mano_obra_total_entresaque;
    private String mano_obra_total_macheteada;
    private String mano_obra_total_despalille;
    private String mano_obra_total_fumiga;
    private String mano_obra_total_manejo_residuos;
    private String mano_obra_total_mantenimiento;
    private String mano_obra_total_pajareo;
    private String mano_obra_total_quema_fisica;
    private String mano_obra_total_quema_quimica;
    private String mano_obra_total_riego;
    private String mano_obra_total_siembras;

    /* Valor Insumos*/
    private String insumos_total_quema_quimica;
    private String insumos_total_quema_fisica;
    private String insumos_total_abonada;
    private String insumos_total_mantenimiento;
    private String insumos_total_fumiga;

    /* Otros Gastos*/
    private String OtrosGastos_valor;

    public String getMano_obra_total_abonada() {
        return mano_obra_total_abonada;
    }

    public void setMano_obra_total_abonada(String mano_obra_total_abonada) {
        this.mano_obra_total_abonada = mano_obra_total_abonada;
    }

    public String getMano_obra_total_entresaque() {
        return mano_obra_total_entresaque;
    }

    public void setMano_obra_total_entresaque(String mano_obra_total_entresaque) {
        this.mano_obra_total_entresaque = mano_obra_total_entresaque;
    }

    public String getMano_obra_total_macheteada() {
        return mano_obra_total_macheteada;
    }

    public void setMano_obra_total_macheteada(String mano_obra_total_macheteada) {
        this.mano_obra_total_macheteada = mano_obra_total_macheteada;
    }

    public String getMano_obra_total_despalille() {
        return mano_obra_total_despalille;
    }

    public void setMano_obra_total_despalille(String mano_obra_total_despalille) {
        this.mano_obra_total_despalille = mano_obra_total_despalille;
    }

    public String getMano_obra_total_fumiga() {
        return mano_obra_total_fumiga;
    }

    public void setMano_obra_total_fumiga(String mano_obra_total_fumiga) {
        this.mano_obra_total_fumiga = mano_obra_total_fumiga;
    }

    public String getMano_obra_total_manejo_residuos() {
        return mano_obra_total_manejo_residuos;
    }

    public void setMano_obra_total_manejo_residuos(String mano_obra_total_manejo_residuos) {
        this.mano_obra_total_manejo_residuos = mano_obra_total_manejo_residuos;
    }

    public String getMano_obra_total_mantenimiento() {
        return mano_obra_total_mantenimiento;
    }

    public void setMano_obra_total_mantenimiento(String mano_obra_total_mantenimiento) {
        this.mano_obra_total_mantenimiento = mano_obra_total_mantenimiento;
    }

    public String getMano_obra_total_pajareo() {
        return mano_obra_total_pajareo;
    }

    public void setMano_obra_total_pajareo(String mano_obra_total_pajareo) {
        this.mano_obra_total_pajareo = mano_obra_total_pajareo;
    }

    public String getMano_obra_total_quema_fisica() {
        return mano_obra_total_quema_fisica;
    }

    public void setMano_obra_total_quema_fisica(String mano_obra_total_quema_fisica) {
        this.mano_obra_total_quema_fisica = mano_obra_total_quema_fisica;
    }

    public String getMano_obra_total_quema_quimica() {
        return mano_obra_total_quema_quimica;
    }

    public void setMano_obra_total_quema_quimica(String mano_obra_total_quema_quimica) {
        this.mano_obra_total_quema_quimica = mano_obra_total_quema_quimica;
    }

    public String getMano_obra_total_riego() {
        return mano_obra_total_riego;
    }

    public void setMano_obra_total_riego(String mano_obra_total_riego) {
        this.mano_obra_total_riego = mano_obra_total_riego;
    }

    public String getMano_obra_total_siembras() {
        return mano_obra_total_siembras;
    }

    public void setMano_obra_total_siembras(String mano_obra_total_siembras) {
        this.mano_obra_total_siembras = mano_obra_total_siembras;
    }

    public String getInsumos_total_quema_quimica() {
        return insumos_total_quema_quimica;
    }

    public void setInsumos_total_quema_quimica(String insumos_total_quema_quimica) {
        this.insumos_total_quema_quimica = insumos_total_quema_quimica;
    }

    public String getInsumos_total_quema_fisica() {
        return insumos_total_quema_fisica;
    }

    public void setInsumos_total_quema_fisica(String insumos_total_quema_fisica) {
        this.insumos_total_quema_fisica = insumos_total_quema_fisica;
    }

    public String getInsumos_total_abonada() {
        return insumos_total_abonada;
    }

    public void setInsumos_total_abonada(String insumos_total_abonada) {
        this.insumos_total_abonada = insumos_total_abonada;
    }

    public String getInsumos_total_mantenimiento() {
        return insumos_total_mantenimiento;
    }

    public void setInsumos_total_mantenimiento(String insumos_total_mantenimiento) {
        this.insumos_total_mantenimiento = insumos_total_mantenimiento;
    }

    public String getInsumos_total_fumiga() {
        return insumos_total_fumiga;
    }

    public void setInsumos_total_fumiga(String insumos_total_fumiga) {
        this.insumos_total_fumiga = insumos_total_fumiga;
    }

    public String getOtrosGastos_valor() {
        return OtrosGastos_valor;
    }

    public void setOtrosGastos_valor(String OtrosGastos_valor) {
        this.OtrosGastos_valor = OtrosGastos_valor;
    }

    private Connection con;

    public Graficas_usuarios() {
    }

    public Graficas_usuarios(Connection con) {
        this.con = con;
    }

    public Graficas_usuarios(String gastos_insumos, String gastos_mano_obra, String gastos_otros, String gastos_totales, String total_quema_quimica, String total_quema_ficica, String valor_total_preparacion_suelo, String total_manejo_residuos, String total_siembras, String total_abonadas, String total_fumigas, String total_despalille, String total_entresaque, String total_macheteada, String total_pajareo, String total_riego, String total_cortas, String total_mantenimiento, String mano_obra_total_abonada, String mano_obra_total_entresaque, String mano_obra_total_macheteada, String mano_obra_total_despalille, String mano_obra_total_fumiga, String mano_obra_total_manejo_residuos, String mano_obra_total_mantenimiento, String mano_obra_total_pajareo, String mano_obra_total_quema_fisica, String mano_obra_total_quema_quimica, String mano_obra_total_riego, String mano_obra_total_siembras, String insumos_total_quema_quimica, String insumos_total_quema_fisica, String insumos_total_abonada, String insumos_total_mantenimiento, String insumos_total_fumiga, String OtrosGastos_valor) {
        this.gastos_insumos = gastos_insumos;
        this.gastos_mano_obra = gastos_mano_obra;
        this.gastos_otros = gastos_otros;
        this.gastos_totales = gastos_totales;
        this.total_quema_quimica = total_quema_quimica;
        this.total_quema_ficica = total_quema_ficica;
        this.valor_total_preparacion_suelo = valor_total_preparacion_suelo;
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
        this.mano_obra_total_abonada = mano_obra_total_abonada;
        this.mano_obra_total_entresaque = mano_obra_total_entresaque;
        this.mano_obra_total_macheteada = mano_obra_total_macheteada;
        this.mano_obra_total_despalille = mano_obra_total_despalille;
        this.mano_obra_total_fumiga = mano_obra_total_fumiga;
        this.mano_obra_total_manejo_residuos = mano_obra_total_manejo_residuos;
        this.mano_obra_total_mantenimiento = mano_obra_total_mantenimiento;
        this.mano_obra_total_pajareo = mano_obra_total_pajareo;
        this.mano_obra_total_quema_fisica = mano_obra_total_quema_fisica;
        this.mano_obra_total_quema_quimica = mano_obra_total_quema_quimica;
        this.mano_obra_total_riego = mano_obra_total_riego;
        this.mano_obra_total_siembras = mano_obra_total_siembras;
        this.insumos_total_quema_quimica = insumos_total_quema_quimica;
        this.insumos_total_quema_fisica = insumos_total_quema_fisica;
        this.insumos_total_abonada = insumos_total_abonada;
        this.insumos_total_mantenimiento = insumos_total_mantenimiento;
        this.insumos_total_fumiga = insumos_total_fumiga;
        this.OtrosGastos_valor = OtrosGastos_valor;
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

    public String getValor_total_preparacion_suelo() {
        return valor_total_preparacion_suelo;
    }

    public void setValor_total_preparacion_suelo(String valor_total_preparacion_suelo) {
        this.valor_total_preparacion_suelo = valor_total_preparacion_suelo;
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

    public Graficas_usuarios datos(String num_lote) {
        PreparedStatement pst = null;
        try {
            String sql = "call graficas(?)";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, num_lote);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
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
                user.setValor_total_preparacion_suelo(rs.getString("Valor_total_preparacion_suelo"));
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

    

    /* Metodo que llama los datos para la grafica torra para saber el total gastos*/
    public Boolean sumaTotal(String num_lote) {
        PreparedStatement pst = null;
        try {
            String sql = "select total1(?) as total";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, num_lote);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                sumaTotalGraficaTorta = rs.getString("total");

                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    /* Metodo que llama los datos para la grafica torra la parte de gastos mano de obra*/
    public Graficas_usuarios grafManoObra(String num_lote) {
        PreparedStatement pst = null;
        sumaTotal(num_lote);
        int sumaTotal = Integer.parseInt(sumaTotalGraficaTorta);
        System.out.println("esta es la suma total  " + sumaTotalGraficaTorta);
        float manoObra = 0;

        try {
            String sql = "call gfcs_mano_obra(?)";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, num_lote);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Graficas_usuarios user = new Graficas_usuarios();

                manoObra = Float.parseFloat(rs.getString("mtotal_aboonada"));
                manoObra = (manoObra * 100) / sumaTotal;
                manoObra = round(manoObra);
                user.setMano_obra_total_abonada(Float.toString(manoObra));

                manoObra = Float.parseFloat(rs.getString("mtotal_entresaque"));
                manoObra = (manoObra * 100) / sumaTotal;
                manoObra = round(manoObra);
                user.setMano_obra_total_entresaque(Float.toString(manoObra));

                manoObra = Integer.parseInt(rs.getString("mtotal_macheteada"));
                manoObra = (manoObra * 100) / sumaTotal;
                manoObra = round(manoObra);
                user.setMano_obra_total_macheteada(Float.toString(manoObra));

                manoObra = Integer.parseInt(rs.getString("mtotal_despalille"));
                manoObra = (manoObra * 100) / sumaTotal;
                manoObra = round(manoObra);
                user.setMano_obra_total_despalille(Float.toString(manoObra));

                manoObra = Integer.parseInt(rs.getString("mtotal_fumiga"));
                manoObra = (manoObra * 100) / sumaTotal;
                manoObra = round(manoObra);
                user.setMano_obra_total_fumiga(Float.toString(manoObra));

                manoObra = Integer.parseInt(rs.getString("mtotal_manejo_residuos"));
                manoObra = (manoObra * 100) / sumaTotal;
                manoObra = round(manoObra);
                user.setMano_obra_total_manejo_residuos(Float.toString(manoObra));

                manoObra = Integer.parseInt(rs.getString("mtotal_mantenimineto"));
                manoObra = (manoObra * 100) / sumaTotal;
                manoObra = round(manoObra);
                user.setMano_obra_total_mantenimiento(Float.toString(manoObra));

                manoObra = Integer.parseInt(rs.getString("mtotal_pajareo"));
                manoObra = (manoObra * 100) / sumaTotal;
                manoObra = round(manoObra);
                user.setMano_obra_total_pajareo(Float.toString(manoObra));

                manoObra = Integer.parseInt(rs.getString("mtotal_quema_fisica"));
                manoObra = (manoObra * 100) / sumaTotal;
                manoObra = round(manoObra);
                user.setMano_obra_total_quema_fisica(Float.toString(manoObra));

                manoObra = Integer.parseInt(rs.getString("mtotal_quema_quimica"));
                manoObra = (manoObra * 100) / sumaTotal;
                manoObra = round(manoObra);
                user.setMano_obra_total_quema_quimica(Float.toString(manoObra));

                manoObra = Integer.parseInt(rs.getString("mtotal_riego"));
                manoObra = (manoObra * 100) / sumaTotal;
                manoObra = round(manoObra);
                user.setMano_obra_total_riego(Float.toString(manoObra));

                manoObra = Integer.parseInt(rs.getString("mtotal_siembras"));
                manoObra = (manoObra * 100) / sumaTotal;
                manoObra = round(manoObra);
                user.setMano_obra_total_siembras(Float.toString(manoObra));

                return user;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
    
    /* Metodo para retornar el numero double redondeado*/
    public static float round(float d) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }
    

    /* Metodo que llama los datos para la grafica torra la parte de valor insumos*/
    public Graficas_usuarios grafValorInsumos(String num_lote) {
        PreparedStatement pst = null;
        sumaTotal(num_lote);
        int sumaTotal = Integer.parseInt(sumaTotalGraficaTorta);
        float totalinsumo = 0;

        DecimalFormat RedondearADos = new DecimalFormat("###");
        try {
            String sql = "call gfcs_valor_insumos(?)";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, num_lote);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Graficas_usuarios user = new Graficas_usuarios();

                totalinsumo = Float.parseFloat(rs.getString("itotal_que_Quimica"));
                totalinsumo = (totalinsumo * 100) / sumaTotal;
                totalinsumo = round(totalinsumo);
                user.setInsumos_total_quema_quimica(Float.toString(totalinsumo));
                

                totalinsumo = Float.parseFloat(rs.getString("itotal_quema_fisica"));
                totalinsumo = (totalinsumo * 100) / sumaTotal;
                totalinsumo = round(totalinsumo);
                user.setInsumos_total_quema_fisica(Float.toString(totalinsumo));

                totalinsumo = Float.parseFloat(rs.getString("itotal_abonada"));
                totalinsumo = (totalinsumo * 100) / sumaTotal;
                totalinsumo = round(totalinsumo);
                user.setInsumos_total_abonada(Float.toString(totalinsumo));

                totalinsumo = Float.parseFloat(rs.getString("itotal_mantenimiento"));
                totalinsumo = (totalinsumo * 100) / sumaTotal;
                totalinsumo = round(totalinsumo);
                user.setInsumos_total_mantenimiento(Float.toString(totalinsumo));

                totalinsumo = Float.parseFloat(rs.getString("itotal_fumiga"));
                totalinsumo = (totalinsumo * 100) / sumaTotal;
                totalinsumo = round(totalinsumo);
                user.setInsumos_total_fumiga(Float.toString(totalinsumo));

                return user;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    /* Metodo que llama los datos para la grafica torra la parte de otros gastos*/
    public Graficas_usuarios GrafOtrosGastos(String num_lote) {
        PreparedStatement pst = null;

        sumaTotal(num_lote);
        int sumaTotal = Integer.parseInt(sumaTotalGraficaTorta);
        float otros;

        try {
            String sql = "select otrosgastos(?) as totalOtrosGastos";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, num_lote);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                Graficas_usuarios user = new Graficas_usuarios();

                otros = Float.parseFloat(rs.getString("totalOtrosGastos"));
                otros = (otros * 100) / sumaTotal;
                otros = round(otros);
                user.setOtrosGastos_valor(Float.toString(otros));

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
