package cn.no7player.repository.converter;

import cn.no7player.model.Lable_info;
import cn.no7player.model.dataobject.Lable_infoDO;

/**
 * Created by tgs on 2018/8/7.
 */
/**
 * 标签表 模型和do转换器
 * Created by tangenqing on 18/8/6.
 */
public class Lable_infoConverter {



        public static Lable_infoDO convert2DO(Lable_info lable_info) {
            Lable_infoDO lable_infoDO = new Lable_infoDO();
            if(lable_info.getId() != null){
                lable_infoDO.setId(lable_info.getId());
            }
            lable_infoDO.setName(lable_info.getName());
            lable_info.setIs_hot(lable_info.getIs_hot());

            lable_infoDO.setGmtCreate(lable_info.getGmtCreate());
            lable_infoDO.setGmtModified(lable_info.getGmtModofied());
            return lable_infoDO;
        }

        public static Lable_info convert2Model(Lable_infoDO lable_infoDO) {
            Lable_info lable_info = new Lable_info();
            if(lable_infoDO.getId() != null){
                lable_info.setId(lable_infoDO.getId());
            }
            lable_info.setName(lable_infoDO.getName());
            lable_info.setIs_hot(lable_infoDO.getIs_hot());
            lable_info.setGmtCreate(lable_infoDO.getGmtCreate());
            lable_info.setGmtModofied(lable_infoDO.getGmtModified());
            return lable_info;
        }
    }


