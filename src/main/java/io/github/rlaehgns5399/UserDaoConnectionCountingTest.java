package io.github.rlaehgns5399;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

/**
 * Created by KimDoHoon on 2019-04-23 023.
 */
public class UserDaoConnectionCountingTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CountingDaoFactory.class);
        UserDAO dao = context.getBean("userDAO", UserDAO.class);

         User user = new User();
         user.setId("testest");
         user.setName("김도훈");
         user.setPassword("root");

         dao.add(user);

         System.out.println(user.getId() + "등록 성공!");

         User user2 = dao.get(user.getId());
         System.out.println(user2.getName());
         System.out.println(user2.getPassword());
         System.out.println(user2.getId() + "조회 성공!");

        CountingConnectionMaker ccm = context.getBean("connectionMaker", CountingConnectionMaker.class);
        System.out.println("Connection counter : " + ccm.getCounter());

    }
}
