package dao;

import model.Information;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class InDatabaseInformationDao implements InformationDao{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();

    public List<Information> getAll() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Information> list = em.createQuery("select c from Information c", Information.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    public Information getById(Integer id) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Information information = em.find(Information.class, id);
        em.getTransaction().commit();
        em.close();
        return information;
    }

    public void update(Information information) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Information entity = em.find(Information.class, information.getId());
        entity.setSubjects(information.getSubjects());
        entity.setName(information.getName());
        entity.setRollNumber(information.getRollNumber());
        entity.setTheoreticalPoint(information.getTheoreticalPoint());
        entity.setPracticePoints(information.getPracticePoints());
        entity.setAssignmentPoints(information.getAssignmentPoints());
        entity.setCreateAT(information.getCreateAT());
        entity.setUpdateAt(information.getUpdateAt());
        em.getTransaction().commit();
        em.close();
    }

    public void insert(Information information) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(information);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(Integer id) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Information entity = em.find(Information.class, id);
        em.remove(entity);
        em.getTransaction().commit();
        em.close();
    }
}
