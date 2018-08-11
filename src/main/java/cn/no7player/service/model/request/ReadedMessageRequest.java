package cn.no7player.service.model.request;

import java.util.List;

/**
 * Created by tgs on 2018/1/1.
 */
public class ReadedMessageRequest {
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 用户名
     */
    private  String userName;
    /**
     * 消息
     */
    private List<Long>  messageIds;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Long> getMessageIds() {
        return messageIds;
    }

    public void setMessageIds(List<Long> messageIds) {
        this.messageIds = messageIds;
    }
}
