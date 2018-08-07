/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package cn.no7player.model;

import cn.no7player.model.enums.GKType;

/**
 * @author enqing.teq
 * @version $Id: GarageKits, v0.1 2018年08月07日 下午12:49 enqing.teq Exp $
 */
public class GarageKits {
    /**
     * 手伴类型
     */
    private GKType type;


    /**
     * Getter method for property <tt>type</tt>.
     *
     * @return property value of type
     */
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
}