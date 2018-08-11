package cn.no7player.repository.model.dataobject;

import java.util.Date;

/**
 * 手办标签关系表DO
 * Created by tgs on 2018/8/8.
 */
public class GkLabelRelationDO {
    /**
     * 手办标签id
     */
    private Long id;
    /**
     * 手办id
     */
    private int gkId;
    /**
     * 标签id
     */
    private int labelId;
    /**
     * 标签名
     */
    private String labelName;
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

    public int getLabelId() {
        return labelId;
    }

    public void setLabelId(int labelId) {
        this.labelId = labelId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
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
}
