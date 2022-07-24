package com.portfolio.realty.service;

import com.portfolio.realty.domain.ConditionVO;
import com.portfolio.realty.repository.ConditionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConditionServiceImpl implements ConditionService{

    @Autowired
    private ConditionDAO conditionDAO;

    @Override
    public int createCondition(ConditionVO conditionVO) {
        return conditionDAO.insertCondition(conditionVO);
    }

    @Override
    public List<ConditionVO> getConditionList() {
        return conditionDAO.selectConditionList();
    }

    @Override
    public ConditionVO getCondition(long conditionId) {
        return conditionDAO.selectCondition(conditionId);
    }

    @Override
    public int modifyCondition(ConditionVO conditionVO) {
        return conditionDAO.updateCondition(conditionVO);
    }

    @Override
    public int removeCondition(long conditionId) {
        return conditionDAO.deleteCondition(conditionId);
    }
}
