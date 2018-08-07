package cn.no7player.repository;

import cn.no7player.model.Lable_info;

/**
 * Created by tgs on 2018/8/7.
 */
public interface Lable_infoRepository {
    /**
     * 新增用户
     *
     * @param lable_info
     * @return 标签id
     */
    Long insert(Lable_info lable_info);

    /**
     * 基于用户id搜索
     *
     * @param id
     * @return 用户模型
     */
    Lable_info queryById(long id);
}
