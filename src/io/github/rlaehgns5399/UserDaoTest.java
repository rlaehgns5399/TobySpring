package io.github.rlaehgns5399;

import java.sql.SQLException;

/**
 * Created by KimDoHoon on 2019-01-24 024.
 */
public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        UserDAO dao = new DaoFactory().userDAO();
    }
}
