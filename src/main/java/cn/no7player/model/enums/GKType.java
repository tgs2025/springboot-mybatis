/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package cn.no7player.model.enums;

/**
 * 手伴类型
 * @author enqing.teq
 * @version $Id: GKType, v0.1 2018年08月07日 下午12:50 enqing.teq Exp $
 */
public enum GKType {

    GAME("GAME", "游戏"),

    ANIME("ANIME", "动漫"),

    OTHERS("OTHERS", "其他"),

    ;

    private String code;

    /**
     * 描述
     */
    private String desc;

    GKType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    /**
     * @param code
     * @return
     */
    public static GKType getByCode(String code) {
        for (GKType type : values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }
        return null;
    }
}