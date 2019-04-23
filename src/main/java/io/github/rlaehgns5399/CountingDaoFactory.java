package io.github.rlaehgns5399;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Created by KimDoHoon on 2019-02-23 014.
 */
@Configuration
public class CountingDaoFactory {
    @Bean
    public UserDAO userDAO(){
        return new UserDAO(connectionMaker());
    }
    @Bean
    public ConnectionMaker connectionMaker(){
        // 새로운 DB를 쓸 때, 이 코드만 변경해주면 된다.
        return new CountingConnectionMaker(realConnectionMaker());
    }
    @Bean
    public ConnectionMaker realConnectionMaker(){
        return new DConnectionMaker();
    }
}
