/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.projetopoo;

/**
 *
 * @author douglas
 */
public class Cliente {
    //Definição de atribuitos da classe
    private String nome;
    private int idade;
    private String cpf;
    
    //Definir o(s) meu(s) construtores
    public Cliente(){
        
    }
    
    public Cliente(String n, int i, String cpf){
        this.nome = n;
        this.idade = i;
        this.cpf = cpf;
    }
    
    //Métodos get & set
    
    
    //Métodos funcionais
    public void imprimeDadosCliente(){
        System.out.println("Nome.: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF..: " + this.cpf);
    }
    
    
}
