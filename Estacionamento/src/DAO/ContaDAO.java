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
import model.Conta;
import model.Patio;
import model.Veiculo;
/**
 *
 * @author jardel
 */
public class ContaDAO {
    private Connection conn = null;
    ArrayList<Patio> arrayclientes;

    public ContaDAO() {
        conn = Conexao.getConexao();
    }

    public String incluir(Conta cont) {

        String sql;
        PreparedStatement ps;

        sql = "INSERT INTO tbl_conta(cod_cliente, placa_veiculo, cod_patio, diarias, ano, mes, paga) VALUES (?,?,?,?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);

            ps.setInt(1, cont.getCliente().getCodigo());
            ps.setString(2, cont.getVeiculo().getPlaca());
            ps.setInt(3, cont.getPatio().getCodigo());
            ps.setInt(4, cont.getDiarias());
            ps.setInt(5, cont.getAno());
            ps.setInt(6, cont.getMes());
            ps.setBoolean(7, cont.getPaga());
            
            ps.execute();
            System.out.println("\n\nConta adicionada com sucesso!");
            ps.close();
            
            return "ok";

        } catch (Exception e) {
            System.out.println("Erro na operação SQL de incluir: " + e.getMessage() + e.getClass());
            String mensagem = "Erro na operação de incluir conta: "+e.getMessage();
            
            return mensagem;
        }
    }
    
    public String cadastrarConta(Conta cont) {

        String sql;
        PreparedStatement ps;

        sql = "INSERT INTO tbl_conta(cod_cliente, placa_veiculo, cod_patio, diarias, ano, mes, paga) VALUES (?,?,?,?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);

            ps.setInt(1, cont.getCliente().getCodigo());
            ps.setString(2, cont.getVeiculo().getPlaca());
            ps.setInt(3, cont.getPatio().getCodigo());
            ps.setInt(4, cont.getDiarias());
            ps.setInt(5, cont.getAno());
            ps.setInt(6, cont.getMes());
            ps.setBoolean(7, cont.getPaga());
            
            ps.execute();
            System.out.println("\n\nConta adicionada com sucesso!");
            ps.close();
            
            return "ok";

        } catch (Exception e) {
            System.out.println("Erro na operação SQL de cadastrar conta: " + e.getMessage() + e.getClass());
            String mensagem = "Erro na operação de cadastrar conta: "+e.getMessage();
            
            return mensagem;
        }
    }

}
