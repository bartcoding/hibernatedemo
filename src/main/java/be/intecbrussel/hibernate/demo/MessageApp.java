package be.intecbrussel.hibernate.demo;

import be.intecbrussel.hibernate.demo.entities.Message;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MessageApp {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory
                = Persistence.createEntityManagerFactory("messageSource");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction
                = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(new Message("first dinges"));
        entityTransaction.commit();
        entityManagerFactory.close();
    }

}
