package cn.no7player.service.model.request;

/**
 * Created by tgs on 2018/8/19.
 */
public class GKParticipatesRequest {
    /**
     * 参与者id
     */
    private int id;
    /**
     * 参与者name
     */
    private String name;


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
