/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Patio;

/**
 *
 * @author jardel
 */
public class PatioDAO {
    private Connection conn = null;
    ArrayList<Patio> arrayPatios = new ArrayList<>();
    
    public PatioDAO(ArrayList<Patio> arrayPatios) {
        conn = Conexao.getConexao();
        this.arrayPatios = arrayPatios;
    }
    
    public PatioDAO() {
        conn = Conexao.getConexao();
    }
    
    public String incluir(Patio p) {

        String sql;
        PreparedStatement ps = null;

        sql = "INSERT INTO tbl_patio(nome, logradouro, numero, bairro, municipio, estado, cep, capacidade_veiculos, valordiariacarro, valordiariacaminhao, lotacao) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);

            ps.setString(1, p.getNome());
            ps.setString(2, p.getLogradouro());
            ps.setString(3, p.getNumero());
            ps.setString(4, p.getBairro());
            ps.setString(5, p.getMunicipio());
            ps.setString(6, p.getEstado());
            ps.setString(7, p.getCep());
            ps.setInt(8, p.getCapacidadeDeVeiculos());
            ps.setFloat(9, p.getValorDaDiariaCarro());
            ps.setFloat(10, p.getValorDaDiariaCaminhao());
            ps.setInt(11, p.getLotacao());
            

            ps.executeUpdate();
            ps.close();
            return "ok";

        } catch (Exception e) {
            System.out.println("Erro na operação de incluir pátio: " + e.getMessage());
            String mensagem = "Erro na operação de incluir pátio: " + e.getMessage();
            return mensagem;
        }

    }
    
    public String editar(Patio p) {
        String sql;
        PreparedStatement ps = null;

        sql = "UPDATE tbl_patio SET nome = ?, logradouro = ?, numero = ?, bairro = ?, municipio = ?, estado = ?, cep = ?, capacidade_veiculos = ?, valordiariacarro = ?, valordiariacaminhao = ?, lotacao = ? WHERE codigo = ?";

        try {
            ps = conn.prepareStatement(sql);

            ps.setString(1, p.getNome());
            ps.setString(2, p.getLogradouro());
            ps.setString(3, p.getNumero());
            ps.setString(4, p.getBairro());
            ps.setString(5, p.getMunicipio());
            ps.setString(6, p.getEstado());
            ps.setString(7, p.getCep());
            ps.setInt(8, p.getCapacidadeDeVeiculos());
            ps.setFloat(9, p.getValorDaDiariaCarro());
            ps.setFloat(10, p.getValorDaDiariaCaminhao());
            ps.setInt(11, p.getLotacao());
            ps.setInt(12, p.getCodigo());

            int resultado = ps.executeUpdate();
            System.out.println("resultado desta query: "+resultado);
            System.out.println("\nOK, alterado com sucesso!");
            ps.close();
            return "ok";
            
        } catch (Exception e) {
            System.out.println("Erro na operação de editar pátio: " + e.getMessage());
            String mensagem = "Erro na operação de editar pátio: " + e.getMessage();
            return mensagem;
        }

    }
    
    public String excluir(Patio pat) {
        String sql;
        PreparedStatement ps = null;

        sql = "delete from tbl_patio where codigo = ?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, pat.getCodigo());
            
            ps.execute();
            
            System.out.println("\nOk, excluído com sucesso!");
            ps.close();
            return "ok";
            
        } catch (Exception e) {
            System.out.println("Erro na operação de deletar pátio: " + e.getMessage());
            String mensagem = "Erro na operação de deletar pátio: " + e.getMessage();
            return mensagem;
        }
    }
    
    public ArrayList<Patio> listar() {
        ArrayList<Patio> patios = new ArrayList<>();

        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT codigo, nome, logradouro, numero, bairro, municipio, estado, cep, capacidade_veiculos, valordiariacarro, valordiariacaminhao, lotacao FROM tbl_patio";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Patio pat = new Patio();

                pat.setCodigo(rs.getInt("codigo"));
                pat.setNome(rs.getString("nome"));
                pat.setLogradouro(rs.getString("logradouro"));
                pat.setNumero(rs.getString("numero"));
                pat.setBairro(rs.getString("bairro"));
                pat.setMunicipio(rs.getString("municipio"));
                pat.setEstado(rs.getString("estado"));
                pat.setCep(rs.getString("cep"));
                pat.setCapacidadeDeVeiculos(rs.getInt("capacidade_veiculos"));
                pat.setValorDaDiariaCarro(rs.getFloat("valordiariacarro"));
                pat.setValorDaDiariaCaminhao(rs.getFloat("valordiariacaminhao"));
                pat.setLotacao(rs.getInt("lotacao"));
                

                patios.add(pat);

            }
            rs.close();
            ps.close();
            
        } catch (Exception e) {
            System.err.println("Erro na operação de listar pátios: " + e.getMessage());
        }

        return patios;
    }
    
    public Patio buscarPorCodigo(int codigo) {
        int compara = 0;
        ArrayList<Patio> listPatios = new ArrayList<>();
        listPatios = listar();

        Patio pat = null;
        if (listPatios.size() != 0) {
            for (int i = 0; i < listPatios.size(); i++) {
                if (listPatios.get(i).getCodigo() == codigo) {
                    compara = listPatios.get(i).getCodigo();

                    pat = listPatios.get(i);
                    break;
                }
            }

            return pat;

        } else {

            return null;

        }
    }
    
}
