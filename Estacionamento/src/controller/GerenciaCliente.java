/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cliente;

/**
 *
 * @author jardel
 */
public class GerenciaCliente {
    
    public boolean incluir(String nome, String logradouro, String numero, String bairro, String municipio, String estado, String cep, String telefone){
        
        Cliente c = new Cliente(nome, logradouro, numero, bairro, municipio, estado, cep, telefone);
        
        return true;
    }
    
    public Object consultar(int codigo){
        
        return true;
    }
    
    public boolean excluir(int codigo){
        
        return true;
    }
    
    // verificar se já existe o cliente na base de dados
    public boolean existeCliente(int codigo){
        
        return true;
    }
}
