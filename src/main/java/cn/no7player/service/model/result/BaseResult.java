package cn.no7player.service.model.result;

/**
 * Created by tangenqing on 18/8/8.
 */
public abstract class BaseResult {
    private Boolean success;

    private String ErrCode;

    private String ErrMsg;

    public boolean isSuccess(){
        return success == Boolean.TRUE;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrCode() {
        return ErrCode;
    }

    public void setErrCode(String errCode) {
        ErrCode = errCode;
    }

    public String getErrMsg() {
        return ErrMsg;
    }

    public void setErrMsg(String errMsg) {
        ErrMsg = errMsg;
    }
}
