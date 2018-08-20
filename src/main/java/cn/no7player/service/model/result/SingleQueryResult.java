package cn.no7player.service.model.result;

/**
 * Created by tangenqing on 18/8/20.
 */
public class SingleQueryResult<T> extends BaseResult {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

