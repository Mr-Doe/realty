package com.portfolio.realty.service;

import com.portfolio.realty.domain.ItemVO;
import com.portfolio.realty.repository.ItemDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemDAO itemDAO;

    @Override
    public int register(ItemVO itemVO) {
        return itemDAO.insertItem(itemVO);
    }

    @Override
    public List<ItemVO> getItemList(long ownerId) {
        return itemDAO.selectItemList(ownerId);
    }

    @Override
    public int modifyItem(ItemVO itemVO) {
        return itemDAO.updateItem(itemVO);
    }

    @Override
    public int removeItem(long itemId) {
        return itemDAO.deleteItem(itemId);
    }
}
