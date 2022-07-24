package com.portfolio.realty.controller;

import com.portfolio.realty.domain.ConditionVO;
import com.portfolio.realty.service.ConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/condition/*")
public class ConditionController {

    @Autowired
    private ConditionService conditionService;

    @PostMapping("/save")
    public String saveCondition(ConditionVO conditionVO) {
        int isOk = conditionService.createCondition(conditionVO);
        return "";
    }

    @GetMapping("/load")
    public String getConditionList() {
        conditionService.getConditionList();
        return "";
    }
}
