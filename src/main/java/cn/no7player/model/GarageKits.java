/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package cn.no7player.model;

import cn.no7player.model.enums.GKStatus;
import cn.no7player.model.enums.GKType;

/**
 * @author enqing.teq
 * @version $Id: GarageKits, v0.1 2018年08月07日 下午12:49 enqing.teq Exp $
 */
public class GarageKits {
    /*
    状态
     */
    private GKStatus status;
    /**
     * 手伴类型
     */
    private GKType type;


    /**
     * Getter method for property <tt>type</tt>.
     *
     * @return property value of type
     */
    public GKStatus getStatus() {
        return status;
    }


    public GKType getType() {
        return type;
    }

    /**
     * Setter method for property <tt>type</tt>.
     *
     * @param type value to be assigned to property type
     */
    public void setType(GKType type) {
        this.type = type;
    }

    public void setStatus(GKStatus status) {
        this.status = status;
    }
}