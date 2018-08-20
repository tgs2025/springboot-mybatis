package cn.no7player.service.magage.impl;

import cn.no7player.exceptions.BaseException;
import cn.no7player.exceptions.enums.ErrorCode;
import cn.no7player.repository.GarageKitsRepository;
import cn.no7player.repository.GkLabelRelationRepository;
import cn.no7player.repository.GkParticipantRelationRepository;
import cn.no7player.repository.LabelInfoRepository;
import cn.no7player.repository.model.GarageKits;
import cn.no7player.repository.model.GkLabelRelation;
import cn.no7player.repository.model.GkParticipantRelation;
import cn.no7player.repository.model.enums.GKType;
import cn.no7player.service.magage.GKManageService;
import cn.no7player.service.model.request.GKParticipatesRequest;
import cn.no7player.service.model.request.GKPublishRequest;
import cn.no7player.service.model.result.ApiResult;
import cn.no7player.service.model.result.BaseResult;
import cn.no7player.utils.ResultUtils;
import cn.no7player.utils.StringUtils;

/**
 * 手办管理服务实现类
 * Created by tgs on 2018/8/14.
 */
public class GKManageServicelmpl implements GKManageService {

    /**
     * 注释
     */

    private GarageKitsRepository garageKitsRepository;

    private GkParticipantRelationRepository gkParticipantRelationRepository;

    private GkLabelRelationRepository gkLabelRelationRepository;

    @Override
    public ApiResult gkPublish(GKPublishRequest request) {
        try {
            //参数校验
            check(request);
            //执行业务
            //字段不全  todo
            GarageKits garageKits = convertReq2Model(request);
            GkLabelRelation gkLabelRelation = convertReq2Model1(request);
            Long gid = garageKitsRepository.insert(garageKits);
            Long lid =gkLabelRelationRepository.insert(gkLabelRelation);
            //添加关系 label-手办关系

            //返回结果
            ApiResult result = ResultUtils.createSuccResult(ApiResult.class);
            return result;
        } catch (Exception e) {
            return ResultUtils.createFailResultByException(e, ApiResult.class);
        }
    }

    @Override
    public BaseResult gkParticipates(GKParticipatesRequest request) {
        try {
            //参数校验
            check(request);
            //执行业务
            GkParticipantRelation gkParticipantRelation = convertReq2Model(request);
            Long gid = gkParticipantRelationRepository.insert(gkParticipantRelation);
            //基于手办id 让参与人数+1
//            garageKitsRepository.addParticipant(request.getId());
            //如果达到人数 异步抽奖  TODO

            //返回结果
            BaseResult result = ResultUtils.createSuccResult(BaseResult.class);
            return result;
        } catch (Exception e) {
            return ResultUtils.createFailResultByException(e, BaseResult.class);
        }

    }

    /**
     * 请求转换成手办模型
     *
     * @param request
     * @return
     */
    private GarageKits convertReq2Model(GKPublishRequest request) {
        GarageKits garageKits = new GarageKits();
        garageKits.setTitle(request.getTitle());
        garageKits.setImg(request.getImg());
        garageKits.setParticipantsNum(request.getParticipantsNum());
        garageKits.setType(GKType.getByCode(request.getType()));
        garageKits.setPublisher(request.getPublisher());

        return garageKits;
    }
    private GkLabelRelation convertReq2Model1(GKPublishRequest request){
        GkLabelRelation gkLabelRelation = new GkLabelRelation();
        gkLabelRelation.setLabelName(request.getLabels());

    }
    private GkParticipantRelation convertReq2Model(GKParticipatesRequest request) {
        GkParticipantRelation gkParticipantRelation = new GkParticipantRelation();
        gkParticipantRelation.setParticipantId(request.getId());
        gkParticipantRelation.setParticipantName(request.getName());

        return gkParticipantRelation;
    }


    private void check(GKPublishRequest request) {
        if (request == null) {
            throw new BaseException(ErrorCode.INVALID_PARAMETER, "发布手办请求不能为空");
        }
        if (StringUtils.isEmpty(request.getTitle())) {
            throw new BaseException(ErrorCode.INVALID_PARAMETER, "手办标题不能为空");
        }
        if (StringUtils.isEmpty(request.getImg())) {
            throw new BaseException(ErrorCode.INVALID_PARAMETER, "图片不能为空");
        }

        if (GKType.getByCode(request.getType()) == null) {
            throw new BaseException(ErrorCode.INVALID_PARAMETER, "类型错误");
        }
        if (request.getParticipantsNum() < 1) {
            throw new BaseException(ErrorCode.INVALID_PARAMETER, "参与人数不能为少于1");
        }

        if ((request.getLabels() == null)) {
            throw new BaseException(ErrorCode.INVALID_PARAMETER, "标签不能为空");
        }
        if (StringUtils.isEmpty(request.getPublisher())) {
            throw new BaseException(ErrorCode.INVALID_PARAMETER, "发布者不能为空");
        }
    }

    private void check(GKParticipatesRequest request) {
        if (request == null) {
            throw new BaseException(ErrorCode.INVALID_PARAMETER, "参与手办请求不能为空");
        }
        //todo
    }
}
