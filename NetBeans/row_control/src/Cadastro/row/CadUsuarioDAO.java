/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro.row;

import row_control.jClassConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Cadastro.row.CadUsuario;

/**
 *
 * @author Eduardo
 */
public class CadUsuarioDAO {
    private Connection connection;
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    public CadUsuarioDAO(){ 
        this.connection = new jClassConexao().getConnection();
    } 
    public void adiciona(CadUsuario CadUsuario){ 
        String sql = "INSERT INTO usuario(nome,senha,Enabled,prioridade) VALUES(?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, CadUsuario.getNome());
            stmt.setString(2, CadUsuario.getSenha());
            stmt.setString(3, CadUsuario.getEnabled());
            stmt.setString(4, CadUsuario.getPrioridade());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
}
