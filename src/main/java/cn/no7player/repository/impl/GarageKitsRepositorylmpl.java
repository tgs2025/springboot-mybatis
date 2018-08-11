package cn.no7player.repository.impl;

import cn.no7player.repository.GarageKitsRepository;
import org.springframework.stereotype.Service;
import cn.no7player.mapper.GarageKitsMapper;

import cn.no7player.repository.model.GarageKits;
import cn.no7player.repository.model.dataobject.GarageKitsDO;
import cn.no7player.repository.converter.GarageKitsConverter;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.Date;
/**
 * Created by tgs on 2018/8/8.
 */
@Service
public class GarageKitsRepositorylmpl implements GarageKitsRepository{
    @Autowired
    private GarageKitsMapper garageKitsMapper;

    @Override
    public Long insert(GarageKits garageKits) {
        garageKits.setGmtCreate(new Date());
        garageKits.setGmtModified(new Date());
//            System.out.println(label_info);
        GarageKitsDO garageKitsDO = GarageKitsConverter.convert2DO(garageKits);
        return garageKitsMapper.insertGarageKits(garageKitsDO);
    }

    @Override
    public GarageKits queryById(long id) {
        GarageKitsDO garageKitsDO = garageKitsMapper.selectById(id);
        return GarageKitsConverter.convert2Model(garageKitsDO);
    }
}


