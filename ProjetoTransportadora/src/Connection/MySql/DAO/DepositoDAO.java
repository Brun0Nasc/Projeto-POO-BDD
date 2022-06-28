/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection.MySql.DAO;

import Connection.Classes.Deposito;
import Connection.MySql.ConnectionFactory;
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
public class DepositoDAO {
    Connection con;
    PreparedStatement stmt = null;
    ResultSet rs;
    ArrayList<Deposito> lista = new ArrayList<>();
    
     public ArrayList<Deposito> pesquisarDepositos(){
        String sql = "SELECT * FROM depositos";
        con = ConnectionFactory.getConnection();
        lista.clear();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Deposito d = new Deposito();
                d.setId_deposito(rs.getInt("id_deposito"));
                d.setCapacidade(rs.getDouble("capacidade"));
                d.setEndereco(rs.getString("endereco"));
                
                lista.add(d);
            }
            stmt.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "DepositoDAO Pesquisar: " + e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return lista;
    }
    
    public ArrayList<Deposito> pesquisarDeposito(int id){
        String sql = "SELECT * FROM deposito WHERE id_deposito=?";
        con = ConnectionFactory.getConnection();
        lista.clear();
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Deposito d = new Deposito();
                d.setId_deposito(rs.getInt("id_deposito"));
                d.setCapacidade(rs.getDouble("capacidade"));
                d.setEndereco(rs.getString("endereco"));
                
                lista.add(d);
            }
            
            stmt.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "DepositoDAO Pesquisar: " + e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return lista;
    }
}
