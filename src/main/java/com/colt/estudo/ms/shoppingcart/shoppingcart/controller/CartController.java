package com.colt.estudo.ms.shoppingcart.shoppingcart.controller;


import com.colt.estudo.ms.shoppingcart.shoppingcart.dto.CartDTO;
import com.colt.estudo.ms.shoppingcart.shoppingcart.dto.ItemDTO;
import com.colt.estudo.ms.shoppingcart.shoppingcart.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/carts")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CartController {

    private final CartService cartService;

    @PostMapping("/{id}")
    public CartDTO addItem(@PathVariable("id") Integer id, @RequestBody ItemDTO itemDTO) {
        return cartService.addItem(itemDTO, id);
    }

    @DeleteMapping("/{id}")
    public void clear(@PathVariable("id") Integer id) {
        cartService.deleteById(id);
    }

    @GetMapping("/{id}")
    public CartDTO findCart(@PathVariable("id") Integer id) {
        return cartService.findById(id);
    }
}
