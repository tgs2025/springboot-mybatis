package cn.no7player.mapper;
import cn.no7player.repository.model.dataobject.GkParticipantRelationDO;

import java.util.List;

/**
 * Created by tgs on 2018/8/8.
 */
public interface GkParticipantRelationMapper {
    /**
     * 插入手办参与关系
     * @param gkParticipantRelationDO
     * @return
     */
    long insertGkParticipantRelation(GkParticipantRelationDO gkParticipantRelationDO);
    /**
     * 基于id搜索gkParticipantRelation
     * @param id  gkParticipantRelation id
     * @return
     */
    GkParticipantRelationDO selectById(Long id);

    /**
     * 返回最新交易成功的信息
     * @param size
     * @return
     */
    List<GkParticipantRelationDO> selectSuccRelationBySize(Integer size);
}
