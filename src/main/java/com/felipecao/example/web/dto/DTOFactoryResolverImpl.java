package com.felipecao.example.web.dto;

import com.felipecao.example.ejb.entity.ManagedEntity;
import com.felipecao.example.web.dto.factory.DTOFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DTOFactoryResolverImpl implements DTOFactoryResolver {

    private List<DTOFactory> factories;

    public DTOFactoryResolverImpl(List<DTOFactory> factories) {
        this.factories = factories;
    }

    public <E extends ManagedEntity, D extends DTO> DTOFactory<E, D> getFactoryForClass(Class<E> clz) {
        return factories.
                stream()
                .filter(f -> f.appliesTo(clz))
                .findFirst()
                .orElseGet(() -> null);
    }

}
