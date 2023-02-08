package com.example.back.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.back.mapper.UserMapper;
import com.example.back.pojo.User;
import com.example.back.service.IUserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
