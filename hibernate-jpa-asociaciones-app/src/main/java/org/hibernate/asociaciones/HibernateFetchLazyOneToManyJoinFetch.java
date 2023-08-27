package org.hibernate.asociaciones;

import jakarta.persistence.EntityManager;
import org.hibernate.asociaciones.entity.Cliente;
import org.hibernate.asociaciones.util.JpaUtil;

public class HibernateFetchLazyOneToManyJoinFetch {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();

        Cliente cliente = em.createQuery("Select c from cliente c left outer join fetch" +
                "c.direcciones left join fetch c.detalle where c.id=id", Cliente.class)
                .setParameter("id", 1L).getSingleResult();
        System.out.println(cliente.getNombre()+ ", direcciones: "+ cliente.getDirecciones());
        System.out.println(cliente.getNombre()+", detalle "+ cliente.getDetalle());
        em.close();
    }
}
