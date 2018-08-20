package cn.no7player.repository.impl;

import cn.no7player.mapper.GkParticipantRelationMapper;
import cn.no7player.repository.GkParticipantRelationRepository;
import cn.no7player.repository.converter.GkParticipantRelationConverter;
import cn.no7player.repository.model.GkParticipantRelation;
import cn.no7player.repository.model.dataobject.GkParticipantRelationDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by tgs on 2018/8/8.
 */
@Service
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

    @Override
    public List<GkParticipantRelation> queryNewSuccTrade(int size) {
        List<GkParticipantRelationDO> gkParticipantRelationDOS = gkParticipantRelationMapper.selectSuccRelationBySize(size);
        return GkParticipantRelationConverter.convert2Models(gkParticipantRelationDOS);
    }
}
