package cn.no7player.repository;

import cn.no7player.model.LabelInfo;

/**
 * Created by tgs on 2018/8/7.
 */
public interface LabelInfoRepository {
    /**
     * 新增用户
     *
     * @param labelInfo
     * @return 标签id
     */
    Long insert(LabelInfo labelInfo);

    /**
     * 基于用户id搜索
     *
     * @param id
     * @return 用户模型
     */
    LabelInfo queryById(long id);
}
