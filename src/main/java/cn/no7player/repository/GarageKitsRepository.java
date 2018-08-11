package cn.no7player.repository;

import cn.no7player.repository.model.GarageKits;

/**
 * Created by tgs on 2018/8/8.
 */
public interface GarageKitsRepository {
    /**
     * 新增手办
     *
     * @param garageKits
     * @return 手办id
     */
   Long insert(GarageKits garageKits);

    /**
     * 基于标签id搜索
     *
     * @param id
     * @return 标签模型
     */
    GarageKits queryById(long id);
}
