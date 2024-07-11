package com.leela;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayCategories {
    public static void main(String args[]){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=pubs;trustServerCertificate=true","sa","<YourStrong@Passw0rd>");
            Statement st=con.createStatement();
            String query="select C.CatDesc, avg(P.price) from Categories C inner join products P on C.CatCode=P.CatCode group by C.CatDesc";
            ResultSet rs=st.executeQuery(query);
            while (rs.next()){
                for( int i=1; i<3; i++){
                    System.out.print(rs.getString(i)+"   ");
            }
            System.out.println();
        }
        
    }
    catch(Exception e){
        e.printStackTrace();
    }
    
 }
}