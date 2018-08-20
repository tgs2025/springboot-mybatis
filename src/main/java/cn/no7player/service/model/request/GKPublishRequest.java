package cn.no7player.service.model.request;

import cn.no7player.repository.model.LabelInfo;
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
    private String type;
    /**
     * 参与人数
     */
    private int participantsNum;
    /**
     * 标签
     */
    private List<LabelInfo> labels;
    /**
     * 发布者
     */
    private  String publisher;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getParticipantsNum() {
        return participantsNum;
    }

    public void setParticipantsNum(int participantsNum) {
        this.participantsNum = participantsNum;
    }

    public List<LabelInfo> getLabels() {
        return labels;
    }

    public void setLabels(List<LabelInfo> labels) {
        this.labels = labels;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
