/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.projetopoo;

/**
 *
 * @author douglas
 */
public class Principal {
    
    public static void main(String[] args){
        System.out.println("Testando objetos da classe cliente");
        //Usando a classe Cliente
       
        Cliente c1 = new Cliente("Davi", 19, "123456789");
        c1.imprimeDadosCliente();
        
    }
}
