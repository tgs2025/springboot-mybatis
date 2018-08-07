package cn.no7player.model;

import java.util.Date;

/**
 * Created by tgs on 2018/8/7.
 */
public class Lable_info {
    /**
     * 标签id
     */
    private Long id;
    /**
     * 标签名
     */
    private String name;
    /**
     * 是否热门
     */
    private String is_hot;

    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModofied;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIs_hot() {
        return is_hot;
    }

    public void setIs_hot(String is_hot) {
        this.is_hot = is_hot;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModofied() {
        return gmtModofied;
    }

    public void setGmtModofied(Date gmtModofied) {
        this.gmtModofied = gmtModofied;
    }

    // todo 添加一个 工具类 用于所有的model
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(id == null ? "-" : id).append(", ")
                .append(name == null ? "-" : name).append(", ")
                .append(is_hot ==null ? "-" : is_hot).append(", ")
                .append(gmtCreate == null ? "-" : getGmtCreate()).append(", ")
                .append(gmtModofied == null ? "-" : gmtModofied);
        return sb.toString();
    }
}
