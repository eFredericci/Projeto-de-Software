package model.row;

import row_control.jClassConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class rowDAO {
    
    public boolean checkLogin(String login, String senha, String prioridade) {
        
        Connection con = jClassConexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE codigo = ? and senha = ? and prioridade = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            stmt.setString(3, prioridade);
            
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                
                check = true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(rowDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            jClassConexao.closeConnection(con, stmt, rs);
        }
    
    return check;
    }
}
