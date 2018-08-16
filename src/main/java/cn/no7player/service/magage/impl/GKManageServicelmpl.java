package cn.no7player.service.magage.impl;

import cn.no7player.exceptions.BaseException;
import cn.no7player.exceptions.enums.ErrorCode;
import cn.no7player.repository.GarageKitsRepository;
import cn.no7player.repository.LabelInfoRepository;
import cn.no7player.repository.model.GarageKits;
import cn.no7player.repository.model.LabelInfo;
import cn.no7player.service.magage.GKManageService;
import cn.no7player.service.model.request.GKPublishRequest;
import cn.no7player.service.model.result.BaseResult;
import cn.no7player.utils.ResultUtils;
import cn.no7player.utils.StringUtils;

/**
 * 手办管理服务实现类
 * Created by tgs on 2018/8/14.
 */
public class GKManageServicelmpl implements GKManageService{
    private GarageKitsRepository garageKitsRepository;
    private LabelInfoRepository labelInfoRepository;
    @Override
    public BaseResult gkPublish(GKPublishRequest request) {
        try {
            //参数校验
            check(request);
            //执行业务
            GarageKits garageKits = convertReq2Model(request);
            LabelInfo labelInfo =convertReq2Model1(request);
            Long gid = garageKitsRepository.insert(garageKits);
            Long lid = labelInfoRepository.insert(labelInfo);
            //返回结果
            BaseResult result = ResultUtils.createSuccResult(BaseResult.class);
            return result;
        } catch (Exception e) {
            return ResultUtils.createFailResultByException(e,BaseResult.class);
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
            garageKits.setType(request.getType());

            return garageKits;
        }
    private  LabelInfo convertReq2Model1(GKPublishRequest request){
        LabelInfo labelInfo =new LabelInfo();
        labelInfo.setName(request.getLabels());

    }

    private void check(GKPublishRequest request){
        if (request == null){
            throw new BaseException(ErrorCode.INVALID_PARAMETER,"发布手办请求不能为空");
        }
        if(StringUtils.isEmpty(request.getTitle())){
            throw new BaseException(ErrorCode.INVALID_PARAMETER, "手办标题不能为空");
        }
        if(StringUtils.isEmpty(request.getImg())){
            throw new BaseException(ErrorCode.INVALID_PARAMETER, "图片不能为空");
        }
        if(){
            throw new BaseException(ErrorCode.INVALID_PARAMETER, "参与人数不能为空");
        }

        if(StringUtils.isEmpty(request.getType())){
            throw new BaseException(ErrorCode.INVALID_PARAMETER, "类型不能为空");
        }
        if(StringUtils.isEmpty(request.getLabels())){
            throw new BaseException(ErrorCode.INVALID_PARAMETER, "标签不能为空");
        }
}
}
