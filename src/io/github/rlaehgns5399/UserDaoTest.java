package io.github.rlaehgns5399;

import java.sql.SQLException;

/**
 * Created by KimDoHoon on 2019-04-20 020.
 */
public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        ApplicationContext context = new AnnotationConfigApplication(DaoFactory.class);

        UserDAO dao = context.getBean("userDAO", UserDAO.class);

        User user = new User();
        user.setId("whiteship");
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
