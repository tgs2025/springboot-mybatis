package cn.no7player.repository;

import cn.no7player.model.User;

/**
 * Created by tangenqing on 18/8/6.
 */
public interface UserRepository {
    /**
     * 新增用户
     * @param user
     * @return 用户id
     */
    long insert(User user);

    /**
     * 基于用户id搜索
     * @param id
     * @return 用户模型
     */
    User queryById(long id);
}
