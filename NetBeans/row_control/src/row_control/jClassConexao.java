/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package row_control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Eduardo
 */
public class jClassConexao {

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private final Connection jClassConexao;
    public jClassConexao() throws Exception{
        Class.forName(null);
        String url;
        url = "net.sourceforge.jtds.jdbc.Driver";
        jClassConexao = DriverManager.getConnection(url, "fredericci", "159753");
        
        
    }
 }
