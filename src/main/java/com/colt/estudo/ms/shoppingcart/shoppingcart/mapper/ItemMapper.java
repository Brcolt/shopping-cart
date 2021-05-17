package com.colt.estudo.ms.shoppingcart.shoppingcart.mapper;

import com.colt.estudo.ms.shoppingcart.shoppingcart.dto.ItemDTO;
import com.colt.estudo.ms.shoppingcart.shoppingcart.model.Item;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ItemMapper {

    public ItemMapper INSTANCE = Mappers.getMapper(ItemMapper.class);

    Item toModel(ItemDTO itemDTO);

    ItemDTO toDTO(Item item);
}
