package cn.no7player.service.model.request;

import cn.no7player.repository.model.enums.GKType;

import java.util.List;

/**
 * Created by tgs on 2018/8/16.
 */
public class GKPublishRequest {
    /**
     * 标题
     */
    private String title;
    /**
     * 图片
     */
    private String img;
    /**
     * 手办大类
     */
    private GKType type;
    /**
     * 参与人数
     */
    private int participantsNum;
    /**
     * 标签
     */
    private String labels;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public GKType getType() {
        return type;
    }

    public void setType(GKType type) {
        this.type = type;
    }

    public int getParticipantsNum() {
        return participantsNum;
    }

    public void setParticipantsNum(int participantsNum) {
        this.participantsNum = participantsNum;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }
}
