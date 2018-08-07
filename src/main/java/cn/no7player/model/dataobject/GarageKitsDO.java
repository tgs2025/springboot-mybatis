/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package cn.no7player.model.dataobject;

import javax.xml.crypto.Data;

/**
 * 手伴do
 *
 * @author enqing.teq
 * @version $Id: GarageKitsDO, v0.1 2018年08月07日 下午12:49 enqing.teq Exp $
 */
public class GarageKitsDO {
    /**
     * 手办id
     */
    private Long id;
    /**
     * 手办标题
     */
    private String title;
    /**
     * 参与人数
     */
    private int participants_num;
    /**
    当前参与人数
     */
    private int cur_participants_num;

    private String publisher;
    /*
    中奖者
     */
    private String target_name;
    /*
    状态
     */
    private String status;
    /*
    图片
     */
    private String img;
    /**
     * 手伴类型
     */
    private String type;
    /*
    创建时间
     */
    private Data gmt_create;
    /*
    修改时间
     */
    private Data gmt_modified;


    /**
     * Getter method for property <tt>type</tt>.
     *
     * @return property value of type
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getParticipants_num() {
        return participants_num;
    }

    public void setParticipants_num(int participants_num) {
        this.participants_num = participants_num;
    }

    public int getCur_participants_num() {
        return cur_participants_num;
    }

    public void setCur_participants_num(int cur_participants_num) {
        this.cur_participants_num = cur_participants_num;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTarget_name() {
        return target_name;
    }

    public void setTarget_name(String target_name) {
        this.target_name = target_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getType() {
        return type;
    }

    /**
     * Setter method for property <tt>type</tt>.
     *
     * @param type value to be assigned to property type
     */
    public void setType(String type) {
        this.type = type;
    }

    public Data getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Data gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Data getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Data gmt_modified) {
        this.gmt_modified = gmt_modified;
    }
}