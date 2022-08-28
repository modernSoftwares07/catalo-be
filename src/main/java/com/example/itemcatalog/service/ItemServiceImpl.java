package com.example.itemcatalog.service;

import com.example.itemcatalog.dto.ItemDetails;
import com.example.itemcatalog.entity.ItemEntity;
import com.example.itemcatalog.mapper.ItemMapper;
import com.example.itemcatalog.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private ItemMapper mapper;
    @Override
    public List<ItemDetails> getAllItems() {
        List<ItemEntity> itemList = new ArrayList<>();
        itemRepository.findAll()
                .forEach(itemEntity -> itemList.add(itemEntity));

        return itemList.stream().map(itemEntity -> mapper.getItemFromEntity(itemEntity))
                .collect(Collectors.toList());
    }

    @Override
    public List<ItemDetails> getItemByCategory(String category) {
        List<ItemEntity> itemList = new ArrayList<>();
        itemRepository.findAll()
                .forEach(itemEntity -> itemList.add(itemEntity));

        return itemList.stream().map(itemEntity -> mapper.getItemFromEntity(itemEntity))
                .filter(item -> item.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    @Override
    public ItemDetails getItemsByTitle(String title) {
        Optional<ItemEntity> optionalItem = itemRepository.findByTitle(title);
        return mapper.getItemFromEntity(optionalItem.orElseThrow(() -> new RuntimeException("no ItemAvailable")));
    }
}
