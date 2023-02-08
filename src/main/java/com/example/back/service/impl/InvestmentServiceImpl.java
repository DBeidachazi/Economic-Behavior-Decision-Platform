package com.example.back.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.back.mapper.InvestmentMapper;
import com.example.back.pojo.Investment;
import com.example.back.service.IInvestmentService;
import org.springframework.stereotype.Service;

@Service
public class InvestmentServiceImpl extends ServiceImpl<InvestmentMapper, Investment> implements IInvestmentService {
}
