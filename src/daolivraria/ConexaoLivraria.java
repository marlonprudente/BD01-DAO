/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daolivraria;

/**
 *
 * @author Marlon Prudente <marlonmateuspr@gmail.com>
 */
import java.sql.*;

public class ConexaoLivraria {
    
    public static Connection getConnectionLivraria() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://200.134.10.33/livraria1562339";
            String usuario = "banco120132";
            String senha = "$$dafuq";
            Connection con = DriverManager.getConnection(url, usuario, senha);

            return con;
            
        } catch (Exception e1) {
            return null;
        }
        
    }
    
}
