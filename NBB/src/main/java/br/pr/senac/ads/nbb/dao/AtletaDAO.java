/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pr.senac.ads.nbb.dao;

import br.pr.senac.ads.nbb.conn.ConnectionDB;
import java.sql.SQLException;
import br.pr.senac.ads.nbb.model.Atleta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo.8965
 */
public class AtletaDAO extends GenericDAO {
    
    Connection conn;
    
    public void salvar(Atleta atleta) throws SQLException {
        String insert = "INSERT INTO nbb.atleta "
                + "(nome, altura, dataNascimento, "
                + "peso, timeBasquete, posicaoTime, "
                + "envergadura, classificacaoNBB)"
                + " VALUES (?,?,?,?,?,?,?,?);";
        save(insert,
                atleta.getNome(),
                atleta.getAltura(),
                atleta.getDataNascimento(),
                atleta.getPeso(),
                atleta.getTime(),
                atleta.getPosicaoTime(),
                atleta.getEnvergadura(),
                atleta.getClassificacaoNBB());
    }
    
    public ArrayList<Atleta> listarTodos() {
        String sql = "SELECT * FROM atleta";
        ResultSet resultado;
        
        try {
            
            conn = ConnectionDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            resultado = pstmt.executeQuery();
            
            while(resultado.next()) {
                Atleta objAtleta = new Atleta();
                objAtleta.setCodigo(resultado.getInt("codigo"));
                objAtleta.setNome(resultado.getString("nome"));
                objAtleta.setAltura(resultado.getDouble("altura"));
                objAtleta.setDataNascimento(resultado.getDate("dataNascimento"));
                objAtleta.setPeso(resultado.getDouble("peso"));
                objAtleta.setTime(resultado.getString("timeBasquete"));
                objAtleta.setPosicaoTime(resultado.getString("posicaoTime"));
                objAtleta.setEnvergadura(resultado.getDouble("envergadura"));
                objAtleta.setClassificacaoNBB(resultado.getInt("classificacaoNBB"));
                
                lista.add(objAtleta);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no select do Banco de Dados " + e);
        }
        
        return lista;
        
    }
    
    public ArrayList<Atleta> listarPesquisaNome(String nome) {
        String sql = "SELECT * FROM atleta WHERE nome LIKE '%" + nome + "%' ORDER BY codigo;";
        ResultSet resultado;
        
        try {
            
            conn = ConnectionDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            resultado = pstmt.executeQuery();
            
            while(resultado.next()) {
                Atleta objAtleta = new Atleta();
                objAtleta.setCodigo(resultado.getInt("codigo"));
                objAtleta.setNome(resultado.getString("nome"));
                objAtleta.setAltura(resultado.getDouble("altura"));
                objAtleta.setDataNascimento(resultado.getDate("dataNascimento"));
                objAtleta.setPeso(resultado.getDouble("peso"));
                objAtleta.setTime(resultado.getString("timeBasquete"));
                objAtleta.setPosicaoTime(resultado.getString("posicaoTime"));
                objAtleta.setEnvergadura(resultado.getDouble("envergadura"));
                objAtleta.setClassificacaoNBB(resultado.getInt("classificacaoNBB"));
                
                lista.add(objAtleta);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no select do Banco de Dados " + e);
        }
        
        return lista;
        
    }
    
    
    public void atualizar(Atleta atleta) throws SQLException {
        String alterar = "UPDATE nbb.atleta "
                + "SET nome = ?, altura = ?, dataNascimento = ?, peso = ?, timeBasquete = ?, "
                + "posicaoTime = ?, envergadura = ?, classificacaoNBB = ? "
                + "WHERE codigo = ?";
        update(alterar,
                atleta.getCodigo(),
                atleta.getNome(),
                atleta.getAltura(),
                atleta.getDataNascimento(),
                atleta.getPeso(),
                atleta.getTime(),
                atleta.getPosicaoTime(),
                atleta.getEnvergadura(),
                atleta.getClassificacaoNBB());
    }
    
    
    public void deletar(Atleta atleta) throws SQLException {
        String delet = "DELETE FROM nbb.atleta "
                + "WHERE nome = ? and altura = ? and dataNascimento = ? and peso = ? and timeBasquete = ? and "
                + "posicaoTime = ? and envergadura = ? and classificacaoNBB = ? and "
                + "codigo = ?";
        delete(delet,
                atleta.getCodigo(),
                atleta.getNome(),
                atleta.getAltura(),
                atleta.getDataNascimento(),
                atleta.getPeso(),
                atleta.getTime(),
                atleta.getPosicaoTime(),
                atleta.getEnvergadura(),
                atleta.getClassificacaoNBB());
    }
}
