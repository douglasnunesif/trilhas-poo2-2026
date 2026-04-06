/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.cliente;

/**
 *
 * @author douglas
 */
public class Principal {
    
    public static void main(String[] args){
        System.out.println("Testando objetos da classe cliente");
        //Usando a classe Cliente
       
        //Cria o primeiro cliente
        Cliente c1 = new Cliente("Davi","123456789", 19);
        c1.imprimeDadosCliente();
        Cliente c2 = new Cliente("João","987654321",43);
        c2.imprimeDadosCliente();
        Cliente c3 = new Cliente("Manoel", "11223344",33);
        c3.imprimeDadosCliente();
        
        Cliente c4 = new Cliente();
        c4.setNome("Amaral");
        c4.setCPF("9999999999");
        c4.setIdade(88);
        c4.imprimeDadosCliente();
        
        //Imprimir somente o nome de um cliente
        //Usando métodos Get
        String nome = c4.getNome();
        System.out.println("Nome obtido pelo get: " + nome);
        
        
    }
}
