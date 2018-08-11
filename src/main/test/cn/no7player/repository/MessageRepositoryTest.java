package cn.no7player.repository;

import cn.no7player.Application;
import cn.no7player.repository.model.Message;
import cn.no7player.repository.model.enums.MessageStatus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 消息表仓储层测试类
 * Created by tgs on 2018/8/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class MessageRepositoryTest {
    @Autowired
    private MessageRepository messageRepository;

    @Test
    public void queryByIdTest() {
        Message message = messageRepository.queryById(1L);
        System.out.println(message);
    }
    @Test
    public void insertTest(){
        Message message = new Message();
        message.setUserId(2);
        message.setMessageStatus(MessageStatus .UNREAD);
        message.setContent("content test");

        messageRepository.insert(message);
    }
}
