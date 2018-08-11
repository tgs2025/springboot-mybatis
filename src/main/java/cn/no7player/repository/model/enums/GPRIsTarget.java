package cn.no7player.repository.model.enums;

/**
 * 中奖情况
 * Created by tgs on 2018/8/8.
 */
public enum GPRIsTarget {

    FALSE("FALSE", "false"),

    TRUE("TRUE", "true"),
    ;
    private String code;

    /**
     * 描述
     */
    private String desc;

    GPRIsTarget(String code, String desc) {
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
    public static GPRIsTarget getByCode(String code) {
        for (GPRIsTarget isTarget : values()) {
            if (isTarget.getCode().equals(code)) {
                return isTarget;
            }
        }
        return null;
    }
}
