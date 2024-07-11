package com.leela;
import java.sql.*;

public class SalesInsert {
    public static void main(String args[]){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=pubs;trustServerCertificate=true","sa","<YourStrong@Passw0rd>");
            Statement st=con.createStatement();
            String query="insert into SALES values('4','ORD006','2023-03-12T23:43:00',130,'NET 34','T003')";
            int rs=st.executeUpdate(query);
            System.out.println("Successfully inserted a row in to sales table");
    
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    
}
