/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ClienteDAO;
import DAO.ContaDAO;
import DAO.PatioDAO;
import DAO.VeiculoDAO;
import java.util.ArrayList;
import model.Cliente;
import model.Conta;
import model.Patio;
import model.Veiculo;

/**
 *
 * @author jardel
 */
public class GerenciaConta {
    ArrayList<Conta> contas = new ArrayList<>();
    ArrayList<Patio> patios;
    ArrayList<Veiculo> arrayVeiculos;
    ArrayList<Cliente> arrayclientes;
    
    ContaDAO contaDAO = new ContaDAO();
    VeiculoDAO veicDAO = new VeiculoDAO();
    ClienteDAO cliDao = new ClienteDAO();
    PatioDAO patioDao = new PatioDAO();
    
    public String incluir(int codCliente, String placa, int codPatio, int diarias, int ano, int mes, boolean paga){
        
        Conta cont = new Conta(new Veiculo(placa), new Cliente(codCliente), new Patio(codPatio), diarias, ano, mes, codPatio, paga);
        String mensagem = contaDAO.incluirDiarias(cont);
        if(mensagem.equals("ok")){
            return "ok";
        }else{
            return mensagem;
        }
        
    }
    
    public String cadastrarConta(int codCliente, String placa, int codPatio){
        
        Conta cont = new Conta(new Veiculo(placa), new Cliente(codCliente), new Patio(codPatio), 0, 0, 0, codPatio, false);
        String mensagem = contaDAO.cadastrarConta(cont);
        if(mensagem.equals("ok")){
            return "ok";
        }else{
            return mensagem;
        }
        
    }
    
    public String incluirDiaria(int codigoConta, int diarias){
        Conta c = new Conta();
        c = buscarPorCodigo(codigoConta);
        int quantidadeDeDiarias = c.getDiarias();
        quantidadeDeDiarias += diarias;
        c.setDiarias(quantidadeDeDiarias);
        String mensagem = contaDAO.incluirDiarias(c);
        if(mensagem.equals("ok")){
            return "ok";
        }else{
            return mensagem;
        }
    }
    
    public Conta buscarPorCodigo(int codigo) {
        Conta c = contaDAO.buscarContaPorCodigo(codigo);

        return c;

    }
    
    public ArrayList<Conta> listar(){
        contas = null;
        contas = contaDAO.listar();
        
        return contas;
    }
    
}
