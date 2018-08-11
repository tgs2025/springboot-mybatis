package cn.no7player.repository.converter;

import cn.no7player.repository.model.LabelInfo;
import cn.no7player.repository.model.dataobject.LabelInfoDO;

/**
 * Created by tgs on 2018/8/7.
 */

/**
 * 标签表 模型和do转换器
 * Created by tangenqing on 18/8/6.
 */
public class LabelInfoConverter {


    public static LabelInfoDO convert2DO(LabelInfo labelInfo) {
        LabelInfoDO labelInfoDO = new LabelInfoDO();
//            if(labelInfo.getId() != null){
        labelInfoDO.setId(labelInfo.getId());
//            }
        labelInfoDO.setName(labelInfo.getName());
        labelInfoDO.setIsHot(labelInfo.getIsHot());

        labelInfoDO.setGmtCreate(labelInfo.getGmtCreate());
        labelInfoDO.setGmtModified(labelInfo.getGmtModified());
        return labelInfoDO;
    }

    public static LabelInfo convert2Model(LabelInfoDO labelInfoDO) {
        LabelInfo labelInfo = new LabelInfo();
//            if(labelInfoDO.getId() != null){
        labelInfo.setId(labelInfoDO.getId());
//            }
        labelInfo.setName(labelInfoDO.getName());
        labelInfo.setIsHot(labelInfoDO.getIsHot());
        labelInfo.setGmtCreate(labelInfoDO.getGmtCreate());
        labelInfo.setGmtModified(labelInfoDO.getGmtModified());
        return labelInfo;
    }
}


