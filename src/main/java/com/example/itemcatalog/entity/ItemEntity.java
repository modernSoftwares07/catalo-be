package com.example.itemcatalog.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item_details")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemEntity {
    @Id
    private String itemId ;
    private String title;
    private String price;
    private String imageUrl;
    private String category;
}
