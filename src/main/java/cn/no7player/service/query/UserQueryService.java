package cn.no7player.service.query;

import cn.no7player.model.User;
import cn.no7player.service.query.request.UserQueryRequest;

/**
 * Created by tangenqing on 18/8/6.
 */
public interface UserQueryService {

    User queryUser(UserQueryRequest request);
}
