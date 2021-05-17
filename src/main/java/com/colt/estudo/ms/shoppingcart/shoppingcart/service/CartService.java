package com.colt.estudo.ms.shoppingcart.shoppingcart.service;


import com.colt.estudo.ms.shoppingcart.shoppingcart.dto.CartDTO;
import com.colt.estudo.ms.shoppingcart.shoppingcart.dto.ItemDTO;
import com.colt.estudo.ms.shoppingcart.shoppingcart.mapper.CartMapper;
import com.colt.estudo.ms.shoppingcart.shoppingcart.mapper.ItemMapper;
import com.colt.estudo.ms.shoppingcart.shoppingcart.model.Cart;
import com.colt.estudo.ms.shoppingcart.shoppingcart.model.Item;
import com.colt.estudo.ms.shoppingcart.shoppingcart.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CartService {

    private final CartRepository cartRepository;

    private final CartMapper cartMapper = CartMapper.INSTANCE;
    private final ItemMapper itemMapper = ItemMapper.INSTANCE;

    public CartDTO addItem(ItemDTO itemDTO, Integer id) {
        Optional<Cart> savedCart = cartRepository.findById(id);
        Item item = itemMapper.toModel(itemDTO);
        Cart cart;
        if (savedCart.equals(Optional.empty())) {
            cart = new Cart(id);
        } else {
            cart = savedCart.get();
        }
        cart.getItems().add(item);

        cartRepository.save(cart);

        return cartMapper.toDTO(cart);
    }

    public CartDTO findById(Integer id) {
        Optional<Cart> findedCart = cartRepository.findById(id);
        Cart cart = findedCart.get();

        return cartMapper.toDTO(cart);
    }

    public void deleteById(Integer id) {
        cartRepository.deleteById(id);
    }
}
