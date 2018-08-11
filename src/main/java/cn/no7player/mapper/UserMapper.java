package cn.no7player.mapper;

import cn.no7player.repository.model.dataobject.UserDO;

/**
 * Created by zl on 2015/8/27.
 */
public interface UserMapper {
    /**
     * 插入用户
     *
     * @param userDO
     * @return 用户自增id
     */
    long insertUser(UserDO userDO);

    /**
     * 基于用户id搜索
     *
     * @param id
     * @return
     */
    UserDO selectById(Long id);

    /**
     * 更新消息
     * @param address
     * @return
     */
    String updateAddress(String address);

}
