/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package cn.no7player.repository.converter;

import cn.no7player.model.GarageKits;
import cn.no7player.model.dataobject.GarageKitsDO;
import cn.no7player.model.enums.GKType;

/**
 * @author enqing.teq
 * @version $Id: GarageKitsConverter, v0.1 2018年08月07日 下午12:55 enqing.teq Exp $
 */
public class GarageKitsConverter {

    public GarageKitsDO convert2DO(GarageKits garageKits){
        GarageKitsDO garageKitsDO = new GarageKitsDO();
        if(garageKits.getType() != null){
            garageKitsDO.setType(garageKits.getType().getCode());
        }
        return garageKitsDO;
    }

    public GarageKits convert2Model(GarageKitsDO garageKitsDO){
        GarageKits garageKits = new GarageKits();

        garageKits.setType(GKType.getByCode(garageKitsDO.getType()));

        return garageKits;
    }

}