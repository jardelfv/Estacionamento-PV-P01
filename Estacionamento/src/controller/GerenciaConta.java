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
    
    public String cadastrarConta(int codCliente, String placa, int codPatio, int ano, int mes, int lotacao){
        
        Conta cont = new Conta(new Veiculo(placa), new Cliente(codCliente), new Patio(codPatio), 0, ano, mes, codPatio, false);
        String mensagem = contaDAO.cadastrarConta(cont, codPatio, lotacao);
        
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
    
    public String alterarConta(int codigoConta, int codigoCliente, int codigoVeiculo,int codigoPatio, String placa, int diarias, int mes, int ano){
        
        Conta cont = new Conta(new Veiculo(placa), new Cliente(codigoCliente), new Patio(codigoPatio), diarias, ano, mes, codigoConta, true);
        String mensagem = contaDAO.alterarConta(cont);
        if(mensagem.equals("ok")){
            return "ok";
        }else{
            return mensagem;
        }
        
    }
    
    public String excluirConta(int codigoConta){
        Conta c = new Conta();
        c = buscarPorCodigo(codigoConta);
        
        String mensagem = contaDAO.excluirConta(c);
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
