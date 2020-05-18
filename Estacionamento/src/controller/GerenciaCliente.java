/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ClienteDAO;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author jardel
 */
public class GerenciaCliente {
    ArrayList<Cliente> clientes = new ArrayList<>();
    ClienteDAO cliDao = new ClienteDAO();
    
    public String incluir(String nome, String logradouro, String numero, String bairro, String municipio, String estado, String cep, String telefone){
        
        Cliente c = new Cliente(nome, logradouro, numero, bairro, municipio, estado, cep, telefone);
        String mensagem = cliDao.incluir(c);
        if(mensagem.equals("ok")){
            return "ok";
        }else{
            return mensagem;
        }
        
    }
    
    public String editar(int codigo, String nome, String logradouro, String numero, String bairro, String municipio, String estado, String cep){
        Cliente c = new Cliente(codigo, nome, logradouro, numero, bairro, municipio, estado, cep, numero);
        String mensagem = cliDao.editar(c);
        
        if(mensagem.equals("ok")){
            return "ok";
        }else{
            return mensagem;
        }
    }
    
    public String excluir(int codigo){
        Cliente c = new Cliente(codigo);
        String mensagem = cliDao.excluir(c);
        
        if(mensagem.equals("ok")){
            return "ok";
        }else{
            return mensagem;
        }
    }
    
    public Cliente buscarPorCodigo(int codigo) {
        Cliente c = cliDao.buscarClientePorCodigo(codigo);

        return c;

    }
    
    
    // verificar se já existe o cliente na base de dados
    public boolean existeCliente(int codigo){
        
        return true;
    }
    
    public ArrayList<Cliente> listar(){
        clientes = null;
        clientes = cliDao.listar();
        
        return clientes;
    }
}
