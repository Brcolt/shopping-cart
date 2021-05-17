package com.colt.estudo.ms.shoppingcart.shoppingcart.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("item")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Item {

    @Id
    private Integer productId;
    private Integer amount;
}
