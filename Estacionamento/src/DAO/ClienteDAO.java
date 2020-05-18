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
    
    public String editar(Cliente c) {
        String sql;
        PreparedStatement ps = null;

        sql = "UPDATE tbl_cliente SET nome = ?, logradouro = ?, numero = ?, bairro = ?, municipio = ?, estado = ?, cep = ?, telefone = ? WHERE codigo = ?";

        try {
            ps = conn.prepareStatement(sql);

            ps.setString(1, c.getNome());
            ps.setString(2, c.getLogradouro());
            ps.setString(3, c.getNumero());
            ps.setString(4, c.getBairro());
            ps.setString(5, c.getMunicipio());
            ps.setString(6, c.getEstado());
            ps.setString(7, c.getCep());
            ps.setString(8, c.getTelefone());
            ps.setInt(9, c.getCodigo());

            int resultado = ps.executeUpdate();
            System.out.println("resultado desta query: "+resultado);
            System.out.println("\nOK, alterado com sucesso!");
            ps.close();
            return "ok";
            
        } catch (Exception e) {
            System.out.println("Erro na operação de editar cliente: " + e.getMessage());
            String mensagem = "Erro na operação de editar cliente: " + e.getMessage();
            return mensagem;
        }

    }
    
    public String excluir(Cliente cli) {
        String sql;
        PreparedStatement ps = null;

        sql = "delete from tbl_cliente where codigo = ?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cli.getCodigo());
            
            ps.execute();
            
            System.out.println("\nOk, excluído com sucesso!");
            ps.close();
            return "ok";
            
        } catch (Exception e) {
            System.out.println("Erro na operação de deletar cliente: " + e.getMessage());
            String mensagem = "Erro na operação de deletar cliente: " + e.getMessage();
            return mensagem;
        }
    }
    
    public ArrayList<Cliente> listar() {
        ArrayList<Cliente> clientes = new ArrayList<>();

        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT codigo, nome, logradouro, numero, bairro, municipio, estado, cep, telefone FROM tbl_cliente";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Cliente cli = new Cliente();

                cli.setCodigo(rs.getInt("codigo"));
                cli.setNome(rs.getString("nome"));
                cli.setLogradouro(rs.getString("logradouro"));
                cli.setNumero(rs.getString("numero"));
                cli.setBairro(rs.getString("bairro"));
                cli.setMunicipio(rs.getString("municipio"));
                cli.setEstado(rs.getString("estado"));
                cli.setCep(rs.getString("cep"));
                cli.setTelefone(rs.getString("telefone"));
                

                clientes.add(cli);

            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            System.err.println("Erro na operação de listar cliente: " + e.getMessage());
        }

        return clientes;
    }
    
    public Cliente buscarClientePorCodigo(int codCliente) {
        int compara = 0;
        ArrayList<Cliente> listClientes = new ArrayList<>();
        listClientes = null;
        listClientes = listar();

        Cliente cli = null;
        if (listClientes.size() != 0) {
            for (int i = 0; i < listClientes.size(); i++) {
                if (listClientes.get(i).getCodigo() == codCliente) {
                    compara = listClientes.get(i).getCodigo();

                    cli = listClientes.get(i);
                    break;
                }
            }

            if (compara == codCliente) {
                return cli;

            } else {

                return null;
            }
        } else {

            return null;

        }
    }

}
