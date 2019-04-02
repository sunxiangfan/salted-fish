package com.salted.fish.service.impl;

import com.salted.fish.common.entity.FishUserLogin;
import com.salted.fish.common.util.Convert;
import com.salted.fish.mapper.FishUserLoginMapper;
import com.salted.fish.service.IFishUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户登录 服务层实现
 *
 * @author shop
 * @date 2019-04-02
 */
@Service
public class FishUserLoginServiceImpl implements IFishUserLoginService {
    @Autowired
    private FishUserLoginMapper fishUserLoginMapper;

    /**
     * 查询用户登录信息
     *
     * @param id 用户登录ID
     * @return 用户登录信息
     */
    @Override
    public FishUserLogin selectFishUserLoginById(Integer id) {
        return fishUserLoginMapper.selectFishUserLoginById(id);
    }

    /**
     * 查询用户登录列表
     *
     * @param fishUserLogin 用户登录信息
     * @return 用户登录集合
     */
    @Override
    public List<FishUserLogin> selectFishUserLoginList(FishUserLogin fishUserLogin) {
        return fishUserLoginMapper.selectFishUserLoginList(fishUserLogin);
    }

    /**
     * 新增用户登录
     *
     * @param fishUserLogin 用户登录信息
     * @return 结果
     */
    @Override
    public int insertFishUserLogin(FishUserLogin fishUserLogin) {
        return fishUserLoginMapper.insertFishUserLogin(fishUserLogin);
    }

    /**
     * 修改用户登录
     *
     * @param fishUserLogin 用户登录信息
     * @return 结果
     */
    @Override
    public int updateFishUserLogin(FishUserLogin fishUserLogin) {
        return fishUserLoginMapper.updateFishUserLogin(fishUserLogin);
    }

    /**
     * 删除用户登录对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFishUserLoginByIds(String ids) {
        return fishUserLoginMapper.deleteFishUserLoginByIds(Convert.toStrArray(ids));
    }

}
