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
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs;
    ArrayList<Armazem> lista = new ArrayList<>();
    
    public void salvarDados(Armazem a){
        String sql = "INSERT INTO armazem (endereco, n_caminhoes, capacidade) VALUES (?,?,?)";
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, a.getEndereco());
            stmt.setInt(2, a.getnCaminhoes());
            stmt.setDouble(3, a.getCapacidade());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados" + e.toString());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public ArrayList<Armazem> pesquisarFcunionario(){
        String sql = "SELECT * FROM armazem";
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Armazem a = new Armazem();
                a.setId(rs.getInt("id"));
                a.setCapacidade(rs.getDouble("capacidade"));
                a.setnCaminhoes(rs.getInt("n_caminhoes"));
                a.setEndereco(rs.getString("endereco"));
                
                lista.add(a);
            }
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ArmazemDAO Pesquisar: " + e);
        }
        
        return lista;
    }
}
