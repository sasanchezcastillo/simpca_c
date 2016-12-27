package Controladores;

import Modelos.insumos_quema_quimica;
import Modelos.insumo_manteni_lot_1;
import Modelos.Abonada;
import Modelos.Arriendo;
import Modelos.CortaBultos;
import Modelos.CortaGranel;
import Modelos.Despalille;
import Modelos.Detalles_corta_maleza;
import Modelos.Entresaque;
import Modelos.Fumiga;
import Modelos.Macheteada;
import Modelos.Mantenimiento;
import Modelos.PajareoCeladuria;
import Modelos.PreparacionSuelo;
import Modelos.QuemaFisica;
import Modelos.QuemaQuimica;
import Modelos.Residuos;
import Modelos.Riego;
import Modelos.SiembraManual;
import Modelos.SiembraMecanizada;
import Modelos.TotalAbonada;
import Modelos.Total_Corta_maleza;
import Modelos.asistencia;
import Modelos.consulta_todo;
import Modelos.ganancias;
import Modelos.gasto_insumos;
import Modelos.gasto_kilogramo;
import Modelos.gastos_hectareas;
import Modelos.gastos_mano_obra;
import Modelos.insumos_abonada;
import Modelos.insumos_fumiga;
import Modelos.liquidacion;
import Modelos.liquidacionTotal;
import Modelos.otros_gastos;
import Modelos.total_corta_bultos;
import Modelos.total_corta_granel;
import Modelos.total_despalille;
import Modelos.total_entresaque;
import Modelos.total_fumiga;
import Modelos.total_insumo_mantenimiento_lote;
import Modelos.total_insumo_quema_quimica;
import Modelos.total_insumos_abonada;
import Modelos.total_insumos_fumiga;
import Modelos.total_macheteada;
import Modelos.total_mantenimiento_lote;
import Modelos.total_pajareo;
import Modelos.total_preparacion_suelo;
import Modelos.total_quema_fisica;
import Modelos.total_quema_quimica;
import Modelos.total_residuos;
import Modelos.total_riego;
import Modelos.total_siembra_manual;
import Modelos.total_siembra_mecanizada;
import Modelos.valor_totales;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Conexion {

    private Statement consulta;
    private ResultSet resultado;
    private Connection conexion;
    private ArrayList lista;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/simpca?user=root&password=9510");
            consulta = conexion.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        

    }

    public ResultSet Consultar(String sql) {
        try {
            return consulta.executeQuery(sql);
        } catch (Exception e) {
            return null;
        }
    }

    public boolean Ejecutar(String sql) {
        try {
            consulta.execute(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList<Abonada> getAbonadas(String num_lote) {

        lista = new ArrayList<>();
        String sql = "SELECT * from abonada where num_lote = '" + num_lote + "' ;";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new Abonada(resultado.getString("fecha_abonada"), resultado.getString("nombre_abonada"), resultado.getString("cantidad_mano_obra_abonada"), resultado.getString("costo_unitario_mano_obra_abonada"), resultado.getString("valor_total_mano_obra_abonada"), resultado.getString("cantidad_transporte_abonada"), resultado.getString("costo_transporte_abonada"), resultado.getString("valor_total_transporte_abonada"), resultado.getString("valor_total_abonada"), resultado.getString("num_lote"), resultado.getString("id_abonada")));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<CortaBultos> getCortaBultos(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select * from corta_bultos where num_lote = '" + num_lote + "';";

        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new CortaBultos(resultado.getString("fecha_crb"), resultado.getString("cantidad_mq_llanta_crb"), resultado.getString("valor_mq_llanta_crb"), resultado.getString("valor_total_mq_llanta_crb"), resultado.getString("cantidad_mq_oruga_crb"), resultado.getString("valor_mq_oruga_crb"), resultado.getString("valor_total_mq_oruga_crb"), resultado.getString("cantidad_llenador_crb"), resultado.getString("valor_llenador_crb"), resultado.getString("valor_total_llenador_crb"), resultado.getString("cantidad_tractor_crb"), resultado.getString("valor_tractor_crb"), resultado.getString("valor_total_tractor_crb"), resultado.getString("cantidad_bulteador_crb"), resultado.getString("valor_bulteador_crb"), resultado.getString("valor_total_bulteador_crb"), resultado.getString("cantidad_flete_crb"), resultado.getString("valor_flete_crb"), resultado.getString("valor_total_flete_crb"), resultado.getString("valor_cabuya_nylon_crb"), resultado.getString("valor_celaduria_maquina_crb"), resultado.getString("valor_alimentacion_crb"), resultado.getString("valor_administracion_crb"), resultado.getString("valor_maquina_oruga_crb"), resultado.getString("valor_total_crb"), resultado.getString("num_lote"), resultado.getString("id_crb")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;

    }

    public ArrayList<CortaGranel> getCortaGranels(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select * from corta_granel where num_lote = '" + num_lote + "';";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new CortaGranel(resultado.getString("fecha_crg"), resultado.getString("cantidad_mq_llanta_crg"), resultado.getString("valor_mq_llanta_crg"), resultado.getString("valor_total_mq_llanta_crg"), resultado.getString("cantidad_mq_oruga_crg"), resultado.getString("valor_mq_oruga_crg"), resultado.getString("valor_total_mq_oruga_crg"), resultado.getString("cantidad_flete_crg"), resultado.getString("valor_flete_crg"), resultado.getString("valor_total_flete_crg"), resultado.getString("valor_celaduria_maquina_crg"), resultado.getString("valor_alimentacion_crg"), resultado.getString("valor_administracion_crg"), resultado.getString("valor_total_crg"), resultado.getString("num_lote"), resultado.getString("id_crg")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Despalille> getDespalille(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select * from despalille where num_lote = '" + num_lote + "';";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new Despalille(resultado.getString("fecha_dsp"), resultado.getString("cantidad_mano_obra_dsp"), resultado.getString("precio_mano_obra_dsp"), resultado.getString("total_mano_obra_dsp"), resultado.getString("valor_total_dsp"), resultado.getString("num_lote"), resultado.getString("id_dsp")));
            }

            System.err.println("lo que muestra" + resultado);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static void main(String[] args) {
        Conexion co = new Conexion();
        System.out.println(co.getDespalille("202"));
    }

    public ArrayList<Entresaque> getEntresaques(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select * from entresaque where num_lote = '" + num_lote + "';";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new Entresaque(resultado.getString("fecha_etsq"), resultado.getString("cantidad_mano_obra_etsq"), resultado.getString("precio_mano_obra_etsq"), resultado.getString("total_mano_obra_etsq"), resultado.getString("valor_total_etsq"), resultado.getString("num_lote"), resultado.getString("id_etsq")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Fumiga> getFumigas(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select * from fumiga where num_lote = '" + num_lote + "';";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new Fumiga(resultado.getString("fecha_fumiga"), resultado.getString("nombre_fumiga_fumiga"), resultado.getString("cantidad_mano_obra_fumiga"), resultado.getString("valor_uni_mano_obra_fumiga"), resultado.getString("valor_total_mano_obra_fumiga"), resultado.getString("valor_total_fumiga"), resultado.getString("num_lote"), resultado.getString("id_fumiga")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Macheteada> getMacheteadas(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select * from macheteada where num_lote = '" + num_lote + "';";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new Macheteada(resultado.getString("fecha_mchd"), resultado.getString("cantidad_mano_obra_mchd"), resultado.getString("precio_mano_obra_mchd"), resultado.getString("total_mano_obra_mchd"), resultado.getString("valor_total_mchd"), resultado.getString("num_lote"), resultado.getString("id_mchd")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Mantenimiento> getMantenimientos(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select * from mantenimiento_lote where num_lote = '" + num_lote + "';";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new Mantenimiento(resultado.getString("fecha_mntlote"), resultado.getString("tipo_limpieza_mntlote"), resultado.getString("cantidad_jornal_mntlote"), resultado.getString("valor_jornal_mntlote"), resultado.getString("valor_total_jornal_mntlote"), resultado.getString("valor_total_mntlote"), resultado.getString("num_lote"), resultado.getString("id_mntlote")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<PajareoCeladuria> getPajareoCeladurias(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select * from pajareo_celaduria_patos where num_lote = '" + num_lote + "';";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new PajareoCeladuria(resultado.getString("fecha_pcp"), resultado.getString("cantidad_mano_obra_pcp"), resultado.getString("valor_mano_obra_pcp"), resultado.getString("valor_total_mano_obra_pcp"), resultado.getString("cantidad_polvora_pcp"), resultado.getString("valor_polvora_pcp"), resultado.getString("valor_total_polvora_pcp"), resultado.getString("valor_total_pcp"), resultado.getString("num_lote"), resultado.getString("id_pcp")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<PreparacionSuelo> getPreparacionSuelos(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select * from preparacion_suelo where num_lote = '" + num_lote + "';";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new PreparacionSuelo(resultado.getString("fecha_preparacions"), resultado.getString("tipo_preparacions"), resultado.getString("cantidad_hect_horas_preparacions"), resultado.getString("pases_preparacions"), resultado.getString("valor_unitario_preparacions"), resultado.getString("valor_total_preparacions"), resultado.getString("total_preparacions"), resultado.getString("num_lote"), resultado.getString("id_preparacions")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<QuemaFisica> getFisicas(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select * from quema_fisica where  num_lote = '" + num_lote + "';";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new QuemaFisica(resultado.getString("fecha_qf"), resultado.getString("cantidad_jornales_qf"), resultado.getString("valor_unidad_jornal_qf"), resultado.getString("valor_total_jornal_qf"), resultado.getString("cantidad_insumos_qf"), resultado.getString("unidad_insumo_qf"), resultado.getString("valor_unitario_insumo_qf"), resultado.getString("valor_total_insumo_qf"), resultado.getString("valor_total_qf"), resultado.getString("num_lote"), resultado.getString("id_qf")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<QuemaQuimica> getQuemaQuimicas(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select * from quema_quimica where num_lote = '" + num_lote + "';";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new QuemaQuimica(resultado.getString("fecha_quemaq"), resultado.getString("cantidad_mano_obra_quemaq"), resultado.getString("valor_mano_obra_quemaq"), resultado.getString("valor_total_mano_obra_quemaq"), resultado.getString("valor_total_quemaq"), resultado.getString("num_lote"), resultado.getString("id_quemaq")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Residuos> getResiduoses(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select * from manejo_residuos_cosecha where num_lote = '" + num_lote + "';";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new Residuos(resultado.getString("fecha_mrc"), resultado.getString("tipo_manejo_mrc"), resultado.getString("cantidad_hectareas_mrc"), resultado.getString("valor_hectareas_mrc"), resultado.getString("valor_total_mrc"), resultado.getString("num_lote")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Riego> getRiegos(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select * from riego where num_lote = '" + num_lote + "';";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new Riego(resultado.getString("fecha_riego"), resultado.getString("tipo_riego"), resultado.getString("cantidad_mano_obra_riego"), resultado.getString("valor_mano_obra_riego"), resultado.getString("total_mano_obra"), resultado.getString("cantidad_aceite"), resultado.getString("valor_aceite"), resultado.getString("total_aceite"), resultado.getString("cantidad_combustible"), resultado.getString("valor_combustible"), resultado.getString("total_combustible_riego"), resultado.getString("cantidad_alquiler_riego"), resultado.getString("valor_alquiler_riego"), resultado.getString("total_alquiler_riego"), resultado.getString("valor_tarifa_districto_riego"), resultado.getString("valor_tarifa_corponor_riego"), resultado.getString("total_tarifa_riego"), resultado.getString("valor_total_riego"), resultado.getString("num_lote"), resultado.getString("id_riego")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<SiembraManual> getSiembraManuals(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select * from siembra_manual where num_lote = '" + num_lote + "';";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new SiembraManual(resultado.getString("fecha_sim"), resultado.getString("variedad_semilla_sim"), resultado.getString("cantidad_bultos_sim"), resultado.getString("precio_bulto_sim"), resultado.getString("costo_semilla_sim"), resultado.getString("costo_transporte_sim"), resultado.getString("costo_secado_semilla_sim"), resultado.getString("pago_total_obreros_sim"), resultado.getString("valor_total_sim"), resultado.getString("num_lote"), resultado.getString("id_sim")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<SiembraMecanizada> getSiembraMecanizadas(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select * from siembra_mecanizada where num_lote = '" + num_lote + "';";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new SiembraMecanizada(resultado.getString("fecha_smzd"), resultado.getString("variedad_semilla_smzd"), resultado.getString("costo_mq_sembradora_smzd"), resultado.getString("costo_semilla_smzd"), resultado.getString("secado_semilla_smzd"), resultado.getString("num_hect_sembradas_smzd"), resultado.getString("costo_mano_obra_smzd"), resultado.getString("cantidad_bultos_smzd"), resultado.getString("valor_bulto_smzd"), resultado.getString("valor_total_smzd"), resultado.getString("num_lote"), resultado.getString("id_smzd")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<consulta_todo> getconsulta_todo(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select a.valor_total_abobada,b.valor_total_corta,c.valor_total_granel from abonada;";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new CortaBultos(resultado.getString("fecha_corta_bultos"), resultado.getString("cantidad_mq_llanta"), resultado.getString("valor_mq_llanta"), resultado.getString("valor_total_mq_llanta"), resultado.getString("cantidad_mq_oruga"), resultado.getString("valor_mq_oruga"), resultado.getString("valor_total_mq_oruga"), resultado.getString("cantidad_llenador"), resultado.getString("valor_llenador"), resultado.getString("valor_total_llenador"), resultado.getString("cantidad_tractor"), resultado.getString("valor_tractor"), resultado.getString("valor_total_tractor"), resultado.getString("cantidad_bulteador"), resultado.getString("valor_bulteador"), resultado.getString("valor_total_bulteador"), resultado.getString("cantidad_flete"), resultado.getString("valor_flete"), resultado.getString("valor_total_flete"), resultado.getString("valor_cabuya_nylon"), resultado.getString("valor_celaduria_maquina"), resultado.getString("valor_alimentacion"), resultado.getString("valor_administracion"), resultado.getString("valor_maquina_oruga_crb"), resultado.getString("valor_total"), resultado.getString("num_lote"), resultado.getString("id_crb")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;

    }

    public ArrayList<insumo_manteni_lot_1> getinsumo_manteni_lot_1(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select i.* from mantenimiento_lote m join insumos_mantenimiento_lote  i on m.id_mntlote = i.id_mntlote  where num_lote = '" + num_lote + "';";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new insumo_manteni_lot_1(resultado.getString("tipo_insumo"), resultado.getString("nombre_insumo"), resultado.getString("cantidad_insumo"), resultado.getString("unidad_insumo"), resultado.getString("valor_unitario_insumo"), resultado.getString("valor_total_insumos"), resultado.getString("id_mntlote")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<insumos_quema_quimica> getinsumos_quema_quimicas(String num_lote) {
        lista = new ArrayList<>();
        String sql = "select i.* from quema_quimica q join insumos_quema_quimica i on q.id_quemaq=i.id_quemaq where num_lote= '" + num_lote + "' ";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new insumos_quema_quimica(resultado.getString("tipo_insumo"), resultado.getString("nombre_insumo"), resultado.getString("cantidad_insumo"), resultado.getString("unidad_insumo"), resultado.getString("valor_unitario_insumo"), resultado.getString("valor_total_insumos"), resultado.getString("id_quemaq")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<insumos_abonada> getinsumos_abonada(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select i.* from abonada a join insumos_abonada i on a.id_abonada=i.id_abonada where num_lote= '" + num_lote + "'";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new insumos_abonada(resultado.getString("tipo_insumo"), resultado.getString("nombre_insumo"), resultado.getString("cantidad_insumo"), resultado.getString("unidad_insumo"), resultado.getString("valor_unitario_insumo"), resultado.getString("valor_total_insumos")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<insumos_fumiga> getinsumos_fumiga(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select * from fumiga f join insumos_fumiga  i on f.id_fumiga = i.id_fumiga where num_lote='" + num_lote + "'";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new insumos_fumiga(resultado.getString("tipo_insumo"), resultado.getString("nombre_insumo"), resultado.getString("cantidad_insumo"), resultado.getString("unidad_insumo"), resultado.getString("valor_unitario_insumo"), resultado.getString("valor_total_insumos")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Abonada> getTotalAbonada(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select sum(valor_total_abonada) as total1 from abonada where num_lote='" + num_lote + "'";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new TotalAbonada(resultado.getLong("total1")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<QuemaFisica> gettotal_quema_fisica(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select sum(valor_total_qf) as valor_total_qf from quema_fisica where num_lote ='" + num_lote + "';";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new total_quema_fisica(resultado.getLong("valor_total_qf")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<QuemaQuimica> gettotal_quema_quimica(String num_lote) {
        lista = new ArrayList<>();
        try {
            String sql = "select sum(valor_total_quemaq) as valor_total from quema_quimica  where num_lote ='" + num_lote + "'  ";
            System.out.println("lo que" + sql);
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new total_quema_quimica(resultado.getLong("valor_total")));
            }
            System.out.println("Lo que arroja el rs" + resultado);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Residuos> gettotal_residuos(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select sum(valor_total_mrc) as valor_total_mrc from manejo_residuos_cosecha where num_lote ='" + num_lote + "'";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new total_residuos(resultado.getLong("valor_total_mrc")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<PreparacionSuelo> gettotal_preparacion_suelo(String num_lote) {
        lista = new ArrayList<>();
        long end = 0;
        String sql = "select ifnull(sum(valor_total_preparacions),0) as total_preparacions from preparacion_suelo where num_lote = '"+num_lote+"' ";
        try {
            resultado = Consultar(sql);
            
                while (resultado.next()) {
                    System.out.println("este es el resultado de preparacion suelo " + resultado.getLong("total_preparacions"));
                    lista.add(new total_preparacion_suelo(resultado.getLong("total_preparacions")));
                }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Mantenimiento> gettotal_mantenimiento_lote(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select sum(valor_total_mntlote) as valor_total_mntlote from mantenimiento_lote where num_lote ='" + num_lote + "'";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new total_mantenimiento_lote(resultado.getLong("valor_total_mntlote")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Riego> gettotal_riego(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select sum(valor_total_riego) as valor_total_riego from riego where num_lote ='" + num_lote + "'";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new total_riego(resultado.getLong("valor_total_riego")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<SiembraManual> gettotal_siembra_manual(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select sum(valor_total_sim) as valor_total_sim from siembra_manual where num_lote ='" + num_lote + "' ";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new total_siembra_manual(resultado.getLong("valor_total_sim")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<SiembraMecanizada> gettotal_siembra_mecanizada(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select sum(valor_total_smzd) as valor_total_smzd from siembra_mecanizada where num_lote ='" + num_lote + "'";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new total_siembra_mecanizada(resultado.getLong("valor_total_smzd")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<PajareoCeladuria> gettotal_pajareo(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select sum(valor_total_pcp) as valor_total_pcp from pajareo_celaduria_patos where num_lote ='" + num_lote + "'";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new total_pajareo(resultado.getLong("valor_total_pcp")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Fumiga> gettotal_fumiga(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select sum(valor_total_fumiga) as total1 from fumiga where num_lote = '" + num_lote + "'";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new total_fumiga(resultado.getLong("total1")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Despalille> gettotal_despalille(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select sum(total_mano_obra_dsp) as valor_total_dsp from despalille where num_lote ='" + num_lote + "'";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new total_despalille(resultado.getLong("valor_total_dsp")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Entresaque> gettotal_entresaque(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select sum(total_mano_obra_etsq) as valor_total_etsq from entresaque where num_lote ='" + num_lote + "'";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new total_entresaque(resultado.getLong("valor_total_etsq")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Macheteada> gettotal_macheteada(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select sum(total_mano_obra_mchd) as valor_total_mchd from macheteada where num_lote ='" + num_lote + "'";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new total_macheteada(resultado.getLong("valor_total_mchd")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<CortaBultos> gettotal_corta_bultos(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select sum(valor_total_crb) as valor_total_crb from corta_bultos where num_lote ='" + num_lote + "'";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new total_corta_bultos(resultado.getLong("valor_total_crb")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<CortaGranel> gettotal_corta_granel(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select sum(valor_total_crg) as valor_total_crg from corta_granel where num_lote ='" + num_lote + "'";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new total_corta_granel(resultado.getLong("valor_total_crg")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Total_Corta_maleza> getTotal_Corta_maleza(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select sum(valor_total_mrc) as valor_total_mrc from manejo_residuos_cosecha where num_lote ='" + num_lote + "'";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new Total_Corta_maleza(resultado.getLong("valor_total_mrc")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Detalles_corta_maleza> getDetalles_corta_maleza(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select * from manejo_residuos_cosecha where num_lote = '" + num_lote + "'";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new Detalles_corta_maleza(resultado.getString("fecha_mrc"), resultado.getString("tipo_manejo_mrc"), resultado.getString("cantidad_hectareas_mrc"), resultado.getString("valor_hectareas_mrc"), resultado.getString("valor_total_mrc"), resultado.getString("id_mrc")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<liquidacionTotal> getLiquidaciontotal(String num_lote) {

        lista = new ArrayList<>();
        String sql = "SELECT ifnull(sum(valor_total_liquidacion),0) as valor_total_liquidacion from liquidacion WHERE num_lote = '" + num_lote + "'";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new liquidacionTotal(resultado.getString("valor_total_liquidacion")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<liquidacion> getLiquidaciontotalDetalles(String num_lote) {

        lista = new ArrayList<>();
        String sql = "SELECT * from liquidacion WHERE num_lote = '" + num_lote + "'";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new liquidacion(resultado.getString("n_tiquete_liquidacion"), resultado.getString("fecha_liquidacion"), resultado.getString("peso_neto_liquidacion"), resultado.getString("peso_final_liquidacion"), resultado.getString("f_24_liquidacion"), resultado.getString("f_4_liquidacion"), resultado.getString("valor_unitario_liquidacion"), resultado.getString("bultos_liquidacion"), resultado.getString("kls_verdes_liquidacion"), resultado.getString("valor_total_liquidacion"), resultado.getString("total_liquidacion"), resultado.getString("total_peso_final"), resultado.getString("total_kilos_verdes"), resultado.getString("total_valor_unitario")));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<valor_totales> getValortotal(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select total1('" + num_lote + "') as total";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                System.err.println("eeeeeeeeeeeeeeeeeeeeeeee" + resultado.getString("total"));
                lista.add(new valor_totales(resultado.getString("total")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<gastos_hectareas> getTotal_gastos(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select gastos_hectareas2('" + num_lote + "') as total";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                System.err.println("eeeeeeeeeeeeeeeeeeeeeeee" + resultado.getString("total"));
                lista.add(new gastos_hectareas(resultado.getString("total")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<ganancias> getValor_ganancia(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select ifnull(ganancias('" + num_lote + "'),'$0') as total";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                System.err.println("eeeeeeeeeeeeeeeeeeeeeeee" + resultado.getString("total"));
                lista.add(new ganancias(resultado.getString("total")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<gasto_kilogramo> getValor_kilogramo(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select ifnull(costo_kilogramo('" + num_lote + "'),0) as total";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                System.err.println("eeeeeeeeeeeeeeeeeeeeeeee" + resultado.getString("total"));
                lista.add(new gasto_kilogramo(resultado.getString("total")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<gasto_insumos> getValor_insumos(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select ifnull(valor_insumos('" + num_lote + "'),0) as total";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new gasto_insumos(resultado.getString("total")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<gastos_mano_obra> getTotal_mano(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select suma_mano('" + num_lote + "') as total";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new gastos_mano_obra(resultado.getString("total")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<otros_gastos> getTotal_otros(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select ifnull(otrosgastos('" + num_lote + "'),0) as total";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new otros_gastos(resultado.getString("total")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Arriendo> getValor_arriendo(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select ifnull(sum(arriendo_lote),0) as total from lote where num_lote = '" + num_lote + "'";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new Arriendo(resultado.getString("total")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
      public ArrayList<asistencia> getValor_asistencia(String num_lote) {

        lista = new ArrayList<>();
        String sql = "select ifnull(asistencia('" + num_lote + "'),0) as total";
        try {
            resultado = Consultar(sql);
            while (resultado.next()) {
                lista.add(new asistencia(resultado.getString("total")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    
}
