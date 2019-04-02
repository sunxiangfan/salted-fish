package com.salted.fish.service.impl;

import com.salted.fish.common.entity.FishUser;
import com.salted.fish.common.util.Convert;
import com.salted.fish.mapper.FishUserMapper;
import com.salted.fish.service.IFishUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户 服务层实现
 *
 * @author shop
 * @date 2019-04-02
 */
@Service
public class FishUserServiceImpl implements IFishUserService {
    @Autowired
    private FishUserMapper fishUserMapper;

    /**
     * 查询用户信息
     *
     * @param id 用户ID
     * @return 用户信息
     */
    @Override
    public FishUser selectFishUserById(Integer id) {
        return fishUserMapper.selectFishUserById(id);
    }

    /**
     * 查询用户列表
     *
     * @param fishUser 用户信息
     * @return 用户集合
     */
    @Override
    public List<FishUser> selectFishUserList(FishUser fishUser) {
        return fishUserMapper.selectFishUserList(fishUser);
    }

    /**
     * 新增用户
     *
     * @param fishUser 用户信息
     * @return 结果
     */
    @Override
    public int insertFishUser(FishUser fishUser) {
        return fishUserMapper.insertFishUser(fishUser);
    }

    /**
     * 修改用户
     *
     * @param fishUser 用户信息
     * @return 结果
     */
    @Override
    public int updateFishUser(FishUser fishUser) {
        return fishUserMapper.updateFishUser(fishUser);
    }

    /**
     * 删除用户对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFishUserByIds(String ids) {
        return fishUserMapper.deleteFishUserByIds(Convert.toStrArray(ids));
    }

}
