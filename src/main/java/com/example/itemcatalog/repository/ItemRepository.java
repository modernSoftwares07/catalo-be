package com.example.itemcatalog.repository;

import com.example.itemcatalog.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ItemRepository extends CrudRepository<ItemEntity, String> {
    Optional<ItemEntity> findByTitle(String title);
}
