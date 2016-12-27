/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author LENOVO
 */

public class ConexionBD {
    
   private String USERNAME = "root";
    private String PASSWORD = "9510";
    private String HOST = "localhost";
    private String PORT = "3306";
    private String DATABASE = "simpca";
    private String CLASSNAME = "com.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    private java.sql.Connection con;
    protected Statement stmt;
    
    public ConexionBD(){
        try {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            stmt=con.createStatement();
        } catch (ClassNotFoundException e) {
            System.err.println("ERROR"+e);
        }catch (SQLException e){
            System.err.println("Error"+e);
        }
    }
    
     public Connection ConexionBD2(){
        try {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            stmt=con.createStatement();
        } catch (ClassNotFoundException e) {
            System.err.println("ERROR"+e);
        }catch (SQLException e){
            System.err.println("Error"+e);
        }
        return con;
    }
    public java.sql.Connection getConnection(){
        return con;
    }
    
    public static void main(String[] args) {
        ConexionBD con = new ConexionBD();
    }
    
}
