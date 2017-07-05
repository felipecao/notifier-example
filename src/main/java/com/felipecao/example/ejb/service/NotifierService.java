package com.felipecao.example.ejb.service;

import com.felipecao.example.ejb.dao.NotifierDAO;
import com.felipecao.example.ejb.entity.Notifier;
import com.felipecao.example.ejb.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotifierService {

    private NotifierDAO notifierDAO;

    @Autowired
    public NotifierService(NotifierDAO notifierDAO) {
        this.notifierDAO = notifierDAO;
    }

    public Notifier getNotifier(Long id){
        Notifier notifier = notifierDAO.findOne(id);

        if (null == notifier) {
            throw new EntityNotFoundException();
        }

        //faz mais alguma coisa aqui;
        return notifier;
    }

    public Notifier createNotifierWithName(String name){
        Notifier notifier = new Notifier();
        notifier.setName(name);
        return notifierDAO.save(notifier);
    }
}
