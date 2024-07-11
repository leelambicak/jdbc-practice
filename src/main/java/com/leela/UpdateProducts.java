package com.leela;

import java.sql.*;

public class UpdateProducts {

    public static void main(String args[]) {
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=pubs;trustServerCertificate=true","sa","Ambicaram@123");
        Statement st=con.createStatement();
        String query="update products set ProdName='smartphone' where ProdId=102";
        int rs=st.executeUpdate(query);
        System.out.print("updated products table");
    
        }
        catch(Exception e){
        e.printStackTrace();
        }
    }


    
}
