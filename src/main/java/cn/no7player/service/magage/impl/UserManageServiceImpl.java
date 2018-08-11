package cn.no7player.service.magage.impl;

import cn.no7player.repository.model.Message;
import cn.no7player.repository.model.User;
import cn.no7player.repository.UserRepository;
import cn.no7player.repository.MessageRepository;
import cn.no7player.service.magage.UserManageService;
import cn.no7player.exceptions.enums.ErrorCode;
import cn.no7player.exceptions.BaseException;
import cn.no7player.service.model.request.ReadedMessageRequest;
import cn.no7player.service.model.request.UserCreateRequest;
import cn.no7player.service.model.result.ApiResult;
import cn.no7player.service.model.result.BaseResult;
import cn.no7player.utils.ResultUtils;
import cn.no7player.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户管理服务实现类
 * Created by tangenqing on 18/8/9.
 */
@Service
public  class UserManageServiceImpl implements UserManageService {

    @Autowired
    private UserRepository userRepository;
    private MessageRepository messageRepository;

    @Override
    public ApiResult createUser(UserCreateRequest request) {
        try {
            //参数校验
            check(request);

            //执行业务
            User user = convertReq2Model(request);
            Long uid = userRepository.insert(user);

            //返回结果
            ApiResult result = ResultUtils.createSuccResult(ApiResult.class);
            result.setId(uid);
            return result;

        } catch (Exception e) {
            //todo log
            return ResultUtils.createFailResultByException(e, ApiResult.class);
        }
    }

    @Override
    public BaseResult readedMessageByUser(ReadedMessageRequest request) {
        try {
            //参数校验
            check(request);

            //执行业务
            int mid = messageRepository.updateStatus2Read(request.getMessageIds());
            //返回结果

            BaseResult result = ResultUtils.createSuccResult(BaseResult.class);
            return result;
        }catch(Exception e){
           return ResultUtils.createFailResultByException(e,BaseResult.class);
        }

    }

    /**
     * 请求转换成用户模型
     *
     * @param request
     * @return
     */
    private User convertReq2Model(UserCreateRequest request) {
        User user = new User();
        user.setName(request.getName());
        user.setPassword(request.getPassword());
        user.setAddress(request.getAddress());
        user.setTelphone(request.getTelphone());
        return user;
    }

    /**
     * 参数校验器
     *
     * @param request
     */
    private void check(UserCreateRequest request) {
        if (request == null) {
            throw new BaseException(ErrorCode.INVALID_PARAMETER, "用户创建请求不能为空");
        }
        if (StringUtils.isEmpty(request.getName())) {
            throw new BaseException(ErrorCode.INVALID_PARAMETER, "用户创建请求(用户名)不能为空");
        }
        if (StringUtils.isEmpty(request.getPassword())) {
            throw new BaseException(ErrorCode.INVALID_PARAMETER, "用户创建请求(密码)不能为空");
        }
    }
    private void check(ReadedMessageRequest request){
        if (request == null){
            throw new BaseException(ErrorCode.INVALID_PARAMETER,"消息请求不能为空");
        }
        if(request.getUserId() == null){
            throw new BaseException(ErrorCode.INVALID_PARAMETER, "用户ID不能为空");
        }
        if(StringUtils.isEmpty(request.getUserName())){
            throw new BaseException(ErrorCode.INVALID_PARAMETER, "用户名不能为空");
        }

    }
}
