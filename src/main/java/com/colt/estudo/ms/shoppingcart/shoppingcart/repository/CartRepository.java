package com.colt.estudo.ms.shoppingcart.shoppingcart.repository;

import com.colt.estudo.ms.shoppingcart.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer > {
}
