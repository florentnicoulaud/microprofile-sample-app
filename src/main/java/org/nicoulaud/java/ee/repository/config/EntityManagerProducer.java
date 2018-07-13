package org.nicoulaud.java.ee.repository.config;

import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Dependent
public class EntityManagerProducer {

    @PersistenceContext(name = "persistenceUnit")
    private EntityManager entityManager;

    @Produces
    @RequestScoped
    public EntityManager createEntityManager() {
        return entityManager;
    }
}
