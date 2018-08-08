package cn.no7player.mapper;

/**
 * Created by tgs on 2018/8/7.
 */

import cn.no7player.model.dataobject.LabelInfoDO;


public interface LabelInfoMapper {
    /**
     * 插入标签
     * @param labelInfoDO
     * @return 标签自增id
     */

    long insertLabelInfo(LabelInfoDO labelInfoDO);

    /**
     * 基于id搜索labelInfo
     * @param id  labelInfo id
     * @return
     */
    LabelInfoDO selectById(Long id);

}
