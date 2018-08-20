package cn.no7player.service.query;

import cn.no7player.repository.model.GkParticipantRelation;
import cn.no7player.service.model.UserDTO;
import cn.no7player.service.model.result.BatchQueryResult;

/**
 * Created by tgs on 2018/8/8.
 */
public interface TradeQueryService {

    /**
     * 返回最近成功的交易
     *
     * @param size 最大不能超过20
     * @return
     */
    BatchQueryResult<GkParticipantRelation> queryNewSuccTrade(int size);

    /**
     * 查询发布做多的前几位用户
     *
     * @param size 最大不能超过20
     * @return
     */
    BatchQueryResult<UserDTO> queryMaxPublisher(int size);
}
