package cn.no7player.repository;

/**
 * Created by tgs on 2018/8/7.
 */
import cn.no7player.Application;
import cn.no7player.model.Lable_info;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 标签表仓促层测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class Lable_infoRepositoryTest {
    @Autowired
    private Lable_infoRepository lable_infoRepository;

    @Test
    public void queryByIdTest() {
        Lable_info lable_info = lable_infoRepository.queryById(1L);
        System.out.println(lable_info);
    }

    @Test
    public void insertTest(){
        Lable_info lable_info = new Lable_info();
        lable_info.setName("Game");
        lable_info.setIs_hot("yes");

        lable_infoRepository.insert(lable_info);
    }
}
