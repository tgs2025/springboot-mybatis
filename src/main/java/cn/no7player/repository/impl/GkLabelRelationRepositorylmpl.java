package cn.no7player.repository.impl;

import cn.no7player.mapper.GkLabelRelationMapper;
import cn.no7player.model.GkLabelRelation;
import cn.no7player.model.dataobject.GkLabelRelationDO;
import cn.no7player.repository.GkLabelRelationRepository;
import cn.no7player.repository.converter.GkLabelRelationConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by tgs on 2018/8/8.
 */
@Service
public class GkLabelRelationRepositorylmpl implements GkLabelRelationRepository {
    @Autowired
    private GkLabelRelationMapper gkLabelRelationMapper;
    @Override
    public Long insert(GkLabelRelation gkLabelRelation) {
        gkLabelRelation.setGmtCreate(new Date());
        gkLabelRelation.setGmtModified(new Date());
        //  System.out.println(user);
        GkLabelRelationDO gkLabelRelationDO = GkLabelRelationConverter.convert2DO(gkLabelRelation);
        return gkLabelRelationMapper.insertGkLabelRelation(gkLabelRelationDO);
    }

    @Override
    public GkLabelRelation queryById(long id) {
        GkLabelRelationDO gkLabelRelationDO = gkLabelRelationMapper.selectById(id);
        return GkLabelRelationConverter.convert2Model(gkLabelRelationDO);
    }
}
