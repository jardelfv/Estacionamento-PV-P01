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
public class Caminhao extends Veiculo{
    private int numeroDeEixos,
                capacidadeDeCarga;

    public Caminhao(int numeroDeEixos, int capacidadeDeCarga, int anoModelo, int anoFabricacao, String marca, String modelo, String chassi, String placa) {
        super(anoModelo, anoFabricacao, marca, modelo, chassi, placa);
        this.numeroDeEixos = numeroDeEixos;
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public int getNumeroDeEixos() {
        return numeroDeEixos;
    }

    public void setNumeroDeEixos(int numeroDeEixos) {
        this.numeroDeEixos = numeroDeEixos;
    }

    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }
    
}
