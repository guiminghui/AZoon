package io.gmh.service.impl;


import io.gmh.entity.User;
import io.gmh.mapper.UserMapper;
import io.gmh.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User, Long> implements UserService {

    @Override
    public User selectByLoginName(String loginName) {
        return mapper.selectByLoginName(loginName);
    }
	

    
}
