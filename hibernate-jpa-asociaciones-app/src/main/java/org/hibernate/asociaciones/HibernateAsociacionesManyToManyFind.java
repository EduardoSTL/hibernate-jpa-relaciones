package org.hibernate.asociaciones;

import jakarta.persistence.EntityManager;
import org.hibernate.asociaciones.entity.Alumno;
import org.hibernate.asociaciones.entity.Curso;
import org.hibernate.asociaciones.util.JpaUtil;

public class HibernateAsociacionesManyToManyFind {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            Alumno alumno1 = new Alumno("Cata", "Edu");
            Alumno alumno2 = new Alumno("Jano", "Fernan");

            Curso curso1 = new Curso("Curso Java", "Andres");
            Curso curso2 = new Curso("Jano", "Fernan");

            alumno1.addCurso(curso1);
            alumno1.addCurso(curso2);
            alumno2.addCurso(curso1);

            em.persist(alumno1);
            em.persist(alumno2);

            em.getTransaction().commit();

            System.out.println(alumno1);
            System.out.println(alumno2);

            em.getTransaction().begin();
            // c2 = em.find(Curso.class, 3L);
            Curso c2 = new Curso("Curso Java", "Andres");
            c2.setId(3L);
            alumno1.removeCurso(c2);
            em.getTransaction().commit();
            System.out.println(alumno1);
        } catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
