package com.salted.fish.service.impl;

import com.salted.fish.common.entity.FishFollow;
import com.salted.fish.common.util.Convert;
import com.salted.fish.mapper.FishFollowMapper;
import com.salted.fish.service.IFishFollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 关注/粉丝 服务层实现
 *
 * @author shop
 * @date 2019-04-02
 */
@Service
public class FishFollowServiceImpl implements IFishFollowService {
    @Autowired
    private FishFollowMapper fishFollowMapper;

    /**
     * 查询关注/粉丝信息
     *
     * @param id 关注/粉丝ID
     * @return 关注/粉丝信息
     */
    @Override
    public FishFollow selectFishFollowById(Integer id) {
        return fishFollowMapper.selectFishFollowById(id);
    }

    /**
     * 查询关注/粉丝列表
     *
     * @param fishFollow 关注/粉丝信息
     * @return 关注/粉丝集合
     */
    @Override
    public List<FishFollow> selectFishFollowList(FishFollow fishFollow) {
        return fishFollowMapper.selectFishFollowList(fishFollow);
    }

    /**
     * 新增关注/粉丝
     *
     * @param fishFollow 关注/粉丝信息
     * @return 结果
     */
    @Override
    public int insertFishFollow(FishFollow fishFollow) {
        return fishFollowMapper.insertFishFollow(fishFollow);
    }

    /**
     * 修改关注/粉丝
     *
     * @param fishFollow 关注/粉丝信息
     * @return 结果
     */
    @Override
    public int updateFishFollow(FishFollow fishFollow) {
        return fishFollowMapper.updateFishFollow(fishFollow);
    }

    /**
     * 删除关注/粉丝对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFishFollowByIds(String ids) {
        return fishFollowMapper.deleteFishFollowByIds(Convert.toStrArray(ids));
    }

}
