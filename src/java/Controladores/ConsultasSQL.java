/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Grupo de Proyecto ADSI (2015-2017)
 * Adriana Milena Vera R.
 * Ana Karime Sepulveda C.
 * Angelica Maria Barrientos V.
 * Carlos Eduardo Torres N.
 * Deiby Brayan Diaz R.
 * Drawly Celied Ortega G.
 * Heyllem Dayana Sandoval R.
 * Jose Luis Alvarez R.
 * Jose Yesid Olivar
 * Kelly Yulieth Lopez N.
 * Luis Enrique Gelvis C.
 * Naudy Javier Rincon M.
 * Paola Andrea Paladinez S.
 * Samuel Antonio Sanchez
 * ///////////////////////////////////////
 * Clase ConsultasSQL, Contiene los metodos:
 * insumosAbonada
 * listar_tipo_productos
 * listar_nombres
 * abonada
 * RegistrarDespalille
 * RegistrarEntresaque
 * RegistrarMacheteada
 * RegistrarPajareo
 * RegistrarCortaGranel
 * RegistrarCortaBultos
 * registrarGravedad
 * RegistrarBombeo
 * registrarCorrido
 * siembra_manual
 * siembra_mecanizada
 * fumigas
 * insumos_fumigas
 * liquidacion
 * registroQF
 * RegistrarCortamaleza
 * registrarMantenimiento
 * registrarInsumo
 * RegistrarInsumosQuemaQuimica
 * RegistroQuemaQumica
 * registrarUsuario
 * Registrar_lotes
 * ingresar
 * registrarNivSuelo
 */

public class ConsultasSQL extends ConexionBD{
    
    private String nombre;
    private String tipo;

    public ConsultasSQL() {
    }

