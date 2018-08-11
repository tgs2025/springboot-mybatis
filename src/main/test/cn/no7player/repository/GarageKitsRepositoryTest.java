package cn.no7player.repository;

import cn.no7player.Application;
import cn.no7player.repository.model.GarageKits;
import cn.no7player.repository.model.enums.GKStatus;
import cn.no7player.repository.model.enums.GKType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 手办表仓储层测试类
 * Created by tgs on 2018/8/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class GarageKitsRepositoryTest {
    @Autowired
    private GarageKitsRepository garageKitsRepository;
    @Test
    public void queryByIdTest() {
        GarageKits garageKits = garageKitsRepository.queryById(1L);
        System.out.println(garageKits);
}

    @Test
    public void insertTest(){
        GarageKits garageKits = new GarageKits();
        garageKits.setTitle("lu");
        garageKits.setParticipantsNum(30);
        garageKits.setCurParticipantsNum(10);
        garageKits.setPublisher("ttt");
        garageKits.setGkStatus(GKStatus.PROCESS);
        garageKits.setImg("a");
        garageKits.setType(GKType.GAME);
        garageKitsRepository.insert(garageKits);
    }
}
