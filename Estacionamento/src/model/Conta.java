/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jardel
 */
public class Conta {
    private Veiculo veiculo;
    private Cliente cliente;
    private Patio patio;
    private int diarias,
                ano,
                mes,
                codigo;
    private boolean paga;

    public Conta(Veiculo veiculo, Cliente cliente, Patio patio, int diarias, int ano, int mes, int codigo, boolean paga) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.patio = patio;
        this.diarias = diarias;
        this.ano = ano;
        this.mes = mes;
        this.codigo = codigo;
        this.paga = paga;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Patio getPatio() {
        return patio;
    }

    public void setPatio(Patio patio) {
        this.patio = patio;
    }

    public int getDiarias() {
        return diarias;
    }

    public void setDiarias(int diarias) {
        this.diarias = diarias;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }
    
    
}
