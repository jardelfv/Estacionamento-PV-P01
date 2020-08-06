/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jardel
 */
public class Carro extends Veiculo{
    private int numeroPortas;
    private int qtdPassageiros;

    public Carro(int numeroPortas, int qtdPassageiros, int anoModelo, int anoFabricacao, String marca, String modelo, String chassi, String placa) {
        super(anoModelo, anoFabricacao, marca, modelo, chassi, placa);
        this.numeroPortas = numeroPortas;
        this.qtdPassageiros = qtdPassageiros;
    }

    public Carro() {
    }
    

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    
    
}
