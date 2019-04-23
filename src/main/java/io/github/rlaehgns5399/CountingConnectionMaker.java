package io.github.rlaehgns5399;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by KimDoHoon on 2019-04-23 023.
 */
public class CountingConnectionMaker implements ConnectionMaker {
    int counter = 0;
    private ConnectionMaker realConnectionMaker;

    public CountingConnectionMaker(ConnectionMaker connectionMaker){
        this.realConnectionMaker = connectionMaker;
    }

    public Connection makeConnection() throws ClassNotFoundException, SQLException{
        this.counter++;
        return realConnectionMaker.makeConnection();
    }

    public int getCounter(){
        return counter;
    }
}
