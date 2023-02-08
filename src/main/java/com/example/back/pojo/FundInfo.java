package com.example.back.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("fundinformation")
public class FundInfo {
    private int experimentstage;
    private int taskprocess;
    private int fundid;
    private float fund;
}
