package cn.no7player.service.model.request;

/**
 * Created by tgs on 2018/8/11.
 */
public class UpdateAddressRequest {
    /**
     * 用户id
     */
    private Long id;
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
