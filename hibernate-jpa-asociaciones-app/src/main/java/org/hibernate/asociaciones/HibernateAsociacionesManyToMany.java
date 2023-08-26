package org.hibernate.asociaciones;

import jakarta.persistence.EntityManager;
import org.hibernate.asociaciones.entity.Alumno;
import org.hibernate.asociaciones.entity.Curso;
import org.hibernate.asociaciones.util.JpaUtil;

public class HibernateAsociacionesManyToMany {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            Alumno alumno1 = new Alumno("Cata", "Edu");
            Alumno alumno2 = new Alumno("Jaco", "Fernan");

            Curso curso1 = new Curso("Java", "Andres");
            Curso curso2 = new Curso("Curso Hibernate y JPA", "Andres");

            alumno1.getCursos().add(curso1);
            alumno1.getCursos().add(curso2);

            alumno2.getCursos().add(curso1);

            em.persist(alumno1);
            em.persist(alumno2);

            //Transaction 1
            em.getTransaction().commit();//TCL

            System.out.println(alumno1);
            System.out.println(alumno2);

            //Transaction 2
            em.getTransaction().begin();//TCL
            Curso c2 = em.find(Curso.class, 1L);
            alumno1.getCursos().remove(c2);
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
