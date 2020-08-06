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
import model.Carro;
import model.Caminhao;
import model.Motocicleta;
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

    public String incluirCarro(Carro c) {

        String sql;
        PreparedStatement ps = null;

        sql = "INSERT INTO tbl_veiculo(marca,modelo,ano_fabricacao,ano_modelo,placa,chassi,numeroportas,qtdpassageiros) VALUES (?,?,?,?,?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);

            ps.setString(1, c.getMarca());
            ps.setString(2, c.getModelo());
            ps.setInt(3, c.getAnoFabricacao());
            ps.setInt(4, c.getAnoModelo());
            ps.setString(5, c.getPlaca());
            ps.setString(6, c.getChassi());
            ps.setInt(7, c.getNumeroPortas());
            ps.setInt(8, c.getQtdPassageiros());

            ps.executeUpdate();
            ps.close();
            return "ok";

        } catch (Exception e) {
            System.out.println("Erro na operação de incluir carro: " + e.getMessage());
            String mensagem = "Erro na operação de incluir carro: " + e.getMessage();
            return mensagem;
        }

    }
    
    public String incluirCaminhao(Caminhao c) {

        String sql;
        PreparedStatement ps = null;
        
        sql = "INSERT INTO tbl_veiculo(marca,modelo,ano_fabricacao,ano_modelo,placa,chassi,numerodeeixos,capacidadedecarga) VALUES (?,?,?,?,?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);

            ps.setString(1, c.getMarca());
            ps.setString(2, c.getModelo());
            ps.setInt(3, c.getAnoFabricacao());
            ps.setInt(4, c.getAnoModelo());
            ps.setString(5, c.getPlaca());
            ps.setString(6, c.getChassi());
            ps.setInt(7, c.getNumeroDeEixos());
            ps.setFloat(8, c.getCapacidadeDeCarga());

            ps.executeUpdate();
            ps.close();
            return "ok";

        } catch (Exception e) {
            System.out.println("Erro na operação de incluir caminhão: " + e.getMessage());
            String mensagem = "Erro na operação de incluir caminhão: " + e.getMessage();
            return mensagem;
        }

    }
    
    public String incluirMotocicleta(Motocicleta m) {

        String sql;
        PreparedStatement ps = null;

 
        sql = "INSERT INTO tbl_veiculo(marca,modelo,ano_fabricacao,ano_modelo,placa,chassi,cilindradas,qtdrodas) VALUES (?,?,?,?,?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);

            ps.setString(1, m.getMarca());
            ps.setString(2, m.getModelo());
            ps.setInt(3, m.getAnoFabricacao());
            ps.setInt(4, m.getAnoModelo());
            ps.setString(5, m.getPlaca());
            ps.setString(6, m.getChassi());
            ps.setInt(7, m.getCilindradas());
            ps.setInt(8, m.getQtdRodas());

            ps.executeUpdate();
            ps.close();
            return "ok";

        } catch (Exception e) {
            System.out.println("Erro na operação de incluir motocicleta: " + e.getMessage());
            String mensagem = "Erro na operação de incluir motocicleta: " + e.getMessage();
            return mensagem;
        }

    }

    public String editar(Veiculo veic) {
        String sql;
        PreparedStatement ps = null;

        

        try {
            
            
            if(veic instanceof Carro){
                Carro c =(Carro) veic;
                
                sql = "UPDATE tbl_veiculo SET marca = ?, modelo = ?, ano_fabricacao = ?, ano_modelo = ?, numeroportas = ?, qtdpassageiros = ? WHERE placa = ?";
                ps = conn.prepareStatement(sql);
                
                ps.setString(1, c.getMarca());
                ps.setString(2, c.getModelo());
                ps.setInt(3, c.getAnoFabricacao());
                ps.setInt(4, c.getAnoModelo());
                ps.setString(5, c.getPlaca());
                ps.setString(6, c.getChassi());
                ps.setInt(7, c.getNumeroPortas());
                ps.setInt(8, c.getQtdPassageiros());

                int resultado = ps.executeUpdate();
                System.out.println("resultado desta query: "+resultado);
                System.out.println("\nOK, alterado com sucesso!");
                ps.close();
                return "ok";
            
            }else if(veic instanceof Caminhao){
                Caminhao cam = (Caminhao) veic;
                
                sql = "UPDATE tbl_veiculo SET marca = ?, modelo = ?, ano_fabricacao = ?, ano_modelo = ?, numeroportas = ?, qtdpassageiros = ?, numerodeeixos = ?,capacidadedecarga = ? WHERE placa = ?";
                ps = conn.prepareStatement(sql);
                
                ps.setString(1, cam.getMarca());
                ps.setString(2, cam.getModelo());
                ps.setInt(3, cam.getAnoFabricacao());
                ps.setInt(4, cam.getAnoModelo());
                ps.setString(5, cam.getPlaca());
                ps.setString(6, cam.getChassi());
                ps.setInt(7, cam.getNumeroDeEixos());
                ps.setFloat(8, cam.getCapacidadeDeCarga());

                int resultado = ps.executeUpdate();
                System.out.println("resultado desta query: "+resultado);
                System.out.println("\nOK, alterado com sucesso!");
                
                return "ok";
            }else{
                Motocicleta m = (Motocicleta) veic;
                
                sql = "UPDATE tbl_veiculo SET marca = ?, modelo = ?, ano_fabricacao = ?, ano_modelo = ?, numeroportas = ?, qtdpassageiros = ?, cilindradas = ?, qtdrodas = ? WHERE placa = ?";
                ps = conn.prepareStatement(sql);

                ps.setString(1, m.getMarca());
                ps.setString(2, m.getModelo());
                ps.setInt(3, m.getAnoFabricacao());
                ps.setInt(4, m.getAnoModelo());
                ps.setString(5, m.getPlaca());
                ps.setString(6, m.getChassi());
                ps.setInt(7, m.getCilindradas());
                ps.setInt(8, m.getQtdRodas());

                int resultado = ps.executeUpdate();
                System.out.println("resultado desta query: "+resultado);
                System.out.println("\nOK, alterado com sucesso!");
                
                return "ok";
            }
            
            
            
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

        String sql = "SELECT codigo, marca, modelo, ano_fabricacao, ano_modelo, chassi, placa,numeroportas,qtdpassageiros,numerodeeixos,capacidadedecarga,cilindradas,qtdrodas,tipo_veiculo\n"
                + "FROM tbl_veiculo;";

        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if (rs.getString("tipo_veiculo").equals("carro")) {
                
                while (rs.next()) {
                    
                    Carro c = new Carro();
                    
                    c.setCodigo(rs.getInt("codigo"));
                    
                    c.setMarca(rs.getString("marca"));
                    c.setModelo(rs.getString("modelo"));
                    c.setAnoFabricacao(rs.getInt("ano_fabricacao"));
                    c.setAnoModelo(rs.getInt("ano_modelo"));
                    c.setPlaca(rs.getString("placa"));
                    c.setChassi(rs.getString("chassi"));
                    c.setNumeroPortas(rs.getInt("numeroportas"));
                    c.setQtdPassageiros(rs.getInt("qtdpassageiros"));
                    
                    carros.add(c);
                    
                }
                rs.close();
                ps.close();
                
            } else if (rs.getString("tipo_veiculo").equals("caminhao")) {
                
                while (rs.next()) {
                    
                    Caminhao c = new Caminhao();
                    
                    c.setCodigo(rs.getInt("codigo"));
                    
                    c.setMarca(rs.getString("marca"));
                    c.setModelo(rs.getString("modelo"));
                    c.setAnoFabricacao(rs.getInt("ano_fabricacao"));
                    c.setAnoModelo(rs.getInt("ano_modelo"));
                    c.setPlaca(rs.getString("placa"));
                    c.setChassi(rs.getString("chassi"));
                    c.setNumeroDeEixos(rs.getInt("numerodeeixos"));
                    c.setCapacidadeDeCarga(rs.getFloat("capacidadedecarga"));
                    
                    carros.add(c);
                    
                }
                rs.close();
                ps.close();
            } else {
                
                while (rs.next()) {
                    
                    Motocicleta m = new Motocicleta();
                    
                    m.setCodigo(rs.getInt("codigo"));
                    
                    m.setMarca(rs.getString("marca"));
                    m.setModelo(rs.getString("modelo"));
                    m.setAnoFabricacao(rs.getInt("ano_fabricacao"));
                    m.setAnoModelo(rs.getInt("ano_modelo"));
                    m.setPlaca(rs.getString("placa"));
                    m.setChassi(rs.getString("chassi"));
                    m.setCilindradas(rs.getInt("cilindradas"));
                    m.setQtdRodas(rs.getInt("qtdrodas"));
                    
                    carros.add(m);
                    
                }
                rs.close();
                ps.close();
            }
            

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
