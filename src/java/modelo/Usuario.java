/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Usuario {

    //Atributos da classe
    private String perfil;
    private String nome;
    private String login;
    private String senha;
    private String status;

    //Construtor sem parametro
    public Usuario() {
    }

    //Construtor com todos os parametros, exceto "login"
    public Usuario(String perfil, String nome, String senha, String status) {
        this.perfil = perfil;
        this.nome = nome;
        this.senha = senha;
        this.status = status;
    }
    
    //Encapsulamento
    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
