package cn.no7player.repository.impl;

import cn.no7player.mapper.GkParticipantRelationMapper;
import cn.no7player.model.GkParticipantRelation;
import cn.no7player.model.dataobject.GkParticipantRelationDO;
import cn.no7player.repository.GkParticipantRelationRepository;
import cn.no7player.repository.converter.GkParticipantRelationConverter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by tgs on 2018/8/8.
 */
public class GkParticipantRelationRepositorylmpl implements GkParticipantRelationRepository {
    @Autowired
    private GkParticipantRelationMapper gkParticipantRelationMapper;

    @Override
    public Long insert(GkParticipantRelation gkParticipantRelation) {
        gkParticipantRelation.setGmtCreate(new Date());
        gkParticipantRelation.setGmtModified(new Date());
//        System.out.println(gkParticipantRelation);
        GkParticipantRelationDO gkParticipantRelationDO = GkParticipantRelationConverter.convert2DO(gkParticipantRelation);
        return gkParticipantRelationMapper.insertGkParticipantRelation(gkParticipantRelationDO);
    }

    @Override
    public GkParticipantRelation queryById(long id) {
        GkParticipantRelationDO gkParticipantRelationDO = gkParticipantRelationMapper.selectById(id);
        return GkParticipantRelationConverter.convert2Model(gkParticipantRelationDO);
    }
}
