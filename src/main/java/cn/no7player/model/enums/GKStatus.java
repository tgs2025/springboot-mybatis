package cn.no7player.model.enums;

/**
 * Created by tgs on 2018/8/7.
 */
public enum GKStatus {
    PROCESS("PROCSEE", "进行中"),

    FINISH("FINSIH", "已结束"),
    ;
    private String code;

    /**
     * 描述
     */
    private String desc;

    GKStatus(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    /**
     * @param code
     * @return
     */
    public static GKStatus getByCode(String code) {
        for (GKStatus status : values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }
}
