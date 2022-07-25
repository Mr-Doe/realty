package com.portfolio.realty.service;

import com.portfolio.realty.domain.ItemVO;

import java.util.List;

public interface ItemService {
    int register(ItemVO itemVO);
    List<ItemVO> getItemList(long ownerId);
    int modifyItem(ItemVO itemVO);
    int removeItem(long itemId);
}
