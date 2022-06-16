/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection.MySql.ArmazemDAO;

import Connection.MySql.ConnectionFactory;
import Connection.Classes.Armazem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author Bruno-PC
 */
public class ArmazemDAO {
    public void salvarDados(Armazem a){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql = "INSERT INTO armazem (endereco, num_caminhoes, capacidade) VALUES (?,?,?)";
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
}
