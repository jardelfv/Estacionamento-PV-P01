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
    
    public ArrayList<Conta> listar() {
        ArrayList<Conta> contas = new ArrayList<>();

        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT codigo, cod_cliente, placa_veiculo, cod_patio, diarias, ano, mes, paga FROM tbl_conta";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            VeiculoDAO veicD = new VeiculoDAO();
            ClienteDAO cliD = new ClienteDAO();
            PatioDAO patD = new PatioDAO();

            while (rs.next()) {
                
                Cliente c = cliD.buscarClientePorCodigo(rs.getInt("cod_cliente"));
		Veiculo v = veicD.buscarVeiculoPorPlaca(rs.getString("placa_veiculo"));
                Patio p = patD.buscarPorCodigo(rs.getInt("cod_patio"));
                
                Conta cont = new Conta();
                
                cont.setCodigo(rs.getInt("codigo"));
                cont.setCliente(c);
                cont.setVeiculo(v);
                cont.setPatio(p);
                
                cont.setDiarias(rs.getInt("diarias"));
                System.out.println("passou diarias");
                cont.setAno(rs.getInt("ano"));
                cont.setMes(rs.getInt("mes"));
                cont.setPaga(rs.getBoolean("paga"));

                contas.add(cont);

            }
            rs.close();
            ps.close();
            
        } catch (Exception e) {
            System.err.println("Erro na operação de listar conta: " + e.getMessage());
            System.err.println("Como aconteceu: " + e.getMessage() + e.getCause());
        }

        return contas;
    }
    public ArrayList<Conta> listar2() {
        ArrayList<Conta> contas = new ArrayList<>();

        PreparedStatement ps = null;
        ResultSet rs = null;
        
        
        String sql = "SELECT * FROM tbl_conta co, tbl_cliente ci WHERE co.cod_cliente = ci.codigo";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                
                Conta cont = new Conta();
                
                cont.setCodigo(rs.getInt("codigo"));
                cont.getCliente().setCodigo(rs.getInt("cod_cliente"));
                cont.getCliente().setNome("nome");
                cont.getVeiculo().setPlaca(rs.getString("placa_veiculo"));
                cont.getPatio().setCodigo(rs.getInt("cod_patio"));
                
                cont.setDiarias(rs.getInt("diarias"));
                cont.setAno(rs.getInt("ano"));
                cont.setMes(rs.getInt("mes"));
                cont.setPaga(rs.getBoolean("paga"));

                contas.add(cont);

            }
            rs.close();
            ps.close();
            
        } catch (Exception e) {
            System.err.println("Erro na operação de listar conta: " + e.getMessage());
            System.err.println("Como aconteceu: " + e.getMessage() + e.getCause() + e.getClass()+e.toString());
        }

        return contas;
    }
    
    public Conta buscarContaPorCodigo(int codConta) {
        int compara = 0;
        ArrayList<Conta> listContas = new ArrayList<>();
        listContas = null;
        listContas = listar();

        Conta cont = null;
        if (listContas.size() != 0) {
            for (int i = 0; i < listContas.size(); i++) {
                if (listContas.get(i).getCodigo() == codConta) {
                    compara = listContas.get(i).getCodigo();

                    cont = listContas.get(i);
                    break;
                }
            }

            if (compara == codConta) {
                return cont;

            } else {

                return null;
            }
        } else {

            return null;

        }
    }

}
