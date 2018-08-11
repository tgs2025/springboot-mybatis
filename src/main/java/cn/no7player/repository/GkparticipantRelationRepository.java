package cn.no7player.repository;
import cn.no7player.repository.model.GkParticipantRelation;
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
}
