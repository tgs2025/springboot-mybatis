package cn.no7player.mapper;

/**
 * Created by tgs on 2018/8/7.
 */
import cn.no7player.model.dataobject.Lable_infoDO;


public interface Lable_infoMapper {    /**
 * 插入用户
 *
 * @param lable_infoDO
 * @return 用户自增id
 */
long insertLable_info(Lable_infoDO lable_infoDO);

    /**
     * 基于用户id搜索
     *
     * @param id
     * @return
     */
    Lable_infoDO selectById(Long id);

}
