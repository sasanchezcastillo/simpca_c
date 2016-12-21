/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */

package controlador_admin;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class registrosAdministrador extends Controladores.ConexionBD{
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion ;
    private String telefono;
    private String cedula;
    private String sexo;
    private String contrasena;
    private String tipo;
    private String clave;
    private Connection con;
    
    
    public registrosAdministrador() {
        
    }
   

    public registrosAdministrador(Connection con) {
        this.con = con;
    }

    public registrosAdministrador(String nombre, String apellido, String correo, String direccion, String telefono, String cedula, String sexo, String contrasena, String tipo ,String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cedula = cedula;
        this.sexo = sexo;
        this.contrasena = contrasena;
        this.tipo = tipo;
        this.clave= clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contraseña) {
        this.contrasena = contraseña;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public boolean RegistrarUsuario(String cedula, String nombre, String apellido, String contrasena,String sexo, String telefono,String correo,String direccion, String tipo ){
        PreparedStatement pst = null;
        try {
            String consulta = "insert into usuario (cedula,nombre,apellido,contraseña,sexo,telefono,correo,direccion,tipo) values (?,?,?,?,?,?,?,?,?)";
           
            pst = getConnection().prepareStatement(consulta);
            pst.setString(1,cedula );
            pst.setString(2,nombre );
            pst.setString(3, apellido);
            pst.setString(4, contrasena );
            pst.setString(5,sexo );
            pst.setString(6,telefono );
            pst.setString(7, correo);
            pst.setString(8, direccion);
            pst.setString(9, tipo);
            
            
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
    public boolean ReistrarAdministrador(String cedula, String nombre, String apellido, String contrasena,String sexo, String telefono,String correo,String direccion, String tipo){
        PreparedStatement pst = null;
        try {
            String consulta = "insert into usuario (cedula,nombre,apellido,contraseña,sexo,telefono,correo,direccion,tipo) values (?,?,?,?,?,?,?,?,?)";
           
            pst = getConnection().prepareStatement(consulta);
            pst.setString(1,cedula );
            pst.setString(2,nombre );
            pst.setString(3,apellido);
            pst.setString(4,contrasena );
            pst.setString(5,sexo );
            pst.setString(6,telefono );
            pst.setString(7,correo );
            pst.setString(8,direccion);
            pst.setString(9,tipo);
            
            
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
    
    /*listar lo lotes*/
     public boolean validarLote( String usuario_cedula){

        PreparedStatement pst = null;

            try {
                String consulta = "select num_lote from lote where usuario_cedula = ?";
                pst = getConnection().prepareStatement(consulta);
                pst.setString(1, usuario_cedula);
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
    /* public static void main(String[] args) {
        registrosAdministrador co = new  registrosAdministrador();
        co.validarLote("12321");
    }*/
     
     public registrosAdministrador buscar (String cedula){
         PreparedStatement pst = null;
         try {
             String sql = "select * from usuario where cedula = ?";
             pst = getConnection().prepareStatement(sql);
             pst.setString(1, cedula);
             ResultSet rs = pst.executeQuery();
             while(rs.next()){
                 registrosAdministrador admi = new registrosAdministrador();
                 admi.setCedula(rs.getString("cedula"));
                 admi.setNombre(rs.getString("nombre"));
                 admi.setApellido(rs.getString("apellido"));
                 admi.setContrasena(rs.getString("contraseña"));
                 admi.setSexo(rs.getString("sexo"));
                 admi.setTelefono(rs.getString("telefono"));
                 admi.setCorreo(rs.getString("correo"));
                 admi.setDireccion(rs.getString("direccion"));
                 admi.setTipo(rs.getString("tipo"));
                 
                 return admi;
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
         return null;
     }
     
    public boolean eliminar(String cedula){
        PreparedStatement pst = null;
        
        try {
            String sql = "delete from usuario where cedula = ?";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, cedula);
            if(pst.executeUpdate() >= 1){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
        return false;
        
    }
    
    }

