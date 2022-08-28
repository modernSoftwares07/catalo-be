package com.example.itemcatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemDetails {
    private String itemId ;
    private String title;
    private String price;
    private String imageUrl;
    private String category;
}
