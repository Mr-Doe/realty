package com.portfolio.realty.service;

import com.portfolio.realty.domain.ConditionVO;

import java.util.List;

public interface ConditionService {
    int createCondition(ConditionVO conditionVO);
    List<ConditionVO> getConditionList();
    ConditionVO getCondition(long conditionId);
    int modifyCondition(ConditionVO conditionVO);
    int removeCondition(long conditionId);
}
