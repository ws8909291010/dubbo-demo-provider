package com.wl.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wl.model.User;
import com.wl.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Auther:wangliang
 * @Date:2021/2/4 8:49
 */
@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Override
    public List<User> findUsers() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"孙尚香",20));
        userList.add(new User(2,"黄忠",30));
        userList.add(new User(3,"后羿",25));
        return userList;
    }

    @Override
    public String sayHi(String s) {
        return "hello,dubbo!";
    }
}
