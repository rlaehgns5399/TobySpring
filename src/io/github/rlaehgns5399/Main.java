package io.github.rlaehgns5399;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        UserDAO DAO = new UserDAO();

        User user = new User();
        user.setId("whiteship");
        user.setName("김도훈");
        user.setPassword("root");

        DAO.add(user);

        System.out.println(user.getId() + "등록 성공!");

        User user2 = DAO.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
        System.out.println(user2.getId() + "조회 성공!");
    }
}
