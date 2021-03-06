package cn.no7player.repository.impl;

import cn.no7player.mapper.UserMapper;
import cn.no7player.repository.UserRepository;
import cn.no7player.repository.converter.UserConverter;
import cn.no7player.repository.model.User;
import cn.no7player.repository.model.dataobject.UserDO;
import cn.no7player.service.model.request.UpdateUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by tangenqing on 18/8/6.
 */
@Service
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Long insert(User user) {
        user.setGmtCreate(new Date());
        user.setGmtModified(new Date());
        UserDO userDO = UserConverter.convert2DO(user);
        return userMapper.insertUser(userDO);
    }

    @Override
    public User queryById(long id) {
        UserDO userDO = userMapper.selectById(id);
        return UserConverter.convert2Model(userDO);
    }

    @Override
    public int updateAddress(UpdateUserRequest request) {
        //get usedo
        //update do
        //mapper update
        UserDO userDO = userMapper.selectById(request.getId());
        userDO.setTelphone(request.getTelephone());
        userDO.setAddress(request.getAddress());
        userDO.setGmtModified(new Date());
        return userMapper.updateAddress(userDO);

    }
}
