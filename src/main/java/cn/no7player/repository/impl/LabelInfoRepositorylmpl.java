package cn.no7player.repository.impl;

/**
 * Created by tgs on 2018/8/7.
 */
import cn.no7player.mapper.LabelInfoMapper;

import cn.no7player.model.LabelInfo;
import cn.no7player.model.dataobject.LabelInfoDO;
import cn.no7player.repository.LabelInfoRepository;
import cn.no7player.repository.converter.LabelInfoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LabelInfoRepositorylmpl implements LabelInfoRepository {


        @Autowired
        private LabelInfoMapper labelInfoMapper;

        @Override
        public Long insert(LabelInfo labelInfo) {
            labelInfo.setGmtCreate(new Date());
            labelInfo.setGmtModified(new Date());
//            System.out.println(lable_info);
            LabelInfoDO labelInfoDO = LabelInfoConverter.convert2DO(labelInfo);
            return labelInfoMapper.insertLabelInfo(labelInfoDO);
        }

        @Override
        public LabelInfo queryById(long id) {
            LabelInfoDO labelInfoDO = labelInfoMapper.selectById(id);
            return LabelInfoConverter.convert2Model(labelInfoDO);
        }
    }


