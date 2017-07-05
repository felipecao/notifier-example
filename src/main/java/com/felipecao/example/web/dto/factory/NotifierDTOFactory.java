package com.felipecao.example.web.dto.factory;

import com.felipecao.example.ejb.entity.Notifier;
import com.felipecao.example.web.dto.NotifierDTO;
import org.springframework.stereotype.Component;

@Component
public class NotifierDTOFactory implements DTOFactory<Notifier, NotifierDTO> {
    @Override
    public NotifierDTO build(Notifier entity) {
        return new NotifierDTO(entity.getId(), entity.getName());
    }

    @Override
    public Boolean appliesTo(Class<Notifier> entity) {
        return Notifier.class.equals(entity);
    }
}
