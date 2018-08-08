package cn.no7player.repository.converter;

import cn.no7player.model.GkParticipantRelation;
import cn.no7player.model.dataobject.GkParticipantRelationDO;
import cn.no7player.model.enums.GPRIsTarget;

/**
 * 手办关系参与表模型 和do转换器
 * Created by tgs on 2018/8/8.
 */
public class GkParticipantRelationConverter {
    public static GkParticipantRelationDO convert2DO(GkParticipantRelation gkParticipantRelation) {
        if(gkParticipantRelation == null){
            return null;
        }
        GkParticipantRelationDO gkParticipantRelationDO = new GkParticipantRelationDO();
        gkParticipantRelationDO.setId(gkParticipantRelation.getId());
        gkParticipantRelationDO.setGkId(gkParticipantRelation.getGkId());
        gkParticipantRelationDO.setPublishName(gkParticipantRelation.getPublishName());
        gkParticipantRelationDO.setParticipantId(gkParticipantRelation.getParticipantId());
        gkParticipantRelationDO.setParticipantName(gkParticipantRelation.getParticipantName());
        if (gkParticipantRelation.getIsTarget() != null){
            gkParticipantRelationDO.setIsTarget(gkParticipantRelation.getIsTarget().getCode());
        }

        gkParticipantRelationDO.setGmtCreate(gkParticipantRelation.getGmtCreate());
        gkParticipantRelationDO.setGmtModified(gkParticipantRelation.getGmtModified());
        return gkParticipantRelationDO;
    }

    public static GkParticipantRelation convert2Model(GkParticipantRelationDO gkParticipantRelationDO) {
        if(gkParticipantRelationDO == null){
            return null;
        }
        GkParticipantRelation gkParticipantRelation = new GkParticipantRelation();
        gkParticipantRelation.setId(gkParticipantRelationDO.getId());
        gkParticipantRelation.setGkId(gkParticipantRelationDO.getGkId());
        gkParticipantRelation.setPublishName(gkParticipantRelationDO.getPublishName());
        gkParticipantRelation.setParticipantId(gkParticipantRelationDO.getParticipantId());
        gkParticipantRelation.setParticipantName(gkParticipantRelationDO.getParticipantName());
        gkParticipantRelation.setIsTarget(GPRIsTarget.getByCode(gkParticipantRelationDO.getIsTarget()));


        gkParticipantRelation.setGmtCreate(gkParticipantRelationDO.getGmtCreate());
        gkParticipantRelation.setGmtModified(gkParticipantRelationDO.getGmtModified());
        return gkParticipantRelation;

    }
}

