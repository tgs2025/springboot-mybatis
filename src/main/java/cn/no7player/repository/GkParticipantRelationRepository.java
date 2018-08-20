package cn.no7player.repository;

import cn.no7player.repository.model.GkParticipantRelation;

import java.util.List;

/**
 * Created by tgs on 2018/8/8.
 */
public interface GkParticipantRelationRepository {
    /**
     * 新增手办参与关系
     *
     * @param gkParticipantRelation
     * @return 关系id
     */
    Long insert(GkParticipantRelation gkParticipantRelation);

    /**
     * 基于用户id搜索
     *
     * @param id
     * @return 用户模型
     */
    GkParticipantRelation queryById(long id);

    /**
     * 返回最新的成功交易
     * @param size
     * @return
     */
    //todo 未测试
    List<GkParticipantRelation> queryNewSuccTrade(int size);
}
