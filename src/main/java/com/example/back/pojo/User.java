package com.example.back.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    private String seatnumber;
    private float usermoney;
}
