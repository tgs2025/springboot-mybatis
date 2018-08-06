package cn.no7player.service;

import cn.no7player.model.User;
import cn.no7player.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zl on 2015/8/27.
 */

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserInfo() {
        User user = userRepository.queryById(1);
        //User user=null;
        return user;
    }

}
