package cn.no7player.service.model.result;

/**
 * Created by tangenqing on 18/8/8.
 */
public class ApiResult extends BaseResult {

    /**
     * 返回操作的id
     */
    private Long id;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
