package cn.no7player.service.magage;

import cn.no7player.service.model.request.UserCreateRequest;
import cn.no7player.service.model.result.ApiResult;

/**
 * Created by tgs on 2018/8/8.
 */
public interface UserManageService {

    ApiResult createUser(UserCreateRequest request);
}
