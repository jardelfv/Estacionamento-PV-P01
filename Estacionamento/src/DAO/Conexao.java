/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author Jardel
 */
public class Conexao {

    public static Connection getConexao() {
        try {
            Class.forName("org.postgresql.Driver");

            Properties prop = new Properties();
            prop.put("user", "iftm");
            prop.put("password", "iftm@123321");
            prop.put("charset", "UTF-8");
            //prop.put("lc_ctype", "ISO8859_1");
            
            return DriverManager.getConnection("jdbc:postgresql://192.168.1.5/bd_estacionamento", prop);
            //return DriverManager.getConnection("jdbc:postgresql://35.247.205.11/bd_estacionamento", prop);
            //"jdbc:postgresql://localhost:5432/DB_locacao", prop);
            //"jdbc:postgresql://locacao.postgres.uhserver.com/locacao"
            
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }

        return null;
    }
}
