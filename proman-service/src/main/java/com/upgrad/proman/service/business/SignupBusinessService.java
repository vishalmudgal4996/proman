package com.upgrad.proman.service.business;

import com.upgrad.proman.service.dao.UserDao;
import com.upgrad.proman.service.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import javax.transaction.Transactional;

@Service
public class SignupBusinessService {

    @Autowired
    private UserDao userDao;

    public UserEntity signup(UserEntity userEntity){
        return userDao.createUser(userEntity);
    }
}
