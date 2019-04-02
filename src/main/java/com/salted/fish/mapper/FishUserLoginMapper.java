package com.salted.fish.mapper;

import com.salted.fish.common.entity.FishUserLogin;

import java.util.List;

/**
 * 用户登录 数据层
 *
 * @author shop
 * @date 2019-04-02
 */
public interface FishUserLoginMapper {
    /**
     * 查询用户登录信息
     *
     * @param id 用户登录ID
     * @return 用户登录信息
     */
    public FishUserLogin selectFishUserLoginById(Integer id);

    /**
     * 查询用户登录列表
     *
     * @param fishUserLogin 用户登录信息
     * @return 用户登录集合
     */
    public List<FishUserLogin> selectFishUserLoginList(FishUserLogin fishUserLogin);

    /**
     * 新增用户登录
     *
     * @param fishUserLogin 用户登录信息
     * @return 结果
     */
    public int insertFishUserLogin(FishUserLogin fishUserLogin);

    /**
     * 修改用户登录
     *
     * @param fishUserLogin 用户登录信息
     * @return 结果
     */
    public int updateFishUserLogin(FishUserLogin fishUserLogin);

    /**
     * 删除用户登录
     *
     * @param id 用户登录ID
     * @return 结果
     */
    public int deleteFishUserLoginById(Integer id);

    /**
     * 批量删除用户登录
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFishUserLoginByIds(String[] ids);

}