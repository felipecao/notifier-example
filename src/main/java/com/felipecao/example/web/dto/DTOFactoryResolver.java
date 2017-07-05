package com.felipecao.example.web.dto;

import com.felipecao.example.ejb.entity.ManagedEntity;
import com.felipecao.example.web.dto.factory.DTOFactory;

public interface DTOFactoryResolver {
    <E extends ManagedEntity, D extends DTO> DTOFactory<E, D> getFactoryForClass(Class<E> clz);
}
