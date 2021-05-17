package com.colt.estudo.ms.shoppingcart.shoppingcart.mapper;

import com.colt.estudo.ms.shoppingcart.shoppingcart.dto.CartDTO;
import com.colt.estudo.ms.shoppingcart.shoppingcart.model.Cart;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CartMapper {

    CartMapper INSTANCE = Mappers.getMapper(CartMapper.class);

    Cart toModel(CartDTO cartDTO);

    CartDTO toDTO(Cart cart);
}
