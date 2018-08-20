package cn.no7player.service.model.request;

/**
 * Created by tgs on 2018/8/19.
 */
public class GKParticipatesRequest {
    /**
     * 参与者id
     */
    //todo 类型
    private int id;
    /**
     * 参与者name
     */
    private String name;

    //todo 手办信息 发布者信息


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
