package com.ly.controller;

import com.ly.exception.ExceptionEnum;
import com.ly.exception.LyException;
import com.ly.service.ItemService;
import com.ly.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping
    public ResponseEntity<Item> saveItem(Item item) {
        if (item.getPrice() == null) {
            throw new LyException(ExceptionEnum.PRICE_CANT_BE_NULL);
        }
       item = itemService.saveItem(item);
       return ResponseEntity.status(HttpStatus.ACCEPTED).body(item);
    }
}
