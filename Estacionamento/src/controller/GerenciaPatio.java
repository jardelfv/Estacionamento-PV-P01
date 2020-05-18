/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ClienteDAO;
import DAO.PatioDAO;
import java.util.ArrayList;
import model.Patio;

/**
 *
 * @author jardel
 */
public class GerenciaPatio {
    ArrayList<Patio> patios = new ArrayList<>();
    PatioDAO patioDao = new PatioDAO();
    
    public String incluir(int capacidadeDeVeiculos, float valorDaDiaria, String nome, String logradouro, String numero, String bairro, String municipio, String estado, String cep){
        
        Patio p = new Patio(capacidadeDeVeiculos, valorDaDiaria, nome, logradouro, numero, bairro, municipio, estado, cep);
        String mensagem = patioDao.incluir(p);
        if(mensagem.equals("ok")){
            return "ok";
        }else{
            return mensagem;
        }
        
    }
    
    public String editar(int codigo, int capacidadeDeVeiculos, float valorDaDiaria, String nome, String logradouro, String numero, String bairro, String municipio, String estado, String cep){
        Patio p = new Patio(codigo, capacidadeDeVeiculos, valorDaDiaria, nome, logradouro, numero, bairro, municipio, estado, cep);
        String mensagem = patioDao.editar(p);
        
        if(mensagem.equals("ok")){
            return "ok";
        }else{
            return mensagem;
        }
    }
    
    public String excluir(int codigo){
        Patio c = new Patio(codigo);
        String mensagem = patioDao.excluir(c);
        
        if(mensagem.equals("ok")){
            return "ok";
        }else{
            return mensagem;
        }
    }
    
    public ArrayList<Patio> listar(){
        patios = null;
        patios = patioDao.listar();
        
        return patios;
    }
    
    public Patio buscarPorCodigo(int codigo) {
        Patio p = patioDao.buscarPorCodigo(codigo);

        return p;

    }
}
