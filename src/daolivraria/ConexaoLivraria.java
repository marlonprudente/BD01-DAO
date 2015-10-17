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
            String url = "jdbc:mysql://100.43.1.160/livraria";
            String usuario = "root";
            String senha = "mpo121991";
            Connection con = DriverManager.getConnection(url, usuario, senha);

            return con;
            
        } catch (Exception e1) {
            return null;
        }
        
    }
    
}
