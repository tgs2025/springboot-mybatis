package cn.no7player.service.magage;

import cn.no7player.service.model.request.UserCreateRequest;
import cn.no7player.service.model.result.ApiResult;

/**
 * 用户管理服务
 * Created by tgs on 2018/8/8.
 */
public interface UserManageService {

    /**
     * 创建用户
     * @param request
     * @return
     */
    ApiResult createUser(UserCreateRequest request);

    //消息已读

    //添加地址


}
