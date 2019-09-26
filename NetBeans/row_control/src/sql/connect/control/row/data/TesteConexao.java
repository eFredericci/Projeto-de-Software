/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql.connect.control.row.data;

import row_control.Conexao;
import javax.swing.JOptionPane;





/**
 *
 * @author Eduardo
 */
public class TesteConexao {
    public static void main (String [] args) {
        try {
            Conexao con = new Conexao();
            JOptionPane.showMessageDialog(null, "Conexao ok");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
