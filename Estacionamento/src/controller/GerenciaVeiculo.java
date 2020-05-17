/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.VeiculoDAO;
import java.util.ArrayList;
import model.Cliente;
import model.Veiculo;

/**
 *
 * @author jardel
 */
public class GerenciaVeiculo {
    ArrayList<Veiculo> arrayVeiculos = new ArrayList<>();
    VeiculoDAO veicDAO = new VeiculoDAO();

    public GerenciaVeiculo() {
    }
    
    public String incluir(int anoModelo, int anoFabricacao, String marca, String modelo, String chassi, String placa){
        
        Veiculo v = new Veiculo(anoModelo, anoFabricacao, marca, modelo, chassi, placa);
        String mensagem = veicDAO.incluir(v);
        if(mensagem.equals("ok")){
            return "ok";
        }else{
            return mensagem;
        }
        
    }
    
    public String editar(int anoModelo, int anoFabricacao, String marca, String modelo, String chassi, String placa){
        Veiculo v = new Veiculo(anoModelo, anoFabricacao, marca, modelo, chassi, placa);
        String mensagem = veicDAO.editar(v);
        
        if(mensagem.equals("ok")){
            return "ok";
        }else{
            return mensagem;
        }
    }
    
    public ArrayList<Veiculo> listar(){
        arrayVeiculos = null;
        arrayVeiculos = veicDAO.listar();
        
        return arrayVeiculos;
    }
    
}
