package com.felipecao.example.web.dto;

import com.felipecao.example.ejb.entity.Notifier;

public class NotifierDTO implements DTO<Notifier> {

    private Long notifierId;

    private String name;

    public NotifierDTO() {
    }

    public NotifierDTO(Long notifierId, String name) {
        this.notifierId = notifierId;
        this.name = name;
    }

    public Long getNotifierId() {
        return notifierId;
    }

    public void setNotifierId(Long notifierId) {
        this.notifierId = notifierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
