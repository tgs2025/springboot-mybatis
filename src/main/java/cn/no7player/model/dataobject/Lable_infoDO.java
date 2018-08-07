package cn.no7player.model.dataobject;

/**
 * Created by tgs on 2018/8/7.
 */
import java.util.Date;
public class Lable_infoDO {
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
    private Date gmtModified;

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

    public void setIs_hot(String is_hot) { this.is_hot = is_hot;
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

