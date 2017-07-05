package com.felipecao.example.web.dto.factory;

public interface DTOFactory<E, D> {
    D build(E entity);
}
