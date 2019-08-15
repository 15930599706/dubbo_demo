package cn.yd.consumer.Controller;

import cn.yd.api.model.User;
import cn.yd.api.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;//用该对象就可以调用远程服务了，因为该对象指向的是接口项目中的UserService

    @RequestMapping("/boot/user")
    public User getUser(Integer id){

        //调用远程方法获取用户
        return userService.getUserByID(id);//上面用了@RestController可以直接返回json

    }
}