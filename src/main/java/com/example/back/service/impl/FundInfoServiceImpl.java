package com.example.back.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.back.mapper.FundInfoMapper;
import com.example.back.pojo.FundInfo;
import com.example.back.service.IFundInfoService;
import org.springframework.stereotype.Service;

@Service
public class FundInfoServiceImpl extends ServiceImpl<FundInfoMapper, FundInfo> implements IFundInfoService {
}
