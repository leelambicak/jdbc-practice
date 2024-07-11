package com.leela;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Select {
    public static void main(String[] args) {
               try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=pubs;trustServerCertificate=true","sa","Ambicaram@123");
            con.setAutoCommit(false);
            String query = ("update products set Price = ? where ProdId = ?");
            
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1,200);
            pst.setInt(2,101);

            int count = pst.executeUpdate();
            if(count == 0){
                return;
            }
            String query1 = ("update products set ProdName = ? where ProdId = ?");
            
            pst = con.prepareStatement(query1);
            pst.setString(1,"system");
            pst.setInt(2,102);

            int count1 = pst.executeUpdate();
            System.out.println("success");
            if(count1 == 0){
                con.rollback();
            }
            else{
                con.commit();
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
 }

