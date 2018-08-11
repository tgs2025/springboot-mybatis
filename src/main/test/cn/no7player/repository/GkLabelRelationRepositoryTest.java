package cn.no7player.repository;

import cn.no7player.Application;
import cn.no7player.repository.model.GkLabelRelation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 手办标签关系表仓储层测试类
 * Created by tgs on 2018/8/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class GkLabelRelationRepositoryTest {
    @Autowired
    private GkLabelRelationRepository gkLabelRelationRepository;

    @Test
    public void queryByIdTest() {
        GkLabelRelation gkLabelRelation = gkLabelRelationRepository.queryById(1L);
        System.out.println(gkLabelRelation);
    }
    @Test
    public void insertTest(){
        GkLabelRelation gkLabelRelation = new GkLabelRelation();
        gkLabelRelation.setGkId(2);
        gkLabelRelation.setLabelId(2);
        gkLabelRelation.setLabelName("hot");
        gkLabelRelationRepository.insert(gkLabelRelation);
    }
}