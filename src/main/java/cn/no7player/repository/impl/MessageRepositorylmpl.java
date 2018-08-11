package cn.no7player.repository.impl;

import cn.no7player.mapper.MessageMapper;
import cn.no7player.repository.model.Message;
import cn.no7player.repository.model.dataobject.MessageDO;
import cn.no7player.repository.MessageRepository;
import cn.no7player.repository.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by tgs on 2018/8/8.
 */
@Service
public class MessageRepositorylmpl implements MessageRepository {
    @Autowired
    private MessageMapper messageMapper;

    @Override
    public Long insert(Message message) {
        message.setGmtCreate(new Date());
        message.setGmtModified(new Date());
        //  System.out.println(user);
        MessageDO messageDO = MessageConverter.convert2DO(message);
        return messageMapper.insertMessage(messageDO);
    }

    @Override
    public Message queryById(long id) {
        MessageDO messageDO = messageMapper.selectById(id);
        return MessageConverter.convert2Model(messageDO);
    }

    @Override
    public int updateStatus2Read(List<Long> messageIds) {

        return messageMapper.updateStatus2Read(messageIds);
    }

}
