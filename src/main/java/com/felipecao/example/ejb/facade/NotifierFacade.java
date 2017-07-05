package com.felipecao.example.ejb.facade;

import com.felipecao.example.ejb.entity.Notifier;
import com.felipecao.example.ejb.service.NotifierService;
import com.felipecao.example.web.dto.DTO;
import com.felipecao.example.web.dto.DTOFactoryResolver;
import com.felipecao.example.web.dto.NotifierDTO;
import com.felipecao.example.web.dto.factory.DTOFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class NotifierFacade {

    private NotifierService notifierServiceBean;

    private DTOFactory<Notifier, NotifierDTO> dtoFactory;

    @Autowired
    public NotifierFacade(NotifierService notifierServiceBean, DTOFactoryResolver factoryResolver) {
        this.notifierServiceBean = notifierServiceBean;
        this.dtoFactory = factoryResolver.getFactoryForClass(Notifier.class);
    }

    public DTO<Notifier> getNotifier(Long id){
        Notifier notifier = notifierServiceBean.getNotifier(id);
        DTO<Notifier> dto = dtoFactory.build(notifier);

        return dto;
    }

    public DTO<Notifier> createNotifier(NotifierDTO input){
        Notifier notifier = notifierServiceBean.createNotifierWithName(input.getName());
        DTO<Notifier> dto = dtoFactory.build(notifier);

        return dto;
    }
}
