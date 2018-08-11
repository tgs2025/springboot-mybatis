package cn.no7player.repository.model;

import cn.no7player.repository.model.enums.MessageStatus;

import java.util.Date;

/**
 * Created by tgs on 2018/8/8.
 */
public class Message {
    /**
     * 消息id
     */
    private Long id;
    /**
     * 用户id
     */
    private int userId;
    /**
     * 消息内容
     */
    private String content;
    /**
     * 状态
     */
    private MessageStatus messageStatus;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MessageStatus getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(MessageStatus messageStatus) {
        this.messageStatus = messageStatus;
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
                .append(userId).append(", ")
                .append(messageStatus == null ? "-" : messageStatus).append(", ")
                .append(content == null ? "-" : content).append(", ")
                .append(gmtCreate == null ? "-" : getGmtCreate()).append(", ")
                .append(gmtModified == null ? "-" : gmtModified);
        return sb.toString();
    }
}
