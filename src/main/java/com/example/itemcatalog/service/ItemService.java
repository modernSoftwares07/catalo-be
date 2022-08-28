package com.example.itemcatalog.service;

import com.example.itemcatalog.dto.ItemDetails;

import java.util.List;

public interface ItemService {
    List<ItemDetails> getAllItems();

    List<ItemDetails> getItemByCategory(String category);

    ItemDetails getItemsByTitle(String title);
}
