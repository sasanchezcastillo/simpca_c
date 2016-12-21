/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Utilities.SendEmailUsingGMailSMTP;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

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
 * Clase restablecerPass, Contiene los metodos:
 * consultarCorreo
 * asignarClave
 * verificarClave
 * asignarNuevaContrasena
 */
public class restablecerPass extends ConexionBD {

    Statement s;
    ResultSet r;
    PreparedStatement p;
    /**
     * Metodo consultarCorreo: Permite consultar que el correo ingresado se encuentre en la base de datos
     * @param correo
     * @return boolean
     */
    public boolean consultarCorreo(String correo) {
        try {
            String consulta = "select correo from usuario where usuario.correo = ?";
            p = getConnection().prepareStatement(consulta);
            p.setString(1, correo);

            r = p.executeQuery();

            while (r.next()) {
                   return true;
            }
            
        } catch (Exception e) {
            System.err.print("ERROR" + e);
        } finally {
            try {
                if (p != null) {
                    p.close();
                }
                if (r != null) {
                    r.close();
                }

            } catch (Exception e) {
                System.err.print("ERROR" + e);
            }
        }
        return false;
    }
    
    /**
     * Metodo asignarClave: Permite asignar la clave al correo correspondiente para cambiar la contraseña
     * @param clave
     * @param correo
     * @return boolean
     */
    public boolean asignarClave(String clave, String correo) {

        String con = "update usuario set clave='" + clave + "' where usuario.correo='" + correo + "'";

        try {
            s = getConnection().createStatement();
            int registrosAfectados = s.executeUpdate(con);

            System.out.println(registrosAfectados);
            return true;

        } catch (SQLException sql) {
            sql.printStackTrace();
            System.out.println("Error en la Base de Datos");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en la conexion");
        }
        return false;
    }
    
    /**
     * Metodo verificarClave: Permite asignar la clave al correo correspondiente para cambiar la contraseña
     * @param clave
     * @param correo
     * @return boolean
     */
    public boolean verificarClave(String clave, String correo) {
        String consulta = "select clave from usuario where usuario.clave = ? and usuario.correo = ?";
        try {
            
            p = getConnection().prepareStatement(consulta);
            p.setString(1, clave);
            p.setString(2, correo);

            r = p.executeQuery();

            while (r.next()) {
                   return true;
            }
            
        } catch (SQLException sql) {
            sql.printStackTrace();
            System.out.println("Error en la Base de Datos");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en la conexion");
        }
        return false;
    }
    
    /**
     * Metodo asignarNuevaContrasena: Permite asignar la nueva contraseña al usuario registrado en la base de datos
     * @param correo
     * @param password
     * @param confirmar
     * @return boolean
     */
    public boolean asignarNuevaContrasena(String correo,String password, String confirmar) {

        if (password.equals(confirmar)) {
            try {
                String consulta = "update usuario set contraseña='" + password + "' where usuario.correo='"+correo+"'";
                s = getConnection().createStatement();
                int registrosAfectados = s.executeUpdate(consulta);

                System.out.println(registrosAfectados);
                return true;

            } catch (SQLException sql) {
                sql.printStackTrace();
                System.out.println("Error en la Base de Datos");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error en la conexion");
            }   
    } 
        return false;
    }
}
