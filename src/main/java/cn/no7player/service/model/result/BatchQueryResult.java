package cn.no7player.service.model.result;

import java.util.List;

/**
 * Created by tgs on 2018/8/8.
 */
public  class BatchQueryResult<T>  extends BaseResult {

    private List<T> values;

    public List<T> getValues() {
        return values;
    }

    public void setValues(List<T> values) {
        this.values = values;
    }
}
