package cn.no7player.mapper;

import cn.no7player.model.dataobject.GkLabelRelationDO;

/**
 * Created by tgs on 2018/8/8.
 */
public interface GkLabelRelationMapper {
    /**
     * 插入手办标签关系
     *
     * @param gkLabelRelationDO
     * @return 手办标签关系自增id
     */
    long insertGkLabelRelation(GkLabelRelationDO gkLabelRelationDO);

    /**
     * 基于手办标签关系id搜索
     *
     * @param id
     * @return
     */
    GkLabelRelationDO selectById(Long id);
}
