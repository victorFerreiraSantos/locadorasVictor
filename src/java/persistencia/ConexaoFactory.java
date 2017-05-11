/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class ConexaoFactory {
    
        
    //  Database credentials
    
    public static Connection getConexao() throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        
        String drive = "com.mysql.jdbc.Driver";
        String banco = "jdbc:mysql://localhost:3306/bd_locadora";
        String usuarioBD = "root";
        String senha = "123456";
        
        try { 
            Class.forName(drive);
            conn = DriverManager.getConnection(banco, usuarioBD, senha);
        } catch (SQLException | ClassNotFoundException e) { 
    		throw e; 
        } 
        return conn;
    }
    
}
