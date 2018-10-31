package dao.impl;

import dao.AuthoritiesDAO;
import entities.Authorities;
import util.PersistenceUtil;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class AuthoritiesDAOImpl implements AuthoritiesDAO {

    @Override
    public void add(Authorities authorities) {
        EntityManager entityManager = PersistenceUtil.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(authorities);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Entity saved.");
    }

    @Override
    public List<Authorities> getAll() {
        EntityManager entityManager = PersistenceUtil.getEntityManager();
        entityManager.getTransaction().begin();
        TypedQuery<Authorities> query =
                entityManager.createQuery("SELECT a FROM Authorities a", Authorities.class);
        List<Authorities> authoritiesList = query.getResultList();
        entityManager.close();
        return authoritiesList;
    }

    @Override
    public Authorities getById(Long id){
        EntityManager entityManager = PersistenceUtil.getEntityManager();
        entityManager.getTransaction().begin();
        Authorities authorities = entityManager.find(Authorities.class, id);
        entityManager.close();
        return authorities;
    }

    @Override
    public void update(long id, String name){
        EntityManager entityManager = PersistenceUtil.getEntityManager();
        entityManager.getTransaction().begin();
        Authorities authorities = entityManager.find(Authorities.class, id);
        authorities.setName(name);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void remove(long id){
        EntityManager entityManager = PersistenceUtil.getEntityManager();
        entityManager.getTransaction().begin();
        Authorities authorities = entityManager.find(Authorities.class, id);
        entityManager.remove(authorities);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
