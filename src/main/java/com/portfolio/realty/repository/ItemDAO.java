package com.portfolio.realty.repository;

import com.portfolio.realty.domain.ItemVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemDAO {
    int insertItem(ItemVO itemVO);
    List<ItemVO> selectItemList(long ownerId);
    int updateItem(ItemVO itemVO);
    int deleteItem(long itemId);
}
