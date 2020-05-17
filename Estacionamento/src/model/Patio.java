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
public class Patio {
    private int capacidadeDeVeiculos,
                lotacao,
                codigo;
    private float valorDaDiaria;
    private String nome,
                   logradouro,
                   numero,
                   bairro,
                   municipio,
                   estado,
                   cep;
    // sem a chave primária codigo
    public Patio(int capacidadeDeVeiculos, float valorDaDiaria, String nome, String logradouro, String numero, String bairro, String municipio, String estado, String cep) {
        this.capacidadeDeVeiculos = capacidadeDeVeiculos;
        this.valorDaDiaria = valorDaDiaria;
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.municipio = municipio;
        this.estado = estado;
        this.cep = cep;
        
    }
    // com a chave primária codigo
    public Patio(int codigo, int capacidadeDeVeiculos, float valorDaDiaria, String nome, String logradouro, String numero, String bairro, String municipio, String estado, String cep) {
        this.capacidadeDeVeiculos = capacidadeDeVeiculos;
        this.valorDaDiaria = valorDaDiaria;
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.municipio = municipio;
        this.estado = estado;
        this.cep = cep;
        this.codigo = codigo;
    }
    
    public Patio() {
    }
    

    public int getCapacidadeDeVeiculos() {
        return capacidadeDeVeiculos;
    }

    public void setCapacidadeDeVeiculos(int capacidadeDeVeiculos) {
        this.capacidadeDeVeiculos = capacidadeDeVeiculos;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValorDaDiaria() {
        return valorDaDiaria;
    }

    public void setValorDaDiaria(float valorDaDiaria) {
        this.valorDaDiaria = valorDaDiaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

        
    
    
}
