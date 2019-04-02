package com.salted.fish.service;

import com.salted.fish.common.entity.FishFollow;

import java.util.List;

/**
 * 关注/粉丝 服务层
 *
 * @author shop
 * @date 2019-04-02
 */
public interface IFishFollowService {
    /**
     * 查询关注/粉丝信息
     *
     * @param id 关注/粉丝ID
     * @return 关注/粉丝信息
     */
    public FishFollow selectFishFollowById(Integer id);

    /**
     * 查询关注/粉丝列表
     *
     * @param fishFollow 关注/粉丝信息
     * @return 关注/粉丝集合
     */
    public List<FishFollow> selectFishFollowList(FishFollow fishFollow);

    /**
     * 新增关注/粉丝
     *
     * @param fishFollow 关注/粉丝信息
     * @return 结果
     */
    public int insertFishFollow(FishFollow fishFollow);

    /**
     * 修改关注/粉丝
     *
     * @param fishFollow 关注/粉丝信息
     * @return 结果
     */
    public int updateFishFollow(FishFollow fishFollow);

    /**
     * 删除关注/粉丝信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFishFollowByIds(String ids);

}
