package com.company.application.app;

import com.company.application.entity.ExtStorage;
import com.company.inventorycontrolsystem.entity.Storage;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class StorageService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public List<Storage> fetchStorage() {
        return entityManager.createQuery("select e from ics_Storage e", Storage.class)
                .getResultList();
    }

    @Transactional
    public List<ExtStorage> fetchExtStorage() {
        return entityManager.createQuery("select e from ExtStorage e", ExtStorage.class)
                .getResultList();
    }
}