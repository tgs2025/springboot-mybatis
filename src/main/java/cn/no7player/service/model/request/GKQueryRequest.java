package cn.no7player.service.model.request;

import java.util.List;

/**
 * Created by tgs on 2018/8/8.
 */
public class GKQueryRequest {

    /**
     * 偏移量
     */
    private int page = 1;

    /**
     * size
     */
    private int size = 100;

    /**
     * 类型[选题]
     * 按类型查时必填
     */
    private String type;

    /**
     * 选填
     * 标签筛选
     */
    private List<String> labels;

    /**
     * 用户id
     * 为空说明用户还没登录
     */
    private String uid;

    //getter and setter

}
