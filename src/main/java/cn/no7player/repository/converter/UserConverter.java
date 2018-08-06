package cn.no7player.repository.converter;

import cn.no7player.model.User;
import cn.no7player.model.dataobject.UserDO;

/**
 * 用户表 模型和do转换器
 * Created by tangenqing on 18/8/6.
 */
public class UserConverter {

    public static UserDO convert2DO(User user){
        UserDO userDO = new UserDO();
        userDO.setId(user.getId());
        userDO.setName(user.getName());
        userDO.setTelphone(user.getTelphone());
        userDO.setAddress(user.getAddress());
        userDO.setGmtCreate(user.getGmtCreate());
        userDO.setGmtModified(user.getGmtModofied());
        return userDO;
    }

    public static User convert2Model(UserDO userDO){
        User user = new User();
        user.setId(userDO.getId());
        user.setName(userDO.getName());
        user.setPassword(userDO.getPassword());
        user.setTelphone(userDO.getTelphone());
        user.setAddress(userDO.getAddress());
        user.setGmtCreate(userDO.getGmtCreate());
        user.setGmtModofied(userDO.getGmtModified());
        return user;
    }
}
