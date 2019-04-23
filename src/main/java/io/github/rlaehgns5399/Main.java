package io.github.rlaehgns5399;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        UserDAO dao = new DaoFactory().userDAO();

        User user = new User();
        user.setId("dd");
        user.setName("김도훈");
        user.setPassword("root");

        dao.add(user);

        System.out.println(user.getId() + "등록 성공!");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
        System.out.println(user2.getId() + "조회 성공!");
    }
}
