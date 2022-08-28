package com.example.itemcatalog.controller;

import com.example.itemcatalog.dto.ItemDetails;
import com.example.itemcatalog.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item-service")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @CrossOrigin
    @GetMapping("/items")
    public ResponseEntity<List<ItemDetails>> getAllItems(){
        return ResponseEntity.ok(itemService.getAllItems());
    }

    @CrossOrigin
    @GetMapping("/items/{category}")
    public ResponseEntity<List<ItemDetails>> getItemsByCategory(@PathVariable("category") String category){
        return ResponseEntity.ok(itemService.getItemByCategory(category));
    }

    @CrossOrigin
    @GetMapping("/item/{title}")
    public ResponseEntity<ItemDetails> getItemsByTitle(@PathVariable("title") String title){
        return ResponseEntity.ok(itemService.getItemsByTitle(title));
    }
}
