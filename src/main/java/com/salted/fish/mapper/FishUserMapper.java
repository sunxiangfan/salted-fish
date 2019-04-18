package com.salted.fish.mapper;

import com.salted.fish.common.entity.FishUser;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;

/**
 * 用户 数据层
 *
 * @author shop
 * @date 2019-04-02
 */
public interface FishUserMapper {
    /**
     * 查询用户信息
     *
     * @param id 用户ID
     * @return 用户信息
     */
    public FishUser selectFishUserById(Integer id);

    /**
     * 查询用户信息
     *
     * @param userId 用户ID
     * @return 用户信息
     */
    public FishUser selectFishUserByUserId(@Param("userId") String userId);

    /**
     * 查询用户列表
     *
     * @param fishUser 用户信息
     * @return 用户集合
     */
    public List<FishUser> selectFishUserList(FishUser fishUser);

    /**
     * 新增用户
     *
     * @param fishUser 用户信息
     * @return 结果
     */
    public int insertFishUser(FishUser fishUser);

    /**
     * 修改用户
     *
     * @param fishUser 用户信息
     * @return 结果
     */
    public int updateFishUser(FishUser fishUser);

    /**
     * 删除用户
     *
     * @param id 用户ID
     * @return 结果
     */
    public int deleteFishUserById(Integer id);

    /**
     * 批量删除用户
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFishUserByIds(String[] ids);

}