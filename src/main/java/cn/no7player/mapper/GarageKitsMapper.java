package cn.no7player.mapper;
import cn.no7player.repository.model.dataobject.GarageKitsDO;
/**
 * Created by tgs on 2018/8/8.
 */
public interface GarageKitsMapper {
    /**
     * 插入手办
     * @param garageKitsDO
     * @return 手办自增id
     */

    long insertGarageKits(GarageKitsDO garageKitsDO);

    /**
     * 基于id搜索garageKits
     * @param id  garageKits id
     * @return
     */
    GarageKitsDO selectById(Long id);
}
