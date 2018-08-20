package cn.no7player.repository;

import cn.no7player.repository.model.LabelInfo;

import java.util.List;

/**
 * Created by tgs on 2018/8/7.
 */
public interface LabelInfoRepository {
    /**
     * 新增标签
     *
     * @param labelInfo
     * @return 标签id
     */
    Long insert(LabelInfo labelInfo);



    /**
     * 基于标签id搜索
     *
     * @param id
     * @return 标签模型
     */
    LabelInfo queryById(long id);
}
