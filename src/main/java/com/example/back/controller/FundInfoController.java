package com.example.back.controller;


import com.example.back.pojo.FundInfo;
import com.example.back.service.IFundInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@CrossOrigin(origins = {"*", "null"})
@RestController
@RequestMapping("/funds")
public class FundInfoController {

    @Autowired
    private IFundInfoService iFundInfoService;


    @PostMapping("/post")
    public List<FundInfo> fundPost(@RequestBody List<FundInfo> fundInfo){
        iFundInfoService.saveBatch(fundInfo);
        return  fundInfo;
    }
}
