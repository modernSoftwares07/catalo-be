package com.example.itemcatalog.mapper;

import com.example.itemcatalog.dto.ItemDetails;
import com.example.itemcatalog.entity.ItemEntity;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class ItemMapper {
    public ItemDetails getItemFromEntity(ItemEntity itemEntity){
        return ItemDetails.builder()
                .itemId(itemEntity.getItemId())
                .category(itemEntity.getCategory())
                .price(itemEntity.getPrice())
                .title(itemEntity.getTitle())
                .imageUrl(itemEntity.getImageUrl())
                .build();
    }

    public ItemEntity getItemEntityFromItemDetails(ItemDetails itemDetails){
        return ItemEntity.builder()
                .itemId(UUID.randomUUID().toString())
                .category(itemDetails.getCategory())
                .imageUrl(itemDetails.getImageUrl())
                .title(itemDetails.getTitle())
                .price(itemDetails.getPrice())
                .build();
    }
}
