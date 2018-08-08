/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package cn.no7player.repository.converter;

import cn.no7player.model.GarageKits;
import cn.no7player.model.dataobject.GarageKitsDO;
import cn.no7player.model.enums.GKStatus;
import cn.no7player.model.enums.GKType;

/**
 * 手办表 模型和do转换器
 * @author enqing.teq
 * @version $Id: GarageKitsConverter, v0.1 2018年08月07日 下午12:55 enqing.teq Exp $
 */
public class GarageKitsConverter {

    public static GarageKitsDO convert2DO(GarageKits garageKits){
        if(garageKits == null){
            return null;
        }
        GarageKitsDO garageKitsDO = new GarageKitsDO();
        garageKitsDO.setId(garageKits.getId());
        garageKitsDO.setTitle(garageKits.getTitle());
        garageKitsDO.setParticipantsNum(garageKits.getParticipantsNum());
        garageKitsDO.setCurParticipantsNum(garageKits.getCurParticipantsNum());
        garageKitsDO.setPublisher(garageKits.getPublisher());
        garageKitsDO.setTargetName(garageKits.getTargetName());
        if (garageKits.getGkStatus() != null){
            garageKitsDO.setGkStatus(garageKits.getGkStatus().getCode());
        }
        garageKitsDO.setImg(garageKits.getImg());
        if(garageKits.getType() != null){
            garageKitsDO.setType(garageKits.getType().getCode());
        }
        garageKitsDO.setGmtCreate(garageKits.getGmtCreate());
        garageKitsDO.setGmtModified(garageKits.getGmtModified());
        return garageKitsDO;
    }

    public static GarageKits convert2Model(GarageKitsDO garageKitsDO){
        if(garageKitsDO == null){
            return null;
        }
        GarageKits garageKits = new GarageKits();
        garageKits.setId(garageKitsDO.getId());
        garageKits.setTitle(garageKitsDO.getTitle());
        garageKits.setParticipantsNum(garageKitsDO.getParticipantsNum());
        garageKits.setCurParticipantsNum(garageKitsDO.getCurParticipantsNum());
        garageKits.setPublisher(garageKitsDO.getPublisher());
        garageKits.setTargetName(garageKitsDO.getTargetName());

        garageKits.setGkStatus(GKStatus.getByCode(garageKitsDO.getGkStatus()));

        garageKits.setImg(garageKitsDO.getImg());

        garageKits.setType(GKType.getByCode(garageKitsDO.getType()));

        garageKits.setGmtCreate(garageKitsDO.getGmtCreate());
        garageKits.setGmtModified(garageKitsDO.getGmtModified());

        return garageKits;
    }

}