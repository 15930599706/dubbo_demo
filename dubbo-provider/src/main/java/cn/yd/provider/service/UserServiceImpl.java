package cn.yd.provider.service;

import cn.yd.api.model.User;
import cn.yd.api.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;


import java.util.List;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public User getUserByID(int id) {
        User user = new User();
        user.setId(id);
        user.setUsername("李红");
        user.setAddress("北京");
        user.setSex("1");
        java.util.Date date = new java.util.Date();
        user.setBirthday(new java.sql.Date(date.getTime()));
        return user;
    }

    @Override
    public int addUser(User arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int deleteUser(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updateUser(User arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

}