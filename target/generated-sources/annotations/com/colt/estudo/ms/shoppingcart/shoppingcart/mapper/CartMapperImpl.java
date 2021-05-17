package com.colt.estudo.ms.shoppingcart.shoppingcart.mapper;

import com.colt.estudo.ms.shoppingcart.shoppingcart.dto.CartDTO;
import com.colt.estudo.ms.shoppingcart.shoppingcart.dto.ItemDTO;
import com.colt.estudo.ms.shoppingcart.shoppingcart.model.Cart;
import com.colt.estudo.ms.shoppingcart.shoppingcart.model.Item;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-05-17T13:58:55-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 14.0.2 (Oracle Corporation)"
)
public class CartMapperImpl implements CartMapper {

    @Override
    public Cart toModel(CartDTO cartDTO) {
        if ( cartDTO == null ) {
            return null;
        }

        Cart cart = new Cart();

        cart.setId( cartDTO.getId() );
        cart.setItems( itemDTOListToItemList( cartDTO.getItems() ) );

        return cart;
    }

    @Override
    public CartDTO toDTO(Cart cart) {
        if ( cart == null ) {
            return null;
        }

        CartDTO cartDTO = new CartDTO();

        if ( cart.getId() != null ) {
            cartDTO.setId( cart.getId() );
        }
        cartDTO.setItems( itemListToItemDTOList( cart.getItems() ) );

        return cartDTO;
    }

    protected Item itemDTOToItem(ItemDTO itemDTO) {
        if ( itemDTO == null ) {
            return null;
        }

        Item item = new Item();

        item.setAmount( itemDTO.getAmount() );

        return item;
    }

    protected List<Item> itemDTOListToItemList(List<ItemDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Item> list1 = new ArrayList<Item>( list.size() );
        for ( ItemDTO itemDTO : list ) {
            list1.add( itemDTOToItem( itemDTO ) );
        }

        return list1;
    }

    protected ItemDTO itemToItemDTO(Item item) {
        if ( item == null ) {
            return null;
        }

        ItemDTO itemDTO = new ItemDTO();

        itemDTO.setAmount( item.getAmount() );

        return itemDTO;
    }

    protected List<ItemDTO> itemListToItemDTOList(List<Item> list) {
        if ( list == null ) {
            return null;
        }

        List<ItemDTO> list1 = new ArrayList<ItemDTO>( list.size() );
        for ( Item item : list ) {
            list1.add( itemToItemDTO( item ) );
        }

        return list1;
    }
}
