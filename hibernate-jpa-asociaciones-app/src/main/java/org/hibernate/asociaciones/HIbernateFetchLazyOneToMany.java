package org.hibernate.asociaciones;

import jakarta.persistence.EntityManager;
import org.hibernate.asociaciones.entity.Cliente;
import org.hibernate.asociaciones.util.JpaUtil;

public class HIbernateFetchLazyOneToMany {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        Cliente cliente = em.find(Cliente.class, 1L);
        System.out.println(cliente.getNombre()+" , " + "Direcciones: " + cliente.getDirecciones());
        em.close();
    }
}
