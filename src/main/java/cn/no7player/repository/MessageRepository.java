package cn.no7player.repository;

import cn.no7player.repository.model.Message;

import java.util.List;

/**
 * Created by tgs on 2018/8/8.
 */
public interface MessageRepository {
    /**
     * 新增消息
     *
     * @param message
     * @return 消息id
     */
    Long insert(Message message);

    /**
     * 基于消息id搜索
     *
     * @param id
     * @renturn 消息模型
     */
    Message queryById(long id);

    /**
     * 消息更新
     *
     * @param messageIds
     * @return
     */
    int updateStatus2Read(List<Long> messageIds);
}
