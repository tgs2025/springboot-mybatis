package cn.no7player.repository;

/**
 * Created by tgs on 2018/8/7.
 */
import cn.no7player.Application;
import cn.no7player.repository.model.LabelInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 标签表仓储层测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class LabelInfoRepositoryTest {
    @Autowired
    private LabelInfoRepository labelInfoRepository;
//todo 类名规范
    @Test
    public void queryByIdTest() {
        LabelInfo labelInfo = labelInfoRepository.queryById(1L);
        System.out.println(labelInfo);
    }

    @Test
    public void insertTest(){
        LabelInfo labelInfo = new LabelInfo();
        labelInfo.setName("Game");
        labelInfo.setIsHot("yes");

        labelInfoRepository.insert(labelInfo);
    }
}
