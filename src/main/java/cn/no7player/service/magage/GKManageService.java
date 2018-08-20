package cn.no7player.service.magage;

import cn.no7player.service.model.request.GKPublishRequest;
import cn.no7player.service.model.request.GKParticipatesRequest;
import cn.no7player.service.model.result.ApiResult;
import cn.no7player.service.model.result.BaseResult;

/**
 * Created by tgs on 2018/8/9.
 */
public interface GKManageService {
    //发布手办服务  两张表

    /**
     * 发布手办
     * @param gkPublishRequest
     * @return
     */
    ApiResult gkPublish(GKPublishRequest gkPublishRequest);
    //参与手办服务

    /**
     * 参与手办
     * @param gkParticipatesRequest
     * @return
     */
    BaseResult gkParticipates(GKParticipatesRequest gkParticipatesRequest);

    //可能异常:已经参与过了,  达到人数了,  已经结束 事务



}
