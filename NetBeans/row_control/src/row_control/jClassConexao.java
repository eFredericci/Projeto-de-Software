/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql.connect.control.row.data;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Eduardo
 */
public class jClassConexao {
    private final Connection jClassConexao;
    public jClassConexao() throws Exception{
        Class.forName(null);
        String url;
        url = "net.sourceforge.jtds.jdbc.Driver";
        jClassConexao = DriverManager.getConnection(url, "fredericci", "159753");
        
        
    }
}
