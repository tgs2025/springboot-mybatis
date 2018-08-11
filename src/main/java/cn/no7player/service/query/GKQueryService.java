package cn.no7player.service.query;

import cn.no7player.service.model.GKDTO;
import cn.no7player.service.model.request.GKQueryRequest;
import cn.no7player.service.model.result.BatchQueryResult;

/**
 * Created by tgs on 2018/8/8.
 */
public interface GKQueryService {

    /**
     * 返回最新发布的手办 默认100个
     * 支持标签搜索
     * @param request
     * @return
     */
    BatchQueryResult<GKDTO> queryNewGK(GKQueryRequest request);

    /**
     *
     * @param request
     * @return
     */
    BatchQueryResult<GKDTO> queryNewGKByType(GKQueryRequest request);
}
