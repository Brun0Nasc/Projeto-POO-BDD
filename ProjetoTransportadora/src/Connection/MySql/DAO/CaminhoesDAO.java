/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection.MySql.DAO;

import Connection.MySql.ConnectionFactory;
import Connection.Classes.Caminhao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Bruno-PC
 */
public class CaminhoesDAO {
    Connection con;
    PreparedStatement stmt = null;
    ResultSet rs;
    ArrayList<Caminhao> lista = new ArrayList<>();
    
    public void salvarDados(Caminhao c){
        String sql = "INSERT INTO caminhoes (cod_licenca, capacidade) VALUES (?,?)";
        con = ConnectionFactory.getConnection();
        try{
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, c.getCod_licenca());
            stmt.setDouble(2, c.getCapacidade());
            
            stmt.executeUpdate();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados" + e.toString());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public ArrayList<Caminhao> pesquisarCaminhoes(){
        String sql = "SELECT * FROM caminhoes";
        con = ConnectionFactory.getConnection();
        lista.clear();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Caminhao c = new Caminhao();
                c.setId(rs.getInt("id_caminhao"));
                c.setCapacidade(rs.getDouble("capacidade"));
                c.setCod_licenca(rs.getInt("cod_licenca"));
                
                lista.add(c);
            }
            stmt.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CaminhoesDAO Pesquisar: " + e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return lista;
    }
    
    public ArrayList<Caminhao> pesquisarCaminhao(int id){
        String sql = "SELECT * FROM caminhoes WHERE id_caminhao=?";
        con = ConnectionFactory.getConnection();
        lista.clear();
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Caminhao c = new Caminhao();
                c.setId(rs.getInt("id_caminhao"));
                c.setCapacidade(rs.getDouble("capacidade"));
                c.setCod_licenca(rs.getInt("cod_licenca"));
                
                lista.add(c);
            }
            
            stmt.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CaminhaoDAO Pesquisar: " + e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return lista;
    }
    
    public void alterarCaminhao(Caminhao c){
        String sql = "UPDATE caminhoes SET cod_licenca = ?, capacidade = ? WHERE id_caminhao = ?";
        con = ConnectionFactory.getConnection();
        try{
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, c.getCod_licenca());
            stmt.setDouble(2, c.getCapacidade());
            stmt.setInt(3, c.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
            stmt.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados" + e.toString());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void excluirCaminhao(int id) {
        String sql = "DELETE FROM caminhoes WHERE id_caminhao = ?";
        con = ConnectionFactory.getConnection();
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            
            stmt.execute();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados" + e.toString());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
