package cn.no7player.service.query;

import cn.no7player.repository.model.User;
import cn.no7player.service.query.request.UserQueryRequest;

/**
 * Created by tangenqing on 18/8/6.
 */
public interface UserQueryService {

    //用户信息
    User queryUser(UserQueryRequest request);

    //用户贡献榜查询

    //单纯用户消息查询
}
