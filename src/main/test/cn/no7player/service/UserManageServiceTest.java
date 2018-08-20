package cn.no7player.service;

import cn.no7player.Application;
import cn.no7player.service.magage.UserManageService;
import cn.no7player.service.model.request.UpdateUserRequest;
import cn.no7player.service.model.request.UserCreateRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 用户管理服务测试类
 * Created by tgs on 2018/8/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class UserManageServiceTest {
    // 测试用户地址更新服务
    @Autowired
    private UserManageService userManageService;
    @Test
    public  void createUserTest(){
        UserCreateRequest request = new UserCreateRequest();
        request.setName("hxs");
        request.setPassword("123456");
        request.setAddress("shanghai");
        request.setTelphone("1234567890");
        System.out.println(userManageService.createUser(request).isSuccess());
    }
    @Test
    public void updateUserTest(){

        UpdateUserRequest request = new UpdateUserRequest();
        request.setId(1L);
        request.setAddress("asddiwd");
        request.setTelephone("123dsjha3451123567");
        System.out.println(userManageService.updateUser(request).isSuccess());
    }
    }


