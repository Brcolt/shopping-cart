package com.colt.estudo.ms.shoppingcart.shoppingcart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;

@RedisHash("cart")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cart {

    @Id
    private Integer id;
    private List<Item> items;

    public Cart(Integer id) {
    }

    public List<Item> getItems() {
        if (items == null) {
            items = new ArrayList<>();
        }
        return items;
    }
}
