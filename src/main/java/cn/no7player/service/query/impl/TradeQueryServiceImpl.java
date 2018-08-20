package cn.no7player.service.query.impl;

import cn.no7player.exceptions.BaseException;
import cn.no7player.exceptions.enums.ErrorCode;
import cn.no7player.repository.GkParticipantRelationRepository;
import cn.no7player.repository.model.GkParticipantRelation;
import cn.no7player.service.model.UserDTO;
import cn.no7player.service.model.result.BatchQueryResult;
import cn.no7player.service.query.TradeQueryService;
import cn.no7player.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tangenqing on 18/8/20.
 */
@Service
public class TradeQueryServiceImpl implements TradeQueryService {

    private static int MAX_SUCC_TRADE_SIZE = 20;

    @Autowired
    private GkParticipantRelationRepository gkParticipantRelationRepository;

    @Override
    public BatchQueryResult<GkParticipantRelation> queryNewSuccTrade(int size) {
        try {
            //参数校验
            if (size < 1 || size > MAX_SUCC_TRADE_SIZE) {
                throw new BaseException(ErrorCode.INVALID_PARAMETER, "最新交易查询参数(size)非法");
            }
            //查询
            List<GkParticipantRelation> relations = gkParticipantRelationRepository.queryNewSuccTrade(size);

            //结果返回
            BatchQueryResult result = ResultUtils.createSuccResult(BatchQueryResult.class);
            result.setValues(relations);
            return result;
        } catch (Exception e) {
            return ResultUtils.createFailResultByException(e, BatchQueryResult.class);
        }
    }

    @Override
    public BatchQueryResult<UserDTO> queryMaxPublisher(int size) {
        return null;
    }
}
