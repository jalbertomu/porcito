/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Alberts
 */
public class ConexionMySQL {
     public String bd = "usuario";
    public String login = "root";
    public String password = "";
    public String url = "jdbc:mysql://localhost/" + bd;

    private Statement sentenciaSQL;
    private ResultSet cdr;

    public Connection conectar() {
        Connection link = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection(this.url, this.login, this.password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return link;
    }
}
