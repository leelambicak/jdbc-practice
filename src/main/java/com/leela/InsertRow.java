package com.leela;
import java.sql.*;

public class InsertRow {
    public static void main(String args[]){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=pubs;trustServerCertificate=true","sa","Ambicaram@123");
            Statement st=con.createStatement();//jdbc:sqlserver://localhost;databaseName=pubs;
            String query="insert into products(ProdName,Price,Remarks,CatCode) values('Tab',986.77,'Difficult to carry','CAT005')";
            int rs=st.executeUpdate(query);
            System.out.println("Successfully inserted in to products table");
    
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    
}
