package com.example.back.controller;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.back.mapper.UserMapper;
import com.example.back.pojo.FundInfo;
import com.example.back.pojo.Investment;
import com.example.back.pojo.User;
import com.example.back.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"*", "null"})
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private IUserService iUserService;


    @PostMapping("/update/{seatnumber}/{usermoney}")
    public User userUpdate(@PathVariable String seatnumber, @PathVariable float usermoney){
        UpdateWrapper<User> updateWrapper=new UpdateWrapper<>();
        User user = new User();
        user.setUsermoney(usermoney);
        updateWrapper.eq("seatnumber", seatnumber);
        int affectRows=userMapper.update(user,updateWrapper);
        if(affectRows>0){
            System.out.println("更新成功");
        }else{
            System.out.println("更新失败");
        }
        return user;
    }


    @PostMapping("/userpost")
    public ResponseData<User> saveUser(@RequestBody User user){
        ResponseData<User> responseData = ResponseData.success(user);
        iUserService.save(user);
        return responseData;
    }
}
