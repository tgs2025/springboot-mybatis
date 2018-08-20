package cn.no7player.service.query;

import cn.no7player.repository.model.User;
import cn.no7player.service.model.UserDTO;
import cn.no7player.service.model.result.SingleQueryResult;
import cn.no7player.service.query.request.UserQueryRequest;

/**
 * Created by tangenqing on 18/8/6.
 */
public interface UserQueryService {

    /**
     * 用户基本信息
     *
     * @param request
     * @return
     */
    SingleQueryResult<User> queryUser(UserQueryRequest request);

    /**
     * 查询用户信息+消息查询+手办信息
     *
     * @param request
     * @return
     */
    //todo tgs 用户信息+消息信息 + 手办信息 查到后 set到dto对象里 ；实现该方法
    SingleQueryResult<UserDTO> queryUserInfo(UserQueryRequest request);
}
