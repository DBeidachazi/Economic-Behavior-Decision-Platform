package com.example.back.controller;


import com.example.back.pojo.Investment;
import com.example.back.service.IInvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = {"*", "null"})

@RestController
@RequestMapping("/investment")
public class InvestmentController {

    @Autowired
    private IInvestmentService iInvestmentService;

    @PostMapping("/investpost")
    public Investment isave(@RequestBody Investment investment){
        iInvestmentService.save(investment);
        return investment;
    }
}
