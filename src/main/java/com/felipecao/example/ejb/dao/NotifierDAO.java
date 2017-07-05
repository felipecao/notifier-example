package com.felipecao.example.ejb.dao;

import com.felipecao.example.ejb.entity.Notifier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotifierDAO extends JpaRepository<Notifier, Long> {
}
