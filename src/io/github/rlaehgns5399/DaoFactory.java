package io.github.rlaehgns5399;

/**
 * Created by KimDoHoon on 2019-02-14 014.
 */
public class DaoFactory {
    public UserDAO userDAO(){
        return new UserDAO(connectionMaker());
    }
    public ConnectionMaker connectionMaker(){
        return new DConnectionMaker();
    }

    // 새로운 DAO를 만들고자 한다면 매 번 같은 DConnectionMaker 생성자를 부를 것이다.
    // 메소드 분리를 하는 것이 좋다.
    /*
    public AccountDAO accountDAO(){
        return new AccountDao(new DConnectionMaker());
    }
     */
}
