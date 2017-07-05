package com.felipecao.example.web.dto.factory;

public interface DTOFactory<E, D> {
    D build(E entity);
    Boolean appliesTo(Class<E> entity);
}
