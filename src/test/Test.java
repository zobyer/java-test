/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
/**
 *
 * @author Ajmir
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        savedata sav =new savedata();
        sav.setVisible(true);
        connectdb();
    }
    
    public static Connection connectdb(){
        
        Connection con =null;
        try{
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:test.db");
            //System.out.println("connected");
            JOptionPane.showMessageDialog(null,"connectd");
                    
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            ///System.out.println(e);
        }
        return con;
    }
    
}
