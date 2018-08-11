package cn.no7player.repository.model.enums;

/**
 * 手办状态
 * Created by tgs on 2018/8/7.
 */
public enum GKStatus {
    PROCESS("PROCESS", "进行中"),

    FINISH("FINISH", "已结束"),
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
        for (GKStatus gkStatus : values()) {
            if (gkStatus.getCode().equals(code)) {
                return gkStatus;
            }
        }
        return null;
    }
}
