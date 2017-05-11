/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import modelo.Usuario;

/**
 *
 * @author Administrador
 */
public class UsuarioDAO {
    
            public static void inserir(Usuario u) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConexaoFactory.getConexao();
        
        // Comando SQL 
        SQL = "INSERT INTO usuarios (login, nome, senha, perfil, status) " +
                                     "VALUES (?, ?, ?, ?, ?)";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, u.getLogin());
        preparedStatement.setString(2, u.getNome());      
        preparedStatement.setString(3, u.getSenha());      
        preparedStatement.setString(4, u.getPerfil());      
        preparedStatement.setString(5, u.getStatus());      
         
        //Executa no BD
        preparedStatement.executeUpdate();  

        // Fechar conexão
        conn.close();
        
    }
            
           public static boolean buscar(String l, String s) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        
        // Obtem conexao com BD
        conn = ConexaoFactory.getConexao();
        
        // Comando SQL 
        SQL = "SELECT * FROM usuarios " +
                " WHERE login = ? AND senha = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, l);
        preparedStatement.setString(2, s);
                
        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        if (rs.next()) {
             // Fechar conexão
             conn.close();
             
            return true;
            
            
        }else{
            
             // Fechar conexão
             conn.close();
             
        }
            return false;
        } 
        
       
    
}
