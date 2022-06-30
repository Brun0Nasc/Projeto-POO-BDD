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
    
    public void salvarDados(Viagem v){
        String sql = "insert into viagem(numero_viagem, peso, fk_caminhoes) values(?, ?, ?);";
        String sql_id = "SELECT * FROM viagem ORDER BY id_viagem DESC limit 1;";
        String sql_viagem_deposito = "insert into viagem_deposito(fk_viagem, fk_deposito) values(?,?);";
        con = ConnectionFactory.getConnection();
        try{
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, v.getNumero_viagem());
            stmt.setDouble(2, v.getPeso());
            stmt.setInt(3, v.getId_caminhao());
            stmt.executeUpdate();
            stmt.close();
            
            stmt = con.prepareStatement(sql_id);
            rs = stmt.executeQuery();
            int id_viagem = 0;
            while(rs.next()){
                id_viagem = rs.getInt("id_viagem");
            }
            stmt.close();
            
            stmt = con.prepareStatement(sql_viagem_deposito);
            stmt.setInt(1, id_viagem);
            stmt.setInt(2, v.getId_deposito());
            stmt.executeUpdate();
            
            stmt.close();
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados" + e.toString());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public ArrayList<Viagem> pesquisarViagens(){
        String sql = """
                     select c.id_caminhao, c.cod_licenca, v.numero_viagem, v.peso, d.id_deposito, d.endereco 
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
                v.setId_deposito(rs.getInt("id_deposito"));
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
                     select c.id_caminhao, c.cod_licenca, v.numero_viagem, v.peso, d.id_deposito, d.endereco 
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
                v.setId_deposito(rs.getInt("id_deposito"));
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
