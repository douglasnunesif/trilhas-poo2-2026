/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.usuario;

/**
 *
 * @author douglas
 */
public class Main {
    
    public static void main(String[] args){
        
        
        UsuarioDAO dao = new UsuarioDAO();
        
        //Cadastrando um usuário
        Usuario u1 = new Usuario("Euler","euler@email.com","1234");
        dao.cadastrar(u1);
        
        //Testando o Login
        boolean acesso = dao.login("euler@email.com","1234");
        
        
        if(acesso){
            System.out.println("Login Realizado com sucesso!!!");
        }
        else{
            System.out.println("Email e/ou senha inválido(s)!");
        }
        
        
        
    }
    
}
