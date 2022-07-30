package com.portfolio.realty.controller;

import com.portfolio.realty.domain.ItemVO;
import com.portfolio.realty.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item/*")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping("/post")
    public String postItem(ItemVO itemVO) {
        int c = itemService.register(itemVO);
        return "";
    }

    @GetMapping("/getList")
    public String getItemList(@RequestParam("ownerId")long ownerId) {
        itemService.getItemList(ownerId);
        return "";
    }

    @PutMapping("/modify")
    public String modifyItem(ItemVO itemVO) {
        int c = itemService.modifyItem(itemVO);
        return "";
    }

    @DeleteMapping("/remove")
    public String removeItem(@RequestParam("itemId")long itemId) {
        int c = itemService.removeItem(itemId);
        return "";
    }
}
