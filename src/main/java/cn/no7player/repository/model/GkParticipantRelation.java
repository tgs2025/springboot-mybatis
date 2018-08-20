package cn.no7player.repository.model;

import cn.no7player.repository.model.enums.GPRIsTarget;

import java.util.Date;

/**
 * Created by tgs on 2018/8/8.
 */
public class GkParticipantRelation {
    /**
     * 关系id
     */
    private Long id;
    /**
     * 手办id
     */
    private int gkId;

    /**
     * 发布者
     */
    private String publishName;
    /**
     * 参与者id
     */
    private int participantId;
    /**
     * 参与者
     */
    private String participantName;
    /**
     * 是否中奖
     */
    private GPRIsTarget isTarget;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getGkId() {
        return gkId;
    }

    public void setGkId(int gkId) {
        this.gkId = gkId;
    }

    public String getPublishName() {
        return publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public GPRIsTarget getIsTarget() {
        return isTarget;
    }

    public void setIsTarget(GPRIsTarget isTarget) {
        this.isTarget = isTarget;
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
                .append(gkId).append(", ")
                .append(publishName == null ? "-" : publishName).append(", ")
                .append(participantId).append(", ")
                .append(participantName == null ? "-" : participantName).append(", ")
                .append(isTarget == null ? "-" : isTarget).append(", ")
                .append(gmtCreate == null ? "-" : getGmtCreate()).append(", ")
                .append(gmtModified == null ? "-" : gmtModified);
        return sb.toString();
    }

}
