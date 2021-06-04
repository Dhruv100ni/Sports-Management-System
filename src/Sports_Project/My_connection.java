/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sports_Project;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class My_connection {
    public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("con.mysql.jdbc.Driver");
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost://3306/my_connection","root","");               
        }
        catch (Exception e){
            System.out.print(e.getMessage());
        }
        return con;
    }   
    
}
