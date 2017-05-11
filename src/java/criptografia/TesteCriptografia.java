/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criptografia;

import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Administrador
 */
public class TesteCriptografia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variável com a senha normal do usuário
        String senha = "123456";
        
        //Chamando o método sha512Hex para criptografar a senha
        String senhaCriptografada = DigestUtils.sha512Hex(senha);
        
        //Mostra a senha criptografada
        System.out.println("Senha criptografada: " + senhaCriptografada);
        
    }
    
}
