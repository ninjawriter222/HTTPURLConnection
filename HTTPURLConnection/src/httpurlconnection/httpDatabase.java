/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurlconnection;

import java.io.*;
import java.sql.Connection;

/**
 *
 * @author Poozer
 */
public class httpDatabase {
    public static void main(String[] args){
        try{
        
        String serverName = "localhost";
        String myDatabase = "mydatabase";
        String url = "jdbc:mysql://" + serverName + "/" + myDatabase;
        
        String username = "username";
        String password = "password";
        
        Connection connection = Drivermanger.getConnection(url, username, password);
        
        System.out.println(connection.isClosed());
    }
    catch (Exception e) {
    System.out.println("You don't have access to the database.");
    }
    }
}
