package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection
{
    private String dbUrl="jdbc:mysql://localhost:3306/sakila";

    public Connection getConnection()throws SQLException
{
    return DriverManager.getConnection(dbUrl);
}
    public void showErrorMassage(SQLException exception)
    {
        System.out.println("HATA "+exception.getMessage()+" HATA KODU: "+exception.getErrorCode());
    }
}


