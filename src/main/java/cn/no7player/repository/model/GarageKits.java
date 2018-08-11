/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package cn.no7player.repository.model;

import cn.no7player.repository.model.enums.GKStatus;
import cn.no7player.repository.model.enums.GKType;

import java.util.Date;

/**
 * @author enqing.teq
 * @version $Id: GarageKits, v0.1 2018年08月07日 下午12:49 enqing.teq Exp $
 */
public class GarageKits {

    /**
     * 手办id
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 参与人数
     */
    private int participantsNum;

    /**
     * 当前参与人数
     */
    private int curParticipantsNum;

    /**
     * 发布者
     */
    private String publisher;

    /**
     * 中奖者
     */
    private String targetName;

    /**
     * 状态
     */
    private GKStatus gkStatus;

    /**
     * 图片
     */
    private String img;

    /**
     * 手伴类型
     */
    private GKType type;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;


    /**
     * Getter method for property <tt>type</tt>.
     *
     * @return property value of type
     */
    public GKStatus getGkStatus() {
        return gkStatus;
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

    public void setGkStatus(GKStatus gkStatus) {
        this.gkStatus = gkStatus;
    }

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

    public int getParticipantsNum() {
        return participantsNum;
    }

    public void setParticipantsNum(int participantsNum) {
        this.participantsNum = participantsNum;
    }

    public int getCurParticipantsNum() {
        return curParticipantsNum;
    }

    public void setCurParticipantsNum(int curParticipantsNum) {
        this.curParticipantsNum = curParticipantsNum;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    // todo 添加一个 工具类 用于所有的model
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(id == null ? "-" : id).append(", ")
                .append(title == null ? "-" : title).append(", ")
                .append(participantsNum).append(", ")
                .append(curParticipantsNum).append(", ")
                .append(publisher == null ? "-" : publisher).append(", ")
                .append(targetName == null ? "-" : targetName).append(",")
                .append(gkStatus == null ? "-" : gkStatus).append(", ")
                .append(img == null ? "-" : img).append(", ")
                .append(type == null ? "-" : type).append(", ")
                .append(gmtCreate == null ? "-" : getGmtCreate()).append(", ")
                .append(gmtModified == null ? "-" : gmtModified);
        return sb.toString();
    }
}