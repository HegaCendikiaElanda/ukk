/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Adnale
 */
public class koneksi {
    public Connection con;
    public Statement stm;
    
    public void config(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_listrik_ukk", "root" , "");
            stm = con.createStatement();
            System.out.println("Connect");
        }catch(Exception e){
            System.out.println("Disconnect");
            System.exit(0);
        }
    }
   
}