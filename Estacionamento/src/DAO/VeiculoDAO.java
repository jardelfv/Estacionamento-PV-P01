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
import model.Veiculo;

/**
 *
 * @author jardel
 */
public class VeiculoDAO {
    private Connection conn = null;
    ArrayList<Veiculo> arrayVeiculos = new ArrayList<>();

    public VeiculoDAO(ArrayList<Veiculo> arrayVeiculos) {
        conn = Conexao.getConexao();
        this.arrayVeiculos = arrayVeiculos;
    }

    public VeiculoDAO() {
        conn = Conexao.getConexao();
    }

    public String incluir(Veiculo car) {

        String sql;
        PreparedStatement ps = null;

        sql = "INSERT INTO tbl_veiculo(marca,modelo,ano_fabricacao,ano_modelo,placa,chassi) VALUES (?,?,?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);

            ps.setString(1, car.getMarca());
            ps.setString(2, car.getModelo());
            ps.setInt(3, car.getAnoFabricacao());
            ps.setInt(4, car.getAnoModelo());
            ps.setString(5, car.getPlaca());
            ps.setString(6, car.getChassi());
            

            ps.executeUpdate();
            ps.close();
            return "ok";

        } catch (Exception e) {
            System.out.println("Erro na operação de incluir veículo: " + e.getMessage());
            String mensagem = "Erro na operação de incluir veículo: " + e.getMessage();
            return mensagem;
        }

    }

    public String editar(Veiculo car) {
        String sql;
        PreparedStatement ps = null;

        sql = "UPDATE tbl_veiculo SET marca = ?, modelo = ?, ano_fabricacao = ?, ano_modelo = ? WHERE placa = ?";

        try {
            ps = conn.prepareStatement(sql);

            ps.setString(1, car.getMarca());
            ps.setString(2, car.getModelo());
            ps.setInt(3, car.getAnoFabricacao());
            ps.setInt(4, car.getAnoModelo());
            //ps.setInt(5, car.getCodigo());
            ps.setString(5, car.getPlaca());

            int resultado = ps.executeUpdate();
            System.out.println("resultado desta query: "+resultado);
            System.out.println("\nOK, alterado com sucesso!");
            ps.close();
            return "ok";
            
        } catch (Exception e) {
            System.out.println("Erro na operação de editar veículo: " + e.getMessage());
            String mensagem = "Erro na operação de editar veículo: " + e.getMessage();
            return mensagem;
        }

    }
    
    public String excluir(Veiculo vei) {
        String sql;
        PreparedStatement ps = null;

        sql = "delete from tbl_veiculo where placa = ?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, vei.getPlaca());

            ps.execute();
            System.out.printf("Veículo %s, Placa %s ", vei.getModelo(), vei.getPlaca());
            System.out.println("\nOK, excluído com sucesso!");
            ps.close();
            return "ok";
            
        } catch (Exception e) {
            System.out.println("Erro na operação de deletar veículo: " + e.getMessage());
            String mensagem = "Erro na operação de deletar veículo: " + e.getMessage();
            return mensagem;
        }
    }

    public ArrayList<Veiculo> listar() {
        ArrayList<Veiculo> carros = new ArrayList<>();

        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT codigo, marca, modelo, ano_fabricacao, ano_modelo, chassi, placa\n"
                + "FROM tbl_veiculo;";

        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                Veiculo car = new Veiculo();

                car.setCodigo(rs.getInt("codigo"));

                car.setMarca(rs.getString("marca"));
                car.setModelo(rs.getString("modelo"));
                car.setAnoFabricacao(rs.getInt("ano_fabricacao"));
                car.setAnoModelo(rs.getInt("ano_modelo"));
                car.setPlaca(rs.getString("placa"));
                car.setChassi(rs.getString("chassi"));

                carros.add(car);

            }
            rs.close();
            ps.close();

        } catch (Exception e) {
            System.err.println("Erro na operação de listar veículos: " + e.getMessage());
        }
        return carros;
    }

    public Veiculo buscarVeiculoPorPlaca(String placa) {

        String compara = null;
        ArrayList<Veiculo> listVeiculos = new ArrayList<>();
        listVeiculos = listar();

        Veiculo veic = null;

        if (listVeiculos.size() != 0) {
            for (Veiculo v : listVeiculos) {
                compara = v.getPlaca();

                if (compara.equals(placa)) {
                    veic = v;
                    break;
                }

            }

            return veic;

        } else {

            return null;
        }

    }

}
