package cn.no7player.model;

import java.util.Date;

/**
 * Created by zl on 2015/8/27.
 */
public class User {
    /**
     * 用户id
     */
    private long id;
    /**
     * 用户名
     */
    private String name ;
    /**
     * 密码
     */
    private String password;
    /**
     * 电话
     */
    private String telphone;
    /**
     * 地址
     */
    private String address;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModofied;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
}
