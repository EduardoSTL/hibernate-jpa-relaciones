package org.hibernate.asociaciones;

import jakarta.persistence.EntityManager;
import org.hibernate.asociaciones.entity.Alumno;
import org.hibernate.asociaciones.entity.Curso;
import org.hibernate.asociaciones.util.JpaUtil;

public class HibernateAsociacionesManyToManyFind {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        try {
            System.out.println("========= START: HibernateAsociacionesManyToManyFind =========");

        } catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
