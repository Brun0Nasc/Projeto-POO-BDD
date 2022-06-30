/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection.Classes;

/**
 *
 * @author Bruno-PC
 */
public class Viagem {
    private int id_caminhao;
    private int cod_licenca;
    private int numero_viagem;
    private double peso;
    private int id_deposito;

    public int getId_deposito() {
        return id_deposito;
    }

    public void setId_deposito(int id_deposito) {
        this.id_deposito = id_deposito;
    }
    private String endereco;

    public int getId_caminhao() {
        return id_caminhao;
    }

    public void setId_caminhao(int id_caminhao) {
        this.id_caminhao = id_caminhao;
    }

    public int getCod_licenca() {
        return cod_licenca;
    }

    public void setCod_licenca(int cod_licenca) {
        this.cod_licenca = cod_licenca;
    }

    public int getNumero_viagem() {
        return numero_viagem;
    }

    public void setNumero_viagem(int numero_viagem) {
        this.numero_viagem = numero_viagem;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
