package cn.no7player.repository.impl;

/**
 * Created by tgs on 2018/8/7.
 */
import cn.no7player.mapper.Lable_infoMapper;

import cn.no7player.model.Lable_info;
import cn.no7player.model.dataobject.Lable_infoDO;
import cn.no7player.repository.Lable_infoRepository;
import cn.no7player.repository.converter.Lable_infoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class Lable_infoRepositorylmpl implements Lable_infoRepository{


        @Autowired
        private Lable_infoMapper lable_infoMapper;

        @Override
        public Long insert(Lable_info lable_info) {
            lable_info.setGmtCreate(new Date());
            lable_info.setGmtModofied(new Date());
            System.out.println(lable_info);
            Lable_infoDO lable_infoDO = Lable_infoConverter.convert2DO(lable_info);
            return lable_infoMapper.insertLable_info(lable_infoDO);
        }

        @Override
        public Lable_info queryById(long id) {
            Lable_infoDO lable_infoDO = lable_infoMapper.selectById(id);
            return Lable_infoConverter.convert2Model(lable_infoDO);
        }
    }


