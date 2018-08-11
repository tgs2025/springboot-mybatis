package cn.no7player.repository.converter;

import cn.no7player.repository.model.GkLabelRelation;
import cn.no7player.repository.model.dataobject.GkLabelRelationDO;

/**
 * 手办标签关系表模型和do转换器
 * Created by tgs on 2018/8/8.
 */
public class GkLabelRelationConverter {
    public static GkLabelRelationDO convert2DO(GkLabelRelation gkLabelRelation) {
        GkLabelRelationDO gkLabelRelationDO = new GkLabelRelationDO();

        gkLabelRelationDO.setId(gkLabelRelation.getId());
        gkLabelRelationDO.setGkId(gkLabelRelation.getGkId());
        gkLabelRelationDO.setLabelId(gkLabelRelation.getLabelId());
        gkLabelRelationDO.setLabelName(gkLabelRelation.getLabelName());
        gkLabelRelationDO.setGmtCreate(gkLabelRelation.getGmtCreate());
        gkLabelRelationDO.setGmtModified(gkLabelRelation.getGmtModified());
        return gkLabelRelationDO;
    }

    public static GkLabelRelation convert2Model(GkLabelRelationDO gkLabelRelationDO) {
        GkLabelRelation gkLabelRelation = new GkLabelRelation();

        gkLabelRelation.setId(gkLabelRelationDO.getId());

        gkLabelRelation.setGkId(gkLabelRelationDO.getGkId());
        gkLabelRelation.setLabelId(gkLabelRelationDO.getLabelId());
        gkLabelRelation.setLabelName(gkLabelRelationDO.getLabelName());

        gkLabelRelation.setGmtCreate(gkLabelRelationDO.getGmtCreate());
        gkLabelRelation.setGmtModified(gkLabelRelationDO.getGmtModified());
        return gkLabelRelation;

    }
}
