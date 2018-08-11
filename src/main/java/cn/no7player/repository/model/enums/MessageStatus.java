package cn.no7player.repository.model.enums;

/**
 * Created by tgs on 2018/8/8.
 */
public enum MessageStatus {

    READ("READ", "已读"),

    UNREAD("UNREAD", "未读"),
    ;
    private String code;

    /**
     * 描述
     */
    private String desc;

    MessageStatus(String code, String desc) {
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
    public static MessageStatus getByCode(String code) {
        for (MessageStatus messageStatus : values()) {
            if (messageStatus.getCode().equals(code)) {
                return messageStatus;
            }
        }
        return null;
    }
}
