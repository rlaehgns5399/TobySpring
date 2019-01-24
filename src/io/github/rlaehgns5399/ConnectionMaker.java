package io.github.rlaehgns5399;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by KimDoHoon on 2019-01-24 024.
 */
public interface ConnectionMaker {
    public Connection makeConnection() throws ClassNotFoundException, SQLException;
}
