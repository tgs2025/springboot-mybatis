package cn.no7player.mapper;

import cn.no7player.repository.model.dataobject.MessageDO;

/**
 * Created by tgs on 2018/8/8.
 */
public interface MessageMapper {
    /**
     * 插入消息
     *
     * @param messageDO
     * @return 消息自增id
     */
    long insertMessage(MessageDO messageDO);

    /**
     * 基于消息id搜索
     *
     * @param id
     * @return
     */
    MessageDO selectById(Long id);
}
