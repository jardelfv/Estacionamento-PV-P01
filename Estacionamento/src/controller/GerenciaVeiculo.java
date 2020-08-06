/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.VeiculoDAO;
import java.util.ArrayList;
import model.Caminhao;
import model.Carro;
import model.Cliente;
import model.Motocicleta;
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
    
    public String incluirCarro(int anoModelo, int anoFabricacao, String marca, String modelo, String chassi, String placa, int numeroPortas, int qtdPassageiros){
        
        Carro c = new Carro(numeroPortas, qtdPassageiros, anoModelo, anoFabricacao, marca, modelo, chassi, placa);
        String mensagem = veicDAO.incluirCarro(c);
        if(mensagem.equals("ok")){
            return "ok";
        }else{
            return mensagem;
        }
        
    }
    
    public String incluirCaminhao(int anoModelo, int anoFabricacao, String marca, String modelo, String chassi, String placa, int numeroDeEixos, float capacidadeDeCarga){
        
        Caminhao c = new Caminhao(numeroDeEixos, capacidadeDeCarga, anoModelo, anoFabricacao, marca, modelo, chassi, placa);
        String mensagem = veicDAO.incluirCaminhao(c);
        if(mensagem.equals("ok")){
            return "ok";
        }else{
            return mensagem;
        }
        
    }
    
    public String incluirMotocicleta(int anoModelo, int anoFabricacao, String marca, String modelo, String chassi, String placa, int cilindradas, int qtdRodas){
        
        Motocicleta m = new Motocicleta(cilindradas, qtdRodas, anoModelo, anoFabricacao, marca, modelo, chassi, placa);
        String mensagem = veicDAO.incluirMotocicleta(m);
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
    
    public String excluir(String placa){
        Veiculo v = new Veiculo(placa);
        String mensagem = veicDAO.excluir(v);
        
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
    
    public Veiculo buscarPorPlaca(String placa) {
        Veiculo v = veicDAO.buscarVeiculoPorPlaca(placa);

        return v;

    }
    
}
