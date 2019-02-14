package io.github.rlaehgns5399;

/**
 * Created by KimDoHoon on 2019-02-14 014.
 */
public class DaoFactory {
    public UserDAO userDAO(){
        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDAO userDao = new UserDAO(connectionMaker);
        return userDao;
    }
}
