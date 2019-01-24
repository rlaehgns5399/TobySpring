package io.github.rlaehgns5399;

/**
 * Created by KimDoHoon on 2019-01-24 024.
 */
public class UserDaoTest {
    public static void main(String[] args){
        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDAO dao = new UserDAO(connectionMaker);
    }
}
