package row_control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class jClassConexao {
    
    private static final  String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:jtds:sqlserver://127.0.0.1:1433/ROW_CONTROL";
    private static final String USER = "fredericci";
    private static final String PASS = "159753";
    
    
    public static Connection getConnection(){
  
        try {
                Class.forName(DRIVER);
                return DriverManager.getConnection(URL, USER, PASS);
            } catch (ClassNotFoundException | SQLException ex) {
                throw new RuntimeException("Erro na conexão: ",ex);
            }   
        }
    
    public static void closeConnection(Connection con){
        try {
            if(con != null) {
                con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(jClassConexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        
        closeConnection(con);
        
        try {
            
            if(stmt != null) {
                stmt.close();
            }
            
            } catch (SQLException ex) {
                Logger.getLogger(jClassConexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
        closeConnection(con, stmt);
        
        try {
            
            if(rs != null) {
                rs.close();
            }
            
            } catch (SQLException ex) {
                Logger.getLogger(jClassConexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
   }
