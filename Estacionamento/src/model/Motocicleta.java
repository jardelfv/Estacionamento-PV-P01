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
public class Motocicleta extends Veiculo{
    private int cilindradas;
    private int qtdRodas;

    public Motocicleta(int cilindradas, int qtdRodas, int anoModelo, int anoFabricacao, String marca, String modelo, String chassi, String placa) {
        super(anoModelo, anoFabricacao, marca, modelo, chassi, placa);
        this.cilindradas = cilindradas;
        this.qtdRodas = qtdRodas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }
    
    
}
