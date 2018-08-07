package cn.no7player.mapper;

/**
 * Created by tgs on 2018/8/7.
 */

import cn.no7player.model.dataobject.LabelInfoDO;


public interface LabelInfoMapper {


    long insertLabelInfo(LabelInfoDO labelInfoDO);

    /**
     * 基于id搜索label
     * @param id  label id
     * @return labeldo
     */
    LabelInfoDO selectById(Long id);

}
