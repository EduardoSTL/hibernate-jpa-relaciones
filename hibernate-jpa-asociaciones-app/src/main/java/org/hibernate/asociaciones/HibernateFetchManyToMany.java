package org.hibernate.asociaciones;

import jakarta.persistence.EntityManager;
import org.hibernate.asociaciones.util.JpaUtil;
import org.hibernate.asociaciones.entity.Alumno;

import java.util.List;

public class HibernateFetchManyToMany {
    public static void main(String[] args) {
        EntityManager manager = JpaUtil.getEntityManager();

        List<Alumno> alumnos =manager.createQuery("SELECT DISTINCT a FROM Alumno a LEFT " +
                "OUTER JOIN FETCH a.cursos", Alumno.class).getResultList();
        alumnos.forEach(a -> System.out.println(a.getNombre() + ", cursos: " + a.getCursos()));
        manager.close();
    }

}
