package cn.yd.api.service;

import cn.yd.api.model.User;

import java.util.List;

/**
 * 用户操作接口
 * */
public interface UserService {

    /**
     * 用户添加
     * */
    public int addUser(User user);

    /**
     * 根据用户ID删除一个用户
     * */
    public int deleteUser(int id);

    /**
     * 更新用户信息
     * */
    public int updateUser(User user);

    /**
     * 根据用户ID查询用户信息
     * */
    public User getUserByID(int id);

    /**
     * 获取所有用户信息
     * */
    public List<User> getAllUser();
}
