package io.github.rlaehgns5399;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by KimDoHoon on 2019-01-24 024.
 */
public class SimpleConnectionMaker {
    public Connection makeConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3307/springbook?useSSL=false", "root", "root");
;
    return c;
    }
}
