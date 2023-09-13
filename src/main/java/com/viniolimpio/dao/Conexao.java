/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viniolimpio.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author 081210022
 */
public class Conexao {
    private static Conexao connection = null;
    private ResourceBundle bundle = ResourceBundle.getBundle("dao", new Locale("pt", "BR"));
    private Conexao(){
        
    }
    
    public static Conexao getInstance(){
        if(Conexao.connection == null){
            Conexao.connection = new Conexao();
        }
        return Conexao.connection;
    }
    
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(bundle.getString("driver"));
        return DriverManager.getConnection(bundle.getString("url"), bundle.getString("usuario"), bundle.getString("senha"));
    }    
}