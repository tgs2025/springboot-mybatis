package cn.no7player.repository;

import cn.no7player.repository.model.User;
import cn.no7player.service.model.request.UpdateUserRequest;

/**
 * Created by tangenqing on 18/8/6.
 */
public interface UserRepository {
    /**
     * 新增用户
     *
     * @param user
     * @return 用户id
     */
    Long insert(User user);

    /**
     * 基于用户id搜索
     *
     * @param id
     * @return 用户模型
     */
    User queryById(long id);

    /**
     * 更新地址
     * @param
     * @return
     */
   int updateAddress(UpdateUserRequest request);

}
