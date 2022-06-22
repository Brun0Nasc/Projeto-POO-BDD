/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection.MySql.DAO;

import Connection.MySql.ConnectionFactory;
import Connection.Classes.Armazem;
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
public class ArmazemDAO {
    
    Connection con;
    PreparedStatement stmt = null;
    ResultSet rs;
    ArrayList<Armazem> lista = new ArrayList<>();
    
    public void salvarDados(Armazem a){
        String sql = "INSERT INTO armazem (endereco, num_caminhoes, capacidade) VALUES (?,?,?)";
        con = ConnectionFactory.getConnection();
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, a.getEndereco());
            stmt.setInt(2, a.getnCaminhoes());
            stmt.setDouble(3, a.getCapacidade());
            
            stmt.executeUpdate();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados" + e.toString());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public ArrayList<Armazem> pesquisarArmazem(){
        String sql = "SELECT * FROM armazem";
        con = ConnectionFactory.getConnection();
        lista.clear();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Armazem a = new Armazem();
                a.setId(rs.getInt("id"));
                a.setCapacidade(rs.getDouble("capacidade"));
                a.setnCaminhoes(rs.getInt("num_caminhoes"));
                a.setEndereco(rs.getString("endereco"));
                
                lista.add(a);
            }
            stmt.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ArmazemDAO Pesquisar: " + e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return lista;
    }
    
    public ArrayList<Armazem> pesquisarArmazemId(int id){
        String sql = "SELECT * FROM armazem WHERE id=?";
        con = ConnectionFactory.getConnection();
        lista.clear();
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Armazem a = new Armazem();
                a.setId(rs.getInt("id"));
                a.setCapacidade(rs.getDouble("capacidade"));
                a.setnCaminhoes(rs.getInt("num_caminhoes"));
                a.setEndereco(rs.getString("endereco"));
                
                lista.add(a);
            }
            
            stmt.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ArmazemDAO Pesquisar: " + e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return lista;
    }
    
    public void alterarArmazem(Armazem armazem){
        String sql = "UPDATE armazem SET endereco = ?, num_caminhoes = ?, capacidade = ? WHERE id = ?";
        con = ConnectionFactory.getConnection();
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, armazem.getEndereco());
            stmt.setInt(2, armazem.getnCaminhoes());
            stmt.setDouble(3, armazem.getCapacidade());
            stmt.setInt(4, armazem.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
            stmt.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados" + e.toString());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void excluirArmazem(int id) {
        String sql = "DELETE FROM armazem WHERE id = ?";
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
