package cn.no7player.repository;

import cn.no7player.repository.model.GkLabelRelation;

/**
 * Created by tgs on 2018/8/8.
 */
public interface GkLabelRelationRepository {
    /**
     * 新增手办标签关系
     *
     * @param gkLabelRelation
     * @return 关系id
     */
    Long insert(GkLabelRelation gkLabelRelation);

    /**
     * 基于用户id搜索
     *
     * @param id
     * @return 用户模型
     */
    GkLabelRelation queryById(long id);
}
