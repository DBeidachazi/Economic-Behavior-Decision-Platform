package com.example.back.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("investment")
public class Investment {
    private int id;
    private String seatnumber;
    private int fundid;
    private int slider;
    private int userthisroundincome;
}
