package cn.no7player.service.model.request;

/**
 * Created by tgs on 2018/8/11.
 */
public class UpdateUserRequest {
    /**
     * 用户id
     */
    private Long id;

    /**
     * 电话
     */
    private String telephone;
    /**
     * 用户地址
     */
    private  String Address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
