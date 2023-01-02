package org.example;

import java.sql.*;

public class Main
{
    public static void main(String[] args) throws ClassNotFoundException {

        //String url = "jdbc:sqlserver://ST-VKDB;databaseName=BOAWeb;integratedSecurity=true";
        String url = "jdbc:sqlserver://ST-VKDB/BOAWeb/integratedSecurity=true";
        try
        {

            Statement statement = null;
            ResultSet resultSet;

          try(  Connection conn = DriverManager.getConnection(url);)
          {
              System.out.println("Baglandi !!");
              statement = conn.createStatement();
              statement.getConnection();
              resultSet = statement.executeQuery("select * from BoaWeb.INT.WebUser where CustomerId='11848'");
              while (resultSet.next())
              {
                  System.out.println(resultSet.getString("UserId")+" "+resultSet.getString("Personid"));
              }
 // deneme push engin
          }

        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

    }
}
























