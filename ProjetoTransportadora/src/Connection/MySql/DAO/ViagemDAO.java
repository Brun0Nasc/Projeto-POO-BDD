/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection.MySql.DAO;

import Connection.MySql.ConnectionFactory;
import Connection.Classes.Viagem;
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
public class ViagemDAO {
    Connection con;
    PreparedStatement stmt = null;
    ResultSet rs;
    ArrayList<Viagem> lista = new ArrayList<>();
    
    
    public ArrayList<Viagem> pesquisarViagens(){
        String sql = """
                     select c.id_caminhao, c.cod_licenca, v.numero_viagem, v.peso, d.endereco 
                     from caminhoes as c 
                     inner join viagem as v on v.fk_caminhoes = c.id_caminhao 
                     inner join viagem_deposito as vd on vd.fk_viagem = v.id_viagem 
                     inner join deposito as d on d.id_deposito = vd.fk_deposito
                     """;
        con = ConnectionFactory.getConnection();
        lista.clear();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Viagem v = new Viagem();
                v.setId_caminhao(rs.getInt("id_caminhao"));
                v.setCod_licenca(rs.getInt("cod_licenca"));
                v.setNumero_viagem(rs.getInt("numero_viagem"));
                v.setPeso(rs.getDouble("peso"));
                v.setEndereco(rs.getString("endereco"));
                
                lista.add(v);
            }
            stmt.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ViagensDAO Pesquisar: " + e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return lista;
    }
    
    public ArrayList<Viagem> pesquisarViagem(int id){
        String sql = """
                     select c.id_caminhao, c.cod_licenca, v.numero_viagem, v.peso, d.endereco 
                     from caminhoes as c 
                     inner join viagem as v on v.fk_caminhoes = c.id_caminhao 
                     inner join viagem_deposito as vd on vd.fk_viagem = v.id_viagem 
                     inner join deposito as d on d.id_deposito = vd.fk_deposito
                     where c.id_caminhao = ?
                     """;
        con = ConnectionFactory.getConnection();
        lista.clear();
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Viagem v = new Viagem();
                v.setId_caminhao(rs.getInt("id_caminhao"));
                v.setCod_licenca(rs.getInt("cod_licenca"));
                v.setNumero_viagem(rs.getInt("numero_viagem"));
                v.setPeso(rs.getDouble("peso"));
                v.setEndereco(rs.getString("endereco"));
                
                lista.add(v);
            }
            
            stmt.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ViagemDAO Pesquisar: " + e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return lista;
    }
}
