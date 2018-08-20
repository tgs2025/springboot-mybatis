package cn.no7player.service.magage;

import cn.no7player.service.model.request.ReadedMessageRequest;
import cn.no7player.service.model.request.UpdateUserRequest;
import cn.no7player.service.model.request.UserCreateRequest;
import cn.no7player.service.model.result.ApiResult;
import cn.no7player.service.model.result.BaseResult;

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


    /**
     * 消息更新为已读
     * @param request
     * @return
     */
    BaseResult readedMessageByUser(ReadedMessageRequest request);

    /**
     * 添加地址和电话
     * @param request
     * @return
     */
    BaseResult updateUser(UpdateUserRequest request);

}
