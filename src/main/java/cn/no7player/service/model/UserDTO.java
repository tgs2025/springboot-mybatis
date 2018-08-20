package cn.no7player.service.model;

import cn.no7player.repository.model.Message;
import cn.no7player.repository.model.User;

import java.util.List;

/**
 * Created by tgs on 2018/8/20.
 */
public class UserDTO {
    /**
     * 用户基本信息
     */
    private User user;

    /**
     * 用户未读消息，为空表示没有未读消息
     */
    private List<Message> unreadMessage;

    /**
     * 参与手办的数量
     */
    private int participateNum;

    /**
     * 发布手办的数量
     */
    private int publishNum;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Message> getUnreadMessage() {
        return unreadMessage;
    }

    public void setUnreadMessage(List<Message> unreadMessage) {
        this.unreadMessage = unreadMessage;
    }

    public int getParticipateNum() {
        return participateNum;
    }

    public void setParticipateNum(int participateNum) {
        this.participateNum = participateNum;
    }

    public int getPublishNum() {
        return publishNum;
    }

    public void setPublishNum(int publishNum) {
        this.publishNum = publishNum;
    }
}
