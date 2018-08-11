package cn.no7player.repository.converter;


import cn.no7player.repository.model.Message;

import cn.no7player.repository.model.dataobject.MessageDO;
import cn.no7player.repository.model.enums.MessageStatus;

/**
 * 消息表模型 和do转换器
 * Created by tgs on 2018/8/8.
 */
public class MessageConverter {
    public static MessageDO convert2DO(Message message){
        if(message == null){
            return null;
        }
        MessageDO messageDO = new MessageDO();

        messageDO.setId(message.getId());
        messageDO.setUserId(message.getUserId());
        messageDO.setContent(message.getContent());
        if (message.getMessageStatus() != null){
            messageDO.setMessageStatus(message.getMessageStatus().getCode());
        }

        messageDO.setGmtCreate(message.getGmtCreate());
        messageDO.setGmtModified(message.getGmtModified());
        return messageDO;
    }

    public static Message convert2Model(MessageDO messageDO){
        if(messageDO == null){
            return null;
        }
        Message message = new Message();
        message.setId(messageDO.getId());
        message.setUserId(messageDO.getUserId());
        message.setContent(messageDO.getContent());


        message.setMessageStatus(MessageStatus.getByCode(messageDO.getMessageStatus()));


        message.setGmtCreate(messageDO.getGmtCreate());
        message.setGmtModified(messageDO.getGmtModified());

        return message;
    }
}
