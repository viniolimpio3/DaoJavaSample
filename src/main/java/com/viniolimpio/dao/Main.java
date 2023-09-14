/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.viniolimpio.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author 081210022
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Connection connection = Conexao.getInstance().getConnection();
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from empresa.funcionario");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("nome") + " " + resultSet.getString("ID_FUNCIONARIO"));
        }
        if (connection != null && connection.isClosed()) {
            connection.close();
        }

    }
}
