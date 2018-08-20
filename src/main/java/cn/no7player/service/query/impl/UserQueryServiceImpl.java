package cn.no7player.service.query.impl;

import cn.no7player.exceptions.BaseException;
import cn.no7player.exceptions.enums.ErrorCode;
import cn.no7player.repository.UserRepository;
import cn.no7player.repository.model.User;
import cn.no7player.service.model.UserDTO;
import cn.no7player.service.model.result.SingleQueryResult;
import cn.no7player.service.query.UserQueryService;
import cn.no7player.service.query.request.UserQueryRequest;
import cn.no7player.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tangenqing on 18/8/6.
 */
@Service
public class UserQueryServiceImpl implements UserQueryService {

    /**
     * 用户信息存储服务
     */
    @Autowired
    private UserRepository userRepository;

    @Override
    public SingleQueryResult<User> queryUser(UserQueryRequest request) {
        try {
            //参数校验
            check(request);
            //查询
            User user = userRepository.queryById(request.getId());
            //结果返回
            SingleQueryResult<User> result = ResultUtils.createSuccResult(SingleQueryResult.class);
            result.setValue(user);
            return result;

        } catch (Exception e) {
            //log
            return ResultUtils.createFailResultByException(e, SingleQueryResult.class);
        }
    }


    @Override
    public SingleQueryResult<UserDTO> queryUserInfo(UserQueryRequest request) {
        return null;
    }

    private void check(UserQueryRequest request) {
        if (request == null) {
            throw new BaseException(ErrorCode.INVALID_PARAMETER, "用户信息查询请求不能为空");
        }
        if (request.getId() == null) {
            throw new BaseException(ErrorCode.INVALID_PARAMETER, "用户信息查询请求(用户id)不能为空");
        }
    }
}
