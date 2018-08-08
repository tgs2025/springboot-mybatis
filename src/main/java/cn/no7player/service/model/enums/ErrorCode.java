package cn.no7player.service.model.enums;

/**
 * Created by tangenqing on 18/8/8.
 */
public enum ErrorCode {
    INVALID_PARAMETER("INVALID_PARAMETER", "参数错误"),
    ;
    private String code;
    private String desc;

    ErrorCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    /**
     * @param code
     * @return
     */
    public static ErrorCode getByCode(String code) {
        for (ErrorCode value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
