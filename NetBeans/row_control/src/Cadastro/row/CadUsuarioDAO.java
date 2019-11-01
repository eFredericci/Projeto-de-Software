/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro.row;

import row_control.jClassConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Eduardo
 */
public class CadUsuarioDAO {
    private final Connection connection;
    Long id;
    String Codigo;
    String Senha;
    String Enable;
    String Prioridade;
    public CadUsuarioDAO(){ 
        this.connection = jClassConexao.getConnection();
    } 
    public void adiciona(CadUsuario CadUsuario){ 
        String sql = "INSERT INTO [dbo].[USUARIO]([Codigo],[Senha],[Prioridade]) VALUES(?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, CadUsuario.getCodigo());
            stmt.setString(2, CadUsuario.getSenha());
            stmt.setString(3, CadUsuario.getPrioridade());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
}
