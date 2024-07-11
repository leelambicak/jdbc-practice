package com.leela;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=pubs;trustServerCertificate=true","sa","Ambicaram@123");
        Statement st=con.createStatement();
        String query="select * from Titles";
        ResultSet rs=st.executeQuery(query);
        while (rs.next()) {
            for(int i=1; i<5;i++){
             System.out.println(rs.getString(i)+" ");
            
        }
        System.out.println();
        }
        st.close();
        con.close();
    }
}   
    
