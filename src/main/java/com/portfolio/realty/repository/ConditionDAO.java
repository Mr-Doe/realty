package com.portfolio.realty.repository;

import com.portfolio.realty.domain.ConditionVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ConditionDAO {
    int insertCondition(ConditionVO conditionVO);
    List<ConditionVO> selectConditionList();
    ConditionVO selectCondition(long conditionId);
    int updateCondition(ConditionVO conditionVO);
    int deleteCondition(long conditionId);
}
