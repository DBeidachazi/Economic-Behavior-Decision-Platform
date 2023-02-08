package com.example.back.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.back.pojo.Investment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InvestmentMapper extends BaseMapper<Investment> {
}
