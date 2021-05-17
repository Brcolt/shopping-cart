package com.colt.estudo.ms.shoppingcart.shoppingcart.mapper;

import com.colt.estudo.ms.shoppingcart.shoppingcart.dto.ItemDTO;
import com.colt.estudo.ms.shoppingcart.shoppingcart.model.Item;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-05-17T15:26:59-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 14.0.2 (Oracle Corporation)"
)
public class ItemMapperImpl implements ItemMapper {

    @Override
    public Item toModel(ItemDTO itemDTO) {
        if ( itemDTO == null ) {
            return null;
        }

        Item item = new Item();

        item.setProductId( itemDTO.getProductId() );
        item.setAmount( itemDTO.getAmount() );

        return item;
    }

    @Override
    public ItemDTO toDTO(Item item) {
        if ( item == null ) {
            return null;
        }

        ItemDTO itemDTO = new ItemDTO();

        itemDTO.setProductId( item.getProductId() );
        itemDTO.setAmount( item.getAmount() );

        return itemDTO;
    }
}
