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
        String mensagem = contaDAO.incluir(cont);
        if(mensagem.equals("ok")){
            return "ok";
        }else{
            return mensagem;
        }
        
    }
    
}