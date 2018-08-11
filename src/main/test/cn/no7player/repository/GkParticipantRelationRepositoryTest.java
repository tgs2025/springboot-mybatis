package cn.no7player.repository;

import cn.no7player.Application;
import cn.no7player.repository.model.GkParticipantRelation;
import cn.no7player.repository.model.enums.GPRIsTarget;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 手办参与关系表仓储层测试类
 * Created by tgs on 2018/8/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class GkParticipantRelationRepositoryTest {
    @Autowired
    private GkParticipantRelationRepository gkParticipantRelationRepository;

    @Test
    public void queryByIdTest() {
        GkParticipantRelation gkParticipantRelation = gkParticipantRelationRepository.queryById(1L);
        System.out.println(gkParticipantRelation);
}
    @Test
    public void insertTest(){
        GkParticipantRelation gkParticipantRelation = new GkParticipantRelation();
        gkParticipantRelation.setGkId(2);
        gkParticipantRelation.setPublishName("tt");
        gkParticipantRelation.setParticipantName("ttt");
        gkParticipantRelation.setParticipantId(2);
        gkParticipantRelation.setIsTarget(GPRIsTarget.FALSE);

        gkParticipantRelationRepository.insert(gkParticipantRelation);
    }
}
