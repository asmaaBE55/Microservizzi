package com.myrestaurant.store.pizzarestaurant.pizzaservice.Mapper;

import java.util.List;

public interface GenericMapper<E, D> {
    E asEntity(D dto);

    D asDTO(E entity);

    List<E> asEntityList(List<D> dtoList);

    List<D> asDTOlist(List<E> entityList);
}
