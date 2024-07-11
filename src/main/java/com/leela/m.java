package com.leela;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class m {
    public static void main(String[] args) {


        try {
            Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=pubs;trustServerCertificate=true;", "sa", "Ambicaram@123");
            Statement st=con.createStatement();
            String query2="update products set price= 10 where prodId=101";
            String query3="update products set price= ? where prodId=?";
            PreparedStatement preparedStatement= con.prepareStatement(query3);
            preparedStatement.setInt(1, 11);
            preparedStatement.setInt(2, 100);
            Integer result1=preparedStatement.executeUpdate();
            System.out.println(result1);
                
            Integer result=st.executeUpdate(query2);
            System.out.println("no of rows affected are: "+ result);
            String query ="select * from products";
            ResultSet rs=st.executeQuery(query);
            while (rs.next()) {
                for(int i=1;i<6;i++){
                    System.out.print(rs.getString(i)+" ");
                }
                System.out.println();
            }

        } catch (Exception e) {
           e.printStackTrace();
        }
        
    }
}
