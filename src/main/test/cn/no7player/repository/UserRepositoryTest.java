package cn.no7player.repository;

import cn.no7player.Application;
import cn.no7player.repository.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 用户表仓储层测试类
 * Created by tangenqing on 18/8/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void queryByIdTest() {
        User user = userRepository.queryById(1L);
        System.out.println(user);
    }

    @Test
    public void insertTest(){
        User user = new User();
        user.setName("test-teq");
        user.setPassword("123");
        user.setTelphone("1520152");
        user.setAddress("address-test");
        userRepository.insert(user);
    }


}