    public ConsultasSQL(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static String getVarCedula() {
        return VarCedula;
    }

    public static void setVarCedula(String VarCedula) {
        ConsultasSQL.VarCedula = VarCedula;
    }
    
    public static String VarCedula="";
    
    /**
     * Metodo insumosAbonada: Permite registrar los insumos de las abonadas
     * @param id_abonada
     * @param tipoinsumo
     * @param nombreinsumo
     * @param cantidad
     * @param unidadinsumo
     * @param valorunitario
     * @param valortotal
     * @return boolean
     */
    public boolean insumosAbonada(Long id_abonada,String tipoinsumo, String nombreinsumo, String cantidad, String unidadinsumo, String valorunitario, String valortotal){
        PreparedStatement pst = null;
        try {
            String consulta = "insert into insumos_abonada(id_abonada,tipo_insumo,nombre_insumo,cantidad_insumo,unidad_insumo,valor_unitario_insumo,valor_total_insumos) values (?,?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(consulta);
            pst.setLong(1, id_abonada);
            pst.setString(2, tipoinsumo);
            pst.setString(3, nombreinsumo);
            pst.setString(4, cantidad);
            pst.setString(5, unidadinsumo);
            pst.setString(6, valorunitario);
            pst.setString(7, valortotal);
            
            if (pst.executeUpdate() == 1){
                return true;
            }
            
        } catch (Exception ex) {
            System.err.println("ERROR"+ex);
        }finally{
            try {
                
                if(pst != null) pst.close();
                
            } catch (Exception e) {
                System.err.println("ERROR"+e);
            }
        }
        return false;
    }
    
    /**
     * metodo listar_tipo_productos: Selecciona el tipo de insumo en la base de datos para el combobox en el proceso de insumos
     * @return ResultSet
     */
    public ResultSet listar_tipo_productos(){
        
        PreparedStatement pst =null;
        try {
            String consulta = "select * from tipos_insumos";
            pst = getConnection().prepareStatement(consulta);
            return pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     * Metodo listar_nombres: Selecciona el nombre del insumo de la base de datos para el combobox en el proceso de insumos
     * @param clasificacion
     * @return ResultSet
     */
    public ResultSet listar_nombres(String clasificacion){
        
        PreparedStatement pst = null;
        
        try {
            String consulta = "select nombre_insumo from nombres_insumos where clasificacion = '"+clasificacion+"'";
            pst = getConnection().prepareStatement(consulta);
            return pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     * Metodo abonada: Permite registrar los datos en el proceso de abonadas
     * @param fecha
     * @param numlote
     * @param nombreabonada
     * @param cantidadmanoobra
     * @param unidadmanoobra
     * @param costounitariomanoobra
     * @param valortotalmanoobra
     * @param cantidadtransporte
     * @param unidadtransporte
     * @param costotransporte
     * @param valortotaltransporte
     * @param valortotalabonada
     * @return Long
     */
    public Long abonada(String fecha, String numlote, String nombreabonada,String cantidadmanoobra, String unidadmanoobra,String costounitariomanoobra, String valortotalmanoobra, String cantidadtransporte, String unidadtransporte, String costotransporte, String valortotaltransporte, String valortotalabonada){
        
        PreparedStatement pst = null;
        
        try {
            String consulta="insert into abonada(fecha_abonada, num_lote, nombre_abonada, cantidad_mano_obra_abonada, unidad_mano_obra_abonada, costo_unitario_mano_obra_abonada, valor_total_mano_obra_abonada, cantidad_transporte_abonada, unidad_transporte_abonada, costo_transporte_abonada, valor_total_transporte_abonada, valor_total_abonada) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            
            pst = getConnection().prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, fecha);
            pst.setString(2, numlote);
            pst.setString(3, nombreabonada);
            pst.setString(4, cantidadmanoobra);
            pst.setString(5, unidadmanoobra);
            pst.setString(6, costounitariomanoobra);
            pst.setString(7, valortotalmanoobra);
            pst.setString(8, cantidadtransporte);
            pst.setString(9, unidadtransporte);
            pst.setString(10, costotransporte);
            pst.setString(11, valortotaltransporte);
            pst.setString(12, valortotalabonada);
            
            if(pst.executeUpdate() == 1){
                ResultSet keys = pst.getGeneratedKeys();
                keys.next();
                return keys.getLong(1);
            }
            
        } catch (Exception ex) {
            System.err.println("ERROR"+ex);
        }finally{
            try {
                if(pst != null) pst.close();
            } catch (Exception e) {
                System.err.println("EROR"+e);
            }
        }
        return null;
    }
    
    /**
     * Metodo RegistrarDespalille: Permite registrar los datos en el proceso de despalille
     * @param fechaDespalille
     * @param numLoteDespalille
     * @param cantidadManoObraDespalille
     * @param precioManoObraDespalille
     * @param valorTotalDespalille
     * @param totalDespalille
     * @return boolean
     */
    public boolean RegistrarDespalille (String fechaDespalille,String numLoteDespalille,String cantidadManoObraDespalille,String precioManoObraDespalille,String valorTotalDespalille,String totalDespalille){
        PreparedStatement pst = null;
        
        try {
            if(cantidadManoObraDespalille.isEmpty() ) {
                return true;
            }
            String Consulta = "INSERT INTO despalille (fecha_dsp, num_lote, cantidad_mano_obra_dsp, precio_mano_obra_dsp, total_mano_obra_dsp, valor_total_dsp) values (?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(Consulta);
            pst.setString(1, fechaDespalille);
            pst.setString(2, numLoteDespalille);
            pst.setString(3, cantidadManoObraDespalille);
            pst.setString(4, precioManoObraDespalille);
            pst.setString(5, valorTotalDespalille);
            pst.setString(6, totalDespalille);

            
            if(pst.executeUpdate() ==1) {
               return true; 
            }
            
        } catch (Exception ex) {
            System.err.println("ERROR"+ex);
        }finally{
            try {

                if(pst !=null) pst.close();
                
            } catch (Exception e) {
                System.err.println("ERROR"+e);
            }
        }
        return false;
    }
 
     /**
      * Metodo RegistrarEntresaque: Permite registrar los datos en el proceso de entresaque
      * @param fechaEntresaque
      * @param numLoteEntresaque
      * @param cantidadManoObraEntresaque
      * @param precioManoObraEntresaque
      * @param valorTotalEntresaque
      * @param totalEntresaque
      * @return boolean
      */
     public boolean RegistrarEntresaque (String fechaEntresaque,String numLoteEntresaque,String cantidadManoObraEntresaque,String precioManoObraEntresaque,String valorTotalEntresaque,String totalEntresaque){
        PreparedStatement pst = null;
        
        if(cantidadManoObraEntresaque.isEmpty() ) {
            return true;
        } 
        
        try {
            String Consulta = "INSERT INTO entresaque (fecha_etsq, num_lote, cantidad_mano_obra_etsq, precio_mano_obra_etsq, total_mano_obra_etsq, valor_total_etsq) values (?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(Consulta);
            pst.setString(1, fechaEntresaque);
            pst.setString(2, numLoteEntresaque);
            pst.setString(3, cantidadManoObraEntresaque);
            pst.setString(4, precioManoObraEntresaque);
            pst.setString(5, valorTotalEntresaque);
            pst.setString(6, totalEntresaque);

            
            if(pst.executeUpdate() ==1) {
               return true; 
            }
            
        } catch (Exception ex) {
            System.err.println("ERROR"+ex);
        }finally{
            try {
                if(pst !=null) pst.close();
                
            } catch (Exception e) {
                System.err.println("ERROR"+e);
            }
        }
        return false;
    }
     
/**
 * Metodo RegistrarMacheteada: Permite registrar los datos en el proceso de macheteada
 * @param fechaMacheteada
 * @param numLoteMacheteada
 * @param cantidadManoObraMacheteada
 * @param precioManoObraMacheteada
 * @param valorTotalMacheteada
 * @param totalMacheteada
 * @return boolean
 */
 public boolean RegistrarMacheteada (String fechaMacheteada,String numLoteMacheteada,String cantidadManoObraMacheteada,String precioManoObraMacheteada,String valorTotalMacheteada,String totalMacheteada){
        PreparedStatement pst = null;
        
        if(valorTotalMacheteada.isEmpty() ) {
            return true;
        }
        
        try {
            String Consulta = "INSERT INTO macheteada (fecha_mchd, num_lote, cantidad_mano_obra_mchd, precio_mano_obra_mchd, total_mano_obra_mchd, valor_total_mchd) values (?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(Consulta);
            pst.setString(1, fechaMacheteada);
            pst.setString(2, numLoteMacheteada);
            pst.setString(3, cantidadManoObraMacheteada);
            pst.setString(4, precioManoObraMacheteada);
            pst.setString(5, valorTotalMacheteada);
            pst.setString(6, totalMacheteada);

            
            if(pst.executeUpdate() ==1) {
               return true; 
            }
            
        } catch (Exception ex) {
            System.err.println("ERROR"+ex);
        }finally{
            try {
                
                if(pst !=null) pst.close();
                
            } catch (Exception e) {
                System.err.println("ERROR"+e);
            }
        }
        return false;
    }

/**
 * Metodo RegistrarPajareo: Permite registrar los datos en el proceso de pajareo
 * @param fecha
 * @param numLote
 * @param cantidadManoObra
 * @param valorManoObra
 * @param valorTotalManoObra
 * @param cantidadPolvora
 * @param valorPolvora
 * @param valorTotalPolvora
 * @param total
 * @return boolean
 */  
public boolean RegistrarPajareo (String fecha,String numLote,String cantidadManoObra,String valorManoObra,String valorTotalManoObra,String cantidadPolvora,String valorPolvora,String valorTotalPolvora,String total){
        PreparedStatement pst = null;
        
        try {
            String Consulta = "INSERT INTO pajareo_celaduria_patos (fecha_pcp, num_lote, cantidad_mano_obra_pcp,valor_mano_obra_pcp, "
                    + "valor_total_mano_obra_pcp, cantidad_polvora_pcp, valor_polvora_pcp, valor_total_polvora_pcp, valor_total_pcp) values (?,?,?,?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(Consulta);
            pst.setString(1, fecha);
            pst.setString(2, numLote);
            pst.setString(3, cantidadManoObra);
            pst.setString(4, valorManoObra);
            pst.setString(5, valorTotalManoObra);
            pst.setString(6, cantidadPolvora);
            pst.setString(7, valorPolvora);
            pst.setString(8, valorTotalPolvora);
            pst.setString(9, total);

            
            if(pst.executeUpdate() ==1) {
               return true; 
            }
            
        } catch (Exception ex) {
            System.err.println("ERROR"+ex);
        }finally{
            try {
                if(getConnection() !=null) getConnection().close();
                if(pst !=null) pst.close();
                
            } catch (Exception e) {
                System.err.println("ERROR"+e);
            }
        }
        return false;
     }

/**
 * Metodo RegistrarCortaGranel: Permite registrar los datos en el proceso de corta por granel
 * @param fecha
 * @param numLote
 * @param cantidadMqLlanta
 * @param valorMqLlanta
 * @param valorTotalMqLlanta
 * @param cantidadMqOruga
 * @param valorMqOruga
 * @param valorTotalMqOruga
 * @param cantidadFlete
 * @param valorFlete
 * @param valorTotalFlete
 * @param valorCeladuriaMaquina
 * @param valorAlimentacion
 * @param valorAdministracion
 * @param transporte_oruga
 * @param costoTotal
 * @return boolean
 */
public boolean RegistrarCortaGranel (String fecha,String numLote,String cantidadMqLlanta,String valorMqLlanta,String valorTotalMqLlanta,
        String cantidadMqOruga,String valorMqOruga,String valorTotalMqOruga,String cantidadFlete,String valorFlete,String valorTotalFlete,
        String valorCeladuriaMaquina,String valorAlimentacion,String valorAdministracion,String transporte_oruga,String costoTotal){
        PreparedStatement pst = null;
        
        try {
            String Consulta = "INSERT INTO corta_granel (fecha_crg, num_lote, cantidad_mq_llanta_crg, valor_mq_llanta_crg, valor_total_mq_llanta_crg,"
                    + " cantidad_mq_oruga_crg, valor_mq_oruga_crg, valor_total_mq_oruga_crg, cantidad_flete_crg, valor_flete_crg, valor_total_flete_crg, "
                    + "valor_celaduria_maquina_crg, valor_alimentacion_crg, valor_administracion_crg, valor_maquina_oruga_crg, valor_total_crg) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(Consulta);
            pst.setString(1, fecha);
            pst.setString(2, numLote);
            pst.setString(3, cantidadMqLlanta);
            pst.setString(4, valorMqLlanta);
            pst.setString(5, valorTotalMqLlanta);
            pst.setString(6, cantidadMqOruga);
            pst.setString(7, valorMqOruga);
            pst.setString(8, valorTotalMqOruga);
            pst.setString(9, cantidadFlete);
            pst.setString(10, valorFlete);
            pst.setString(11, valorTotalFlete);
            pst.setString(12, valorCeladuriaMaquina);
            pst.setString(13, valorAlimentacion);
            pst.setString(14, valorAdministracion);
            pst.setString(15, transporte_oruga);
            pst.setString(16, costoTotal);
            
            
            if(pst.executeUpdate() ==1) {
               return true; 
            }
            
        } catch (Exception ex) {
            System.err.println("ERROR"+ex);
        }finally{
            try {
                if(getConnection() !=null) getConnection().close();
                if(pst !=null) pst.close();
                
            } catch (Exception e) {
                System.err.println("ERROR"+e);
            }
        }
        return false;
     }

/**
 * Metodo RegistrarCortaBultos: Permite registrar los datos en el proceso de corta por bultos
 * @param fecha
 * @param numLote
 * @param cantidadMqLlanta
 * @param valorMqLlanta
 * @param valorTotalMqLlanta
 * @param cantidadMqOruga
 * @param valorMqOruga
 * @param valorTotalMqOruga
 * @param cantidadLlenador
 * @param valorLlenador
 * @param valorTotalLlenador
 * @param cantidadTractor
 * @param valorTractor
 * @param valorTotalTractor
 * @param cantidadBulteador
 * @param valorBulteador
 * @param valorTotalBulteador
 * @param cantidadFlete
 * @param valorFlete
 * @param valorTotalFlete
 * @param valorCabuyaNylon
 * @param valorCeladuriaMaquina
 * @param valorAlimentacion
 * @param valorAdministracion
 * @param transporte_oruga
 * @param costoTotal
 * @return boolean
 */
public boolean RegistrarCortaBultos (String fecha,String numLote,String cantidadMqLlanta,String valorMqLlanta,String valorTotalMqLlanta,
        String cantidadMqOruga,String valorMqOruga,String valorTotalMqOruga,String cantidadLlenador,String valorLlenador,String valorTotalLlenador,
        String cantidadTractor,String valorTractor,String valorTotalTractor,String cantidadBulteador,String valorBulteador,String valorTotalBulteador,
        String cantidadFlete,String valorFlete,String valorTotalFlete,String valorCabuyaNylon,String valorCeladuriaMaquina,
        String valorAlimentacion,String valorAdministracion,String transporte_oruga,String costoTotal){
        PreparedStatement pst = null;
        
        try {
            String Consulta = "INSERT INTO corta_bultos (fecha_crb, num_lote, cantidad_mq_llanta_crb, valor_mq_llanta_crb, valor_total_mq_llanta_crb,"
                    + " cantidad_mq_oruga_crb, valor_mq_oruga_crb, valor_total_mq_oruga_crb, cantidad_llenador_crb, valor_llenador_crb, valor_total_llenador_crb, "
                    + "cantidad_tractor_crb, valor_tractor_crb, valor_total_tractor_crb, cantidad_bulteador_crb, valor_bulteador_crb, valor_total_bulteador_crb, "
                    + "cantidad_flete_crb, valor_flete_crb, valor_total_flete_crb, valor_cabuya_nylon_crb, valor_celaduria_maquina_crb, valor_alimentacion_crb, "
                    + "valor_administracion_crb,valor_maquina_oruga_crb, valor_total_crb) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            pst = getConnection().prepareStatement(Consulta);
            
            pst.setString(1, fecha);
            pst.setString(2, numLote);
            pst.setString(3, cantidadMqLlanta);
            pst.setString(4, valorMqLlanta);
            pst.setString(5, valorTotalMqLlanta);
            pst.setString(6, cantidadMqOruga);
            pst.setString(7, valorMqOruga);
            pst.setString(8, valorTotalMqOruga);
            pst.setString(9, cantidadLlenador);
            pst.setString(10, valorLlenador);
            pst.setString(11, valorTotalLlenador);
            pst.setString(12, cantidadTractor);
            pst.setString(13, valorTractor);
            pst.setString(14, valorTotalTractor);
            pst.setString(15, cantidadBulteador);
            pst.setString(16, valorBulteador);
            pst.setString(17, valorTotalBulteador);
            pst.setString(18, cantidadFlete);
            pst.setString(19, valorFlete);
            pst.setString(20, valorTotalFlete);
            pst.setString(21, valorCabuyaNylon);
            pst.setString(22, valorCeladuriaMaquina);
            pst.setString(23, valorAlimentacion);
            pst.setString(24, valorAdministracion);
            pst.setString(25, transporte_oruga);
            pst.setString(26, costoTotal);
            
            
            if(pst.executeUpdate() ==1) {
               return true; 
            }
            
        } catch (Exception ex) {
            System.err.println("ERROR"+ex);
        }finally{
            try {
                if(getConnection() !=null) getConnection().close();
                if(pst !=null) pst.close();
                
            } catch (Exception e) {
                System.err.println("ERROR"+e);
            }
        }
        return false;
     }

/**
 * Metodo registrarGravedad: Permite registrar los datos en el proceso del tipo de riego gravedad
 * @param fecha
 * @param tipo_riego
 * @param lote
 * @param cantidadObra
 * @param valorObra
 * @param valorTotalObra
 * @param valorTarifa
 * @param total
 * @return boolean
 */
public boolean registrarGravedad ( String fecha, String tipo_riego, String lote, String cantidadObra, String valorObra, String valorTotalObra, String valorTarifa, String total){
       PreparedStatement pst = null;
       
        try {
            String Consulta = "insert into riego(fecha_riego, tipo_riego, num_lote, cantidad_mano_obra_riego, valor_mano_obra_riego, total_mano_obra, valor_tarifa_districto_riego, valor_total_riego) values (?,?,?,?,?,?,?,?)";
            
            pst = getConnection().prepareStatement(Consulta);
            
            pst.setString(1, fecha);
            pst.setString(2,tipo_riego);
            pst.setString(3, lote);
            pst.setString(4, cantidadObra);
            pst.setString(5, valorObra);
            pst.setString(6, valorTotalObra);
            pst.setString(7, valorTarifa);
            pst.setString(8, total);
            
            if(pst.executeUpdate() == 1){
                return true;
            }
      
        } catch (Exception e) {
            System.err.println("ERROR" +e);
        }finally{
            try {
                if(getConnection() !=null) getConnection().close();
                if(pst !=null) pst.close();
                
            } catch (Exception e) {
                System.err.println("ERROR" +e);
            }
        }
       return false;
     
    }

/**
 * Metodo RegistrarBombeo: Permite registrar los datos en el proceso del tipo de riego bombeo
 * @param fecha
 * @param tipo_riego
 * @param numLote
 * @param cantidadManoObra
 * @param valorManoObra
 * @param totalManoObra
 * @param cantidadAceite
 * @param valorAceite
 * @param totalAceite
 * @param cantidadCombustible
 * @param valorCombustible
 * @param totalCombustible
 * @param cantidadAlquiler
 * @param valorAlquiler
 * @param totalAlquiler
 * @param valorTarifaDistricto
 * @param valorTarifaCorponor
 * @param totalTarifa
 * @param valortotal
 * @return boolean
 */
    public boolean RegistrarBombeo (String fecha, String tipo_riego, String numLote, String cantidadManoObra,String valorManoObra, String totalManoObra,String cantidadAceite,String valorAceite,String totalAceite,String cantidadCombustible,String valorCombustible,String totalCombustible,String cantidadAlquiler,String valorAlquiler,String totalAlquiler, String valorTarifaDistricto,String valorTarifaCorponor,String totalTarifa,String valortotal){
        
        PreparedStatement pst = null;
        
        try {
            String Consulta = "insert into riego(fecha_riego, tipo_riego, num_lote, cantidad_mano_obra_riego, valor_mano_obra_riego, total_mano_obra, cantidad_aceite, valor_aceite, total_aceite, cantidad_combustible, valor_combustible, total_combustible_riego, cantidad_alquiler_riego, valor_alquiler_riego, total_alquiler_riego, valor_tarifa_districto_riego, valor_tarifa_corponor_riego, total_tarifa_riego, valor_total_riego) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
          pst = getConnection().prepareStatement(Consulta);
                pst.setString(1, fecha);
                pst.setString(2,tipo_riego);
                pst.setString(3, numLote);
                pst.setString(4, cantidadManoObra);
                pst.setString(5, valorManoObra);
                pst.setString(6, totalManoObra);
                pst.setString(7, cantidadAceite);
                pst.setString(8, valorAceite); 
                pst.setString(9, totalAceite);
                pst.setString(10, cantidadCombustible); 
                pst.setString(11, valorCombustible); 
                pst.setString(12, totalCombustible); 
                pst.setString(13, cantidadAlquiler); 
                pst.setString(14, valorAlquiler); 
                pst.setString(15, totalAlquiler); 
                pst.setString(16, valorTarifaDistricto);
                pst.setString(17, valorTarifaCorponor);
                pst.setString(18, totalTarifa);
                pst.setString(19, valortotal);
                
                
                
        if (pst.executeUpdate() ==1 ){
            return true;
        }        
           
        } catch (Exception e) {
            System.err.println("ERROR" +e);
            
        }finally{
            
            try {
                if(getConnection() !=null) getConnection().close();
                if(pst !=null) pst.close();
                
            } catch (Exception e) {
                System.err.println("ERROR" +e);
            }
        }
      return false;
    }

    /**
     * Metodo registrarCorrido: Permite registrar los datos en el proceso del tipo de riego corrido
     * @param fecha
     * @param tipo_riego
     * @param numLote
     * @param cantidadManoObra
     * @param valorManoObra
     * @param totalManoObra
     * @param valorTarifaDistricto
     * @param valorTotal
     * @return boolean
     */
    public boolean registrarCorrido(String fecha, String tipo_riego, String numLote, String cantidadManoObra, String valorManoObra, String totalManoObra, String valorTarifaDistricto, String valorTotal ){
        PreparedStatement pst = null;
        
        try {
            String Consulta  = "insert into riego(fecha_riego, tipo_riego, num_lote, cantidad_mano_obra_riego, valor_mano_obra_riego, total_mano_obra, valor_tarifa_districto_riego, valor_total_riego) value (?,?,?,?,?,?,?,?)";
            
            pst = getConnection().prepareStatement(Consulta);
            pst.setString(1, fecha);
            pst.setString(2, tipo_riego);
            pst.setString(3, numLote);
            pst.setString(4, cantidadManoObra);
            pst.setString(5, valorManoObra);
            pst.setString(6, totalManoObra);
            pst.setString(7, valorTarifaDistricto);
            pst.setString(8, valorTotal);
            
            if(pst.executeUpdate()==1 ){
                return true;
            }
            
        } catch (Exception e) {
            System.err.println("ERROR" +e);
            
        }finally{
            try {
                if (getConnection() !=null ) getConnection().close();
                if(pst !=null) pst.close();
                
            } catch (Exception e) {
                System.err.println("ERROR" + e);
            }
        }
        
        return true;
    }
    
    /**
     * Metodo siembra_manual: Permite registrar los datos en el proceso de la siembra manual
     * @param fecha
     * @param num_lote
     * @param variedad_semilla
     * @param cantidad_bultos
     * @param precio_bulto
     * @param costo_semilla
     * @param costo_transporte
     * @param costo_secado_semilla
     * @param pago_total_obreros
     * @param valor_total_siembra
     * @return boolean
     */
    public boolean siembra_manual(String fecha,String num_lote,String variedad_semilla,String cantidad_bultos,String precio_bulto,String costo_semilla,String costo_transporte,String costo_secado_semilla,String pago_total_obreros,String valor_total_siembra){
       PreparedStatement pst = null;
       try {
            String insert = "insert into siembra_manual(fecha_sim, num_lote, variedad_semilla_sim, cantidad_bultos_sim,precio_bulto_sim, costo_semilla_sim, costo_transporte_sim, costo_secado_semilla_sim, pago_total_obreros_sim, valor_total_sim)values(?,?,?,?,?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(insert);
           
            pst.setString(1, fecha);
            pst.setString(2, num_lote);
            pst.setString(3, variedad_semilla);
            pst.setString(4, cantidad_bultos);
            pst.setString(5, precio_bulto);
            pst.setString(6, costo_semilla);
            pst.setString(7, costo_transporte);
            pst.setString(8, costo_secado_semilla);
            pst.setString(9, pago_total_obreros);
            pst.setString(10, valor_total_siembra);
             if(pst.executeUpdate()==1){
             return true;
             }
            
       }catch(Exception ex){
           System.err.println("ERROR" +ex);
       }finally{
           try {
               if(getConnection()!= null)getConnection().close();
               if(pst != null) pst.close();
           } catch (Exception e) {
           System.err.println("ERROR" +e);
           }
       
       }
       return false;
   }
   
    /**
     * Metodo siembra_mecanizada: Permite registrar los datos en el proceso de la siembra mecanizada
     * @param fecha
     * @param num_lote
     * @param variedad_semilla
     * @param costo_mq_sembradora
     * @param costo_semilla
     * @param secado_semilla
     * @param num_hect_sembradas
     * @param costo_mano_obra
     * @param cantidad_bultos
     * @param transporte_semilla
     * @param valor_bulto
     * @param total
     * @return boolean
     */
   public boolean siembra_mecanizada(String fecha,String num_lote,String variedad_semilla,String costo_mq_sembradora,String costo_semilla,String secado_semilla,String num_hect_sembradas,String costo_mano_obra,String cantidad_bultos,String valor_bulto,String transporte_semilla,String total){
         PreparedStatement pst = null;
       try {
            String insert = "insert into siembra_mecanizada(fecha_smzd, num_lote, variedad_semilla_smzd, costo_mq_sembradora_smzd, costo_semilla_smzd, secado_semilla_smzd, num_hect_sembradas_smzd, costo_mano_obra_smzd, cantidad_bultos_smzd, valor_bulto_smzd, transporte_semilla_smzd,valor_total_smzd) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(insert);
           
            pst.setString(1, fecha);
            pst.setString(2, num_lote);
            pst.setString(3, variedad_semilla);
            pst.setString(4, costo_mq_sembradora);
            pst.setString(5, costo_semilla);
            pst.setString(6, secado_semilla);
            pst.setString(7, num_hect_sembradas);
            pst.setString(8, costo_mano_obra);
            pst.setString(9, cantidad_bultos);
            pst.setString(10, transporte_semilla);
            pst.setString(11, valor_bulto);
            pst.setString(12, total);
             if(pst.executeUpdate()==1){
             return true;
             }
            
       }catch(Exception ex){
           System.err.println("ERROR" +ex);
       }finally{
           try {
               if(getConnection()!= null)getConnection().close();
               if(pst != null) pst.close();
           } catch (Exception e) {
           System.err.println("ERROR" +e);
           }
       
       }
       return false;
   }

   /**
    * Metodo fumigas: Permite registrar los datos en el proceso de las fumigas
    * @param fecha_fumiga
    * @param num_lote
    * @param nombre_fumiga_fumiga
    * @param cantidad_mano_obra_fumiga
    * @param valor_uni_mano_obra_fumiga
    * @param valor_total_mano_obra_fumiga
    * @param valor_total_fumiga
    * @return long
    */
   public Long fumigas(String fecha_fumiga,String num_lote, String nombre_fumiga_fumiga,String cantidad_mano_obra_fumiga,String valor_uni_mano_obra_fumiga,String valor_total_mano_obra_fumiga,String valor_total_fumiga){
        PreparedStatement pst = null;
        try {
            String consulta = "insert into fumiga(fecha_fumiga,num_lote,nombre_fumiga_fumiga,cantidad_mano_obra_fumiga,valor_uni_mano_obra_fumiga,valor_total_mano_obra_fumiga,valor_total_fumiga) values (?,?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, fecha_fumiga);
            pst.setString(2, num_lote);
            pst.setString(3, nombre_fumiga_fumiga);
            pst.setString(4, cantidad_mano_obra_fumiga);
            pst.setString(5, valor_uni_mano_obra_fumiga);
            pst.setString(6, valor_total_mano_obra_fumiga);
            pst.setString(7, valor_total_fumiga);
            
            if(pst.executeUpdate() == 1){
                ResultSet keys = pst.getGeneratedKeys();
                keys.next();
                return keys.getLong(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(pst != null ) pst.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return null;
    }
    
   /**
    * Metodo insumos_fumigas: Permite registrar los insumos de las fumigas
    * @param id_fumiga
    * @param tipo_insumo
    * @param nombre_insumo
    * @param cantidad_insumo
    * @param unidad_insumo
    * @param valor_unitario_insumo
    * @param valor_total_insumos
    * @return boolean
    */
    public boolean insumos_fumigas(Long id_fumiga,String tipo_insumo,String nombre_insumo,String cantidad_insumo,String unidad_insumo,String valor_unitario_insumo,String valor_total_insumos){ 
        PreparedStatement pst = null;
        try {
            String consulta = "insert into insumos_fumiga(id_fumiga,tipo_insumo,nombre_insumo,cantidad_insumo,unidad_insumo,valor_unitario_insumo,valor_total_insumos) values (?,?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(consulta);
            pst.setLong(1, id_fumiga);
            pst.setString(2, tipo_insumo);
            pst.setString(3, nombre_insumo);
            pst.setString(4, cantidad_insumo);
            pst.setString(5, unidad_insumo);
            pst.setString(6, valor_unitario_insumo);
            pst.setString(7, valor_total_insumos);
            
            if(pst.executeUpdate() == 1){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(pst != null) pst.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return false;
    }
   
    /**
     * Metodo liquidacion: Permite registrar los datos en el proceso de la liquidacion
     * @param tiquete
     * @param numLote
     * @param fecha
     * @param pesoNeto
     * @param pesoFinal
     * @param bultos
     * @param f24
     * @param f4
     * @param kilosVerde
     * @param valorUnitario
     * @param valor_total_liquidacion
     * @param Total_liquidacion
     * @param total_peso
     * @param total_kilos
     * @param total_valor_unitario
     * @return boolean
     */
    public boolean liquidacion(String tiquete,String numLote,String fecha,String pesoNeto,String pesoFinal,String bultos,String f24,String f4,String kilosVerde,String valorUnitario,String valor_total_liquidacion,String Total_liquidacion,String total_peso,String total_kilos,String total_valor_unitario){
         PreparedStatement pst = null;
        try {
           String consultas = "insert into liquidacion (n_tiquete_liquidacion, num_lote, fecha_liquidacion, peso_neto_liquidacion, peso_final_liquidacion, f_24_liquidacion, f_4_liquidacion, valor_unitario_liquidacion, bultos_liquidacion,kls_verdes_liquidacion,valor_total_liquidacion,total_liquidacion,total_peso_final,total_kilos_verdes,total_valor_unitario) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
           pst = getConnection().prepareStatement(consultas);
           
           pst.setString(1, tiquete);
           pst.setString(2, numLote);
           pst.setString(3, fecha);
           pst.setString(4, pesoNeto);
           pst.setString(5, pesoFinal);
           pst.setString(6, f24);
           pst.setString(7, f4);
           pst.setString(8,valorUnitario );
           pst.setString(9, bultos);
           pst.setString(10, kilosVerde);
           pst.setString(11, valor_total_liquidacion);
           pst.setString(12, Total_liquidacion);
           pst.setString(13, total_peso);
           pst.setString(14, total_kilos);
           pst.setString(15, total_valor_unitario);
          
           
           
           if(pst.executeUpdate() == 1){
               return true;
           }
           
       } catch (Exception ex) {
           System.err.println("ERROR" +ex);
       }finally{
            try {
                if(pst != null) pst.close();
                
           } catch (Exception e) {
                System.err.println("ERROR" +e);
           }
       }
        return false;
   }
    
    /**
     * Metodo registroQF: Permite registrar los datos en el proceso de la quema fisica
     * @param fechaQF
     * @param loteN
     * @param cantidadMO
     * @param valorUnidadMO
     * @param valorTotalMO
     * @param cantidadins
     * @param dosisins
     * @param valorUnitarioins
     * @param valorTotalins
     * @param valorTotalQF
     * @return boolean
     */
     public boolean registroQF( String fechaQF, String loteN, String cantidadMO, String valorUnidadMO, String valorTotalMO, String cantidadins, String dosisins, String valorUnitarioins, String valorTotalins, String valorTotalQF){
       PreparedStatement pst= null;
       try {
           String consulta="insert into quema_fisica(fecha_qf,num_lote,cantidad_jornales_qf,valor_unidad_jornal_qf,valor_total_jornal_qf,cantidad_insumos_qf,unidad_insumo_qf,valor_unitario_insumo_qf,valor_total_insumo_qf,valor_total_qf) values(?,?,?,?,?,?,?,?,?,?)";
           pst=getConnection().prepareStatement(consulta);
           pst.setString(1, fechaQF);
           pst.setString(2, loteN );
           pst.setString(3, cantidadMO );
           pst.setString(4, valorUnidadMO);
           pst.setString(5, valorTotalMO);
           pst.setString(6, cantidadins);
           pst.setString(7, dosisins);
           pst.setString(8, valorUnitarioins);
           pst.setString(9, valorTotalins);
           pst.setString(10, valorTotalQF);
           
           if (pst.executeUpdate()==1) {
               return true;
              }
                      
       } catch (Exception e) {
           System.err.println("ERROR"+e);
       }finally{
           try {
               if(getConnection()!=null) getConnection().close();
               if(pst != null) pst.close();
               
           } catch (Exception ex) {
               System.err.println("Error "+ex);
           }
       }
       return false;  
   }
     
     /**
      * Metodo RegistrarCortamaleza: Permite registrar los datos en el proceso de la cortamaleza
      * @param fecha
      * @param num_lote
      * @param tipo_manejo
      * @param cantidad_hectareas
      * @param valor_hectareas
      * @param valor_total
      * @return boolean
      */
     public boolean RegistrarCortamaleza(String fecha, String num_lote,String tipo_manejo, String cantidad_hectareas, String valor_hectareas, String valor_total){
        PreparedStatement pst = null;
        try {
            String consulta = "insert into manejo_residuos_cosecha (fecha_mrc, num_lote, tipo_manejo_mrc, cantidad_hectareas_mrc, valor_hectareas_mrc, valor_total_mrc) values (?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(consulta);
            pst.setString(1, fecha);
            pst.setString(2, num_lote);
            pst.setString(3, tipo_manejo);
            pst.setString(4, cantidad_hectareas);
            pst.setString(5, valor_hectareas);
            pst.setString(6, valor_total);
            
            if(pst.executeUpdate() == 1){
                return true;
            }
        } catch (Exception e) {
            System.err.println("ERROR"+ e);
        }finally{
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
                System.err.println("ERROR"+ e);
            }
        }
        
        return false;
    }
    
     /**
      * Metodo registrarMantenimiento: Permite registrar los datos en el proceso de mantenimiento del lote
      * @param fecha
      * @param numlote
      * @param tipolimpieza
      * @param cantidadjornal
      * @param valorjornal
      * @param valortotal
      * @param costototal
      * @return long
      */
     public Long registrarMantenimiento(String fecha, String numlote, String  tipolimpieza, String cantidadjornal, String valorjornal, String valortotal, String costototal){  
       PreparedStatement pst = null; 
        try {
            String consulta = "insert into mantenimiento_lote (fecha_mntlote, num_lote, tipo_limpieza_mntlote, cantidad_jornal_mntlote, valor_jornal_mntlote, valor_total_jornal_mntlote, valor_total_mntlote) values (?,?,?,?,?,?,?)";
            
            pst = getConnection().prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, fecha);
            pst.setString(2, numlote);
            pst.setString(3, tipolimpieza);
            pst.setString(4, cantidadjornal);
            pst.setString(5, valorjornal);
            pst.setString(6, valortotal);
            pst.setString(7, costototal);
            
            if (pst.executeUpdate() == 1) {
                ResultSet keys = pst.getGeneratedKeys();
                keys.next();
                return keys.getLong(1);
            }
            
        } catch (Exception ex) {
            System.err.println("ERROR"+ex);
        }finally{
            try {
                
                if(pst !=null) pst.close();
                
            } catch (Exception e) {
                System.err.println("ERROR"+e);
            }
        }
        return null;
   }
   
   /**
    * Metodo registrarInsumo: Permite registrar los insumos del mantenimiento del lote
    * @param id_mntlote
    * @param tipoinsumo
    * @param nombreinsumo
    * @param cantidad
    * @param unidadinsumo
    * @param valorunitario
    * @param valortotal2
    * @return boolean
    */
   public boolean registrarInsumo(Long id_mntlote, String tipoinsumo, String nombreinsumo, String  cantidad, String unidadinsumo, String valorunitario, String valortotal2){
        PreparedStatement pst = null; 
        try {
            String consulta = "insert into insumos_mantenimiento_lote (id_mntlote, tipo_insumo, nombre_insumo, cantidad_insumo, unidad_insumo, valor_unitario_insumo, valor_total_insumos) values (?,?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(consulta);
            pst.setLong(1, id_mntlote);
            pst.setString(2, tipoinsumo);
            pst.setString(3, nombreinsumo);
            pst.setString(4, cantidad);
            pst.setString(5, unidadinsumo);
            pst.setString(6, valorunitario);
            pst.setString(7, valortotal2);
            
            if (pst.executeUpdate() == 1) {
                return true;
            }
            
        } catch (Exception ex) {
            System.err.println("ERROR"+ex);
        }finally{
            try {
               
                if(pst !=null) pst.close();
                
            } catch (Exception e) {
                System.err.println("ERROR"+e);
            }
        }
        return false;
   }
   
   /**
    * Metodo RegistrarInsumoQuemaQuimica: Permite registrar los insumos de la quema quimica
    * @param id_quemaq
    * @param tipo_insumo
    * @param nombre_insumo
    * @param cantidad
    * @param unidad_insumo
    * @param valor_unitario
    * @param valor_total
    * @return boolean
    */
   public boolean RegistrarInsumosQuemaQuimica(Long id_quemaq, String tipo_insumo,String nombre_insumo, String cantidad, String unidad_insumo, String valor_unitario, String valor_total){
        PreparedStatement pst = null;
        try {
            String consulta = "insert into insumos_quema_quimica (id_quemaq,tipo_insumo,nombre_insumo,cantidad_insumo,unidad_insumo,valor_unitario_insumo,valor_total_insumos) values (?,?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(consulta);
            pst.setLong(1, id_quemaq );
            pst.setString(2, tipo_insumo);
            pst.setString(3, nombre_insumo);
            pst.setString(4, cantidad);
            pst.setString(5, unidad_insumo);
            pst.setString(6, valor_unitario);
            pst.setString(7, valor_total);
            
            if(pst.executeUpdate() == 1){
                return true;
            }
        } catch (Exception e) {
            System.err.println("ERROR"+ e);
        }finally{
            try {
                if(pst != null) pst.close();
            } catch (Exception e) {
                System.err.println("ERROR"+ e);
            }
        }
        
        return false;
    }
  
    /**
     * Metodo RegistroQuemaQuimica: Permite registrar los datos en el proceso de la quema  quimica
     * @param fecha
     * @param num_lote
     * @param cantidad_mano_obra
     * @param valor_mano_obra
     * @param valor_total_mano_obra
     * @param costo_total
     * @return long
     */
    public Long RegistroQuemaQumica(String fecha, String num_lote, String cantidad_mano_obra, String valor_mano_obra, String valor_total_mano_obra, String costo_total){
        PreparedStatement pst = null;
        try {
            String consulta = "insert into quema_quimica(fecha_quemaq, num_lote, cantidad_mano_obra_quemaq, valor_mano_obra_quemaq, valor_total_mano_obra_quemaq, valor_total_quemaq) values (?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, fecha);
            pst.setString(2, num_lote);
            pst.setString(3, cantidad_mano_obra);
            pst.setString(4, valor_mano_obra);
            pst.setString(5, valor_total_mano_obra);
            pst.setString(6, costo_total);
            
            if(pst.executeUpdate() == 1){
                ResultSet keys = pst.getGeneratedKeys();
                keys.next();
                return keys.getLong(1);
            }
        } catch (Exception e) {
            System.err.println("ERROR"+ e);
        }finally{
            try {
                if(pst != null) pst.close();
            } catch (Exception e) {
                System.err.println("ERROR"+ e);
            }
        }
        return null;
    }
    
   /**
    * Metodo registrarUsuario: Permite registrar la informacion personal del usuario
    * @param cedula
    * @param nombre
    * @param apellido
    * @param correo
    * @param contraseña
    * @param sexo
    * @param telefono
    * @param direccion
    * @return boolean
    */
    public boolean registrarUsuario(String cedula, String nombre , String apellido , String correo, String contraseña, String sexo ,String telefono , String direccion, String tipo){
        PreparedStatement pst = null;
        try {
            
            String consultas = "insert into usuario (cedula, nombre, apellido,   correo , contraseña, sexo, telefono, direccion, tipo ) values (?,?,?,?,?,?,?,?,?)"; 
            pst = getConnection().prepareStatement(consultas);
            pst.setString(1, cedula);
            pst.setString(2, nombre);
            pst.setString(3, apellido);
            pst.setString(4, correo);
            pst.setString(5, contraseña);
            pst.setString(6, sexo);
            pst.setString(7, telefono);
            pst.setString(8, direccion);
            pst.setString(9, tipo);
            if (pst.executeUpdate()== 1){
                return true;
            }
        } catch (Exception ex) {
            System.out.println("ERROR" + ex);
        } finally {
            try {
                 if(pst != null) pst.close();
            } catch (Exception e) {
                System.err.print("ERROR" + e);
            }
        }
        return false;
    }
    
    /**
     * Metodo Registrar_lotes: Permite registrar la informcion del lote  perteneciente a un usuario previamente registrado
     * @param num_lote
     * @param cedula
     * @param area_lote
     * @param arriendo_lote
     * @return boolean
     */
    public boolean Registrar_lotes( String num_lote,String cedula, String area_lote,String arriendo_lote){
    PreparedStatement pst = null;
        try {
        String consultas = "insert into lote (num_lote,usuario_cedula, area_lote,arriendo_lote) values (?,?,?,?)";
        pst  = getConnection().prepareStatement(consultas);
        pst.setString(1, num_lote);
        pst.setString(2, cedula);
        
        pst.setString(3, area_lote);
        pst.setString(4, arriendo_lote);
            if (pst.executeUpdate() == 1 ) {
                return true;
            }
            
        } catch (Exception e) {
            System.err.println("ERROR"+ e);
        }finally {
            try{
                if(pst != null) pst.close();
            }catch(Exception e ){
                System.err.println("ERROR"+ e);
            }
        }
    
    return false;
    }
    
    /**
     * Metodo ingresar: Valida la información suministrada por  el usuario
     * @param cedula
     * @param contraseña
     * @return boolean
     */
<<<<<<< HEAD
=======
    public static String cedulaLogin;
    public static String passLogin;
>>>>>>> c5ebec0ecd993e9b7a465c6ebb080ac3ab015227
     public boolean ingresar(String cedula, String contraseña ){
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consultas = "select * from usuario where  cedula = ? and contraseña = ? ";
            pst =getConnection().prepareStatement(consultas);
            pst.setString(1, cedula);
            pst.setString(2, contraseña);
            
            rs = pst.executeQuery();             
            while(rs.next()){
            this.setNombre(rs.getString("nombre"));
<<<<<<< HEAD
            this.setTipo(rs.getString("tipo"));
=======
            cedulaLogin = rs.getString("cedula");
            this.setTipo(rs.getString("tipo"));
            passLogin = rs.getString("contraseña");
>>>>>>> c5ebec0ecd993e9b7a465c6ebb080ac3ab015227
            }
                     
            if (rs.absolute(1)) {
                VarCedula=cedula;
                return true;
            }
                
            
        } catch (Exception e) {
            System.err.println("Error" + e);
        }finally{
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null)pst.close();
                if(rs != null) rs.close();
                
            } catch (Exception e) {
                System.err.println("ERROR" + e);
            }
        }
        return false;
        }
     
    
     
    Statement s;
    ResultSet r;
    PreparedStatement p;
    /**
     * Metodo registrarNivSuelo: Permite registrar los datos en el proceso de la nivelación de suelo
     * @param fecha
     * @param num_lote
     * @param tipo_preparacion
     * @param cantidad_hect_horas
     * @param pases
     * @param valor_unitario
     * @param valor_total
     * @param total
     * @return boolean
     */
    public boolean registrarNivSuelo(String fecha, String num_lote, String tipo_preparacion, String cantidad_hect_horas, String pases, String valor_unitario, String valor_total, String total){
        try {
            String consulta="insert into preparacion_suelo(fecha_preparacions,num_lote,tipo_preparacions,cantidad_hect_horas_preparacions,pases_preparacions,valor_unitario_preparacions,valor_total_preparacions,total_preparacions) values (?,?,?,?,?,?,?,?)";
            p= getConnection().prepareStatement(consulta);
            p.setString(1, fecha);
            p.setString(2, num_lote);
            p.setString(3, tipo_preparacion);
            p.setString(4, cantidad_hect_horas);
            p.setString(5, pases);
            p.setString(6, valor_unitario);
            p.setString(7, valor_total);
            p.setString(8, total);
            
            int row = p.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("ERROR"+e);
        }finally{
            try {
                
                if(p !=null) 
                    p.close();
                
            } catch (Exception e) {
                System.err.println("ERROR"+e);
            }
        }
        return false;
    } 
    
    public boolean RegistrarInsumos( String nombre_insumo,String clasificacion){
        PreparedStatement pst = null;
        try {
            String consultas = "insert into nombres_insumos( nombre_insumo,clasificacion) values (?,?)";
            pst = getConnection().prepareStatement(consultas);
            pst.setString(1, nombre_insumo);
            pst.setString(2,clasificacion);
            if (pst.executeUpdate() == 1) {
                return true;
            }
        } catch (Exception ex) {
            System.out.println("ERROR"+ ex);
        }finally{
            try {
                if (pst != null)pst.close(); 
                    
                } catch (Exception e) {
                    System.out.println("ERROR" + e);
            }
        }
    return  false;
    }
    
     public boolean Registrarparafiscales( String num_lote,String fomento_arrocero ,String bolsa_retencion,  String asistensia_tecnica ,  String intereses ){
        PreparedStatement pst = null;
        try {
            String consultas = "insert into parafiscales (num_lote , fomento_arrocero , bolsa_retencion,asistencia_tecnica,intereses) values(?,?,?,?,?)";
            pst = getConnection().prepareStatement(consultas);
            pst.setString(1,num_lote);
            pst.setString(2,fomento_arrocero);
            pst.setString(3,bolsa_retencion);
            pst.setString(4,asistensia_tecnica);
            pst.setString(5,intereses);
            
            if (pst.executeUpdate() == 1) {
                return true;
            }
        } catch (Exception ex) {
            System.out.println("ERROR"+ ex);
        }finally{
            try {
                if (pst != null)pst.close(); 
                    
                } catch (Exception e) {
                    System.out.println("ERROR" + e);
            }
        }
    return  false;
    }
    
    /*public static void main(String[] args) {
        ConsultasSQL co = new ConsultasSQL();
        System.out.println(co.Registrarparafiscales("aof09e", "1000", "5666", "7888", "89999", "988", "9888"));
 
    }*/
    
    
    public boolean validarusuario(String cedula ){
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta ="select cedula from usuario where cedula = ?";
            pst = getConnection().prepareStatement(consulta);
            pst.setString(1, cedula);
            
             rs = pst.executeQuery();
            
                if (rs.next()) {
                    if (rs.getString("cedula").equals(cedula)) {
                        return true;
                    }
            }
        } catch (Exception e) {
            System.err.println("ERROR: "+ e);
        } finally{
            try {
                if (getConnection() != null){
                    getConnection().close();
                }
                if (pst != null || rs != null ) {
                    getConnection().close();
                }
            } catch (Exception e) {
                System.err.println("ERROR"+ e);
            }
        }
        return false;
    }
        
            
    public boolean validarLote(String num_lote){

        PreparedStatement pst = null;

            try {
                String consulta = "select * from lote where num_lote = ?";
                pst = getConnection().prepareStatement(consulta);
                pst.setString(1, num_lote);
                ResultSet rs = pst.executeQuery();
                if(rs.absolute(1)){
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                try {
                    if(pst != null) pst.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }return false;
    }
    
    public boolean eliminarQuemaQ (String id){
        
        PreparedStatement pst = null;
        try {
            String sql = "delete from quema_quimica where id_quemaq = ?";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, id);
            
            if(pst.executeUpdate() >= 1){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
    
    public boolean eliminarQuemaF (String id){
        
        PreparedStatement pst = null;
        try {
            String sql = "delete from quema_fisica where id_qf = ?";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, id);
            
            if(pst.executeUpdate() >= 1){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
    
    public boolean eliminarPreparacionS (String id){
        
        PreparedStatement pst = null;
        try {
            String sql = "delete from preparacion_suelo where id_preparacions = ?";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, id);
            
            if(pst.executeUpdate() >= 1){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
    
    public boolean eliminarMRC (String id){
        
        PreparedStatement pst = null;
        try {
            String sql = "delete from manejo_residuos_cosecha where id_mrc = ?";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, id);
            
            if(pst.executeUpdate() >= 1){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
    
    public boolean eliminarSM (String id){
        
        PreparedStatement pst = null;
        try {
            String sql = "delete from siembra_mecanizada where id_smzd = ?";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, id);
            
            if(pst.executeUpdate() >= 1){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
    
    public boolean eliminarSManual (String id){
        
        PreparedStatement pst = null;
        try {
            String sql = "delete from siembra_manual where id_sim = ?";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, id);
            
            if(pst.executeUpdate() >= 1){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
    
    public boolean eliminarAbonada (String id){
        
        PreparedStatement pst = null;
        try {
            String sql = "delete from abonada where id_abonada = ?";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, id);
            
            if(pst.executeUpdate() >= 1){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
    
    public boolean eliminarFumiga (String id){
        
        PreparedStatement pst = null;
        try {
            String sql = "delete from fumiga where id_fumiga = ?";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, id);
            
            if(pst.executeUpdate() >= 1){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
    public boolean eliminarDespalille (String id){
        
        PreparedStatement pst = null;
        try {
            String sql = "delete from despalille where id_dsp = ?";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, id);
            
            if(pst.executeUpdate() >= 1){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
    
    public boolean eliminarEntresaque (String id){
        
        PreparedStatement pst = null;
        try {
            String sql = "delete from entresaque where id_etsq = ?";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, id);
            
            if(pst.executeUpdate() >= 1){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
    public boolean eliminarMacheteada (String id){
        
        PreparedStatement pst = null;
        try {
            String sql = "delete from macheteada where id_mchd = ?";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, id);
            
            if(pst.executeUpdate() >= 1){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
    
    public boolean eliminarPajareo (String id){
        
        PreparedStatement pst = null;
        try {
            String sql = "delete from pajareo_celaduria_patos where id_pcp = ?";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, id);
            
            if(pst.executeUpdate() >= 1){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
     public boolean eliminarRiego (String id){
        
        PreparedStatement pst = null;
        try {
            String sql = "delete from riego where id_riego = ?";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, id);
            
            if(pst.executeUpdate() >= 1){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
     
      public boolean eliminarCB (String id){
        
        PreparedStatement pst = null;
        try {
            String sql = "delete from corta_bultos where id_crb = ?";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, id);
            
            if(pst.executeUpdate() >= 1){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
      
      public boolean eliminarCG (String id){
        
        PreparedStatement pst = null;
        try {
            String sql = "delete from corta_granel where id_crg = ?";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, id);
            
            if(pst.executeUpdate() >= 1){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
      
       public boolean eliminarMntlote (String id){
        
        PreparedStatement pst = null;
        try {
            String sql = "delete from mantenimiento_lote where id_mntlote = ?";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, id);
            
            if(pst.executeUpdate() >= 1){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
       
       public boolean eliminarLiquidacion (String id){
        
        PreparedStatement pst = null;
        try {
            String sql = "delete from liquidacion where n_tiquete_liquidacion = ?";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, id);
            
            if(pst.executeUpdate() >= 1){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
}