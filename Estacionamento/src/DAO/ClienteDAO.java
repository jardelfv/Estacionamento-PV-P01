/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author jardel
 */
public class ClienteDAO {

    private Connection conn = null;
    ArrayList<Cliente> arrayclientes;

    public ClienteDAO(ArrayList<Cliente> arrayclientes) {
        conn = Conexao.getConexao();
        this.arrayclientes = arrayclientes;
    }

    public ClienteDAO() {
        conn = Conexao.getConexao();
    }

    public String incluir(Cliente c) {
        String sql;
        PreparedStatement ps = null;

        //sql = "INSERT INTO tbl_cliente(nome, endereco, telefone, cpf, dataNascimento) VALUES (?, ?, ?,?,?)";
        sql = "INSERT INTO tbl_cliente(nome, logradouro, numero, bairro, municipio, estado, cep, telefone) VALUES (?,?,?,?,?,?,?,?)";

        try {

            ps = conn.prepareStatement(sql);

            /*
            
             */
            ps.setString(1, c.getNome());
            ps.setString(2, c.getLogradouro());
            ps.setString(3, c.getNumero());
            ps.setString(4, c.getBairro());
            ps.setString(5, c.getMunicipio());
            ps.setString(6, c.getEstado());
            ps.setString(7, c.getCep());
            ps.setString(8, c.getTelefone());

            ps.executeUpdate();

            System.out.println("\nCadastrado com sucesso!");
            ps.close();
            return "ok";

        } catch (Exception e) {
            System.out.println("Erro na operação de incluir cliente: " + e.getMessage());
            String mensagem = "Erro na operação de incluir cliente: "+e.getMessage();
            return mensagem;
        }
    }
}
