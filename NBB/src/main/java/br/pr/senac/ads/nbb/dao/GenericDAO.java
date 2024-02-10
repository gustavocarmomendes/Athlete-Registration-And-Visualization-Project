/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pr.senac.ads.nbb.dao;

import br.pr.senac.ads.nbb.conn.ConnectionDB;
import br.pr.senac.ads.nbb.model.Atleta;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo.8965
 */
public class GenericDAO {
    
    private Connection connection;
    
    ArrayList<Atleta> lista = new ArrayList<>();
           
    
    public GenericDAO() {
        this.connection = ConnectionDB.getConnection();
    }
    
    protected Connection getConnection() {
        return connection;
    }
    
    protected void save (String insertSql, Object... parametros)
            throws SQLException {
        PreparedStatement pstmt = getConnection()
                .prepareStatement(insertSql);

        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i+1, parametros[i]);
        }

        pstmt.execute();
        pstmt.close();
        connection.close();
    }
    
    protected void update(String updateSql, Object id, Object... parametros) throws 
    SQLException {
        PreparedStatement pstmt = getConnection().prepareStatement(updateSql);
    
        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i + 1, parametros[i]);
        }
        
        pstmt.setObject(parametros.length + 1, id);
        pstmt.execute();
        pstmt.close();
        connection.close();
    
    }
    
    protected void delete(String deleteSql, Object id,Object... parametros) throws SQLException {
        PreparedStatement pstmt = getConnection().prepareStatement(deleteSql);
        
        for(int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i + 1, parametros[i]);
        }
        
        pstmt.setObject(parametros.length + 1, id);
        pstmt.execute();
        pstmt.close();
        connection.close();
        
    }
    
}
