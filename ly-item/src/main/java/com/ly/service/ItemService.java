package com.ly.service;

import com.ly.model.Item;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    public Item saveItem(Item item) {
        item.setId(101);
        return item;
    }
}
