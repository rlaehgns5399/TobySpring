package io.github.rlaehgns5399;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

/**
 * Created by KimDoHoon on 2019-04-20 020.
 */
public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDAO dao = context.getBean("userDAO", UserDAO.class);
        UserDAO dao2 = context.getBean("userDAO", UserDAO.class);

        // ApplicationContext에서 생성된 Bean은 모두 싱글톤 패턴으로 저장하고 관리한다.
        System.out.println(dao);
        System.out.println(dao2);
        /**
        User user = new User();
        user.setId("root");
        user.setName("김도훈");
        user.setPassword("root");

        dao.add(user);

        System.out.println(user.getId() + "등록 성공!");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
        System.out.println(user2.getId() + "조회 성공!");
        **/
    }
}
