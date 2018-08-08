package cn.no7player.repository.converter;

import cn.no7player.model.GkParticipantRelation;
import cn.no7player.model.dataobject.GkParticipantRelationDO;

/**
 * 手办关系参与表模型 和do转换器
 * Created by tgs on 2018/8/8.
 */
public class GkParticipantRelationConverter {
    public static GkParticipantRelationDO convert2DO(GkParticipantRelation gkParticipantRelation) {
        GkParticipantRelationDO gkParticipantRelationDO = new GkParticipantRelationDO();
        return gkParticipantRelationDO;
    }

    public static GkParticipantRelation convert2Model(GkParticipantRelationDO gkParticipantRelationDO) {
        GkParticipantRelation gkParticipantRelation = new GkParticipantRelation();
        return gkParticipantRelation;

    }
}

