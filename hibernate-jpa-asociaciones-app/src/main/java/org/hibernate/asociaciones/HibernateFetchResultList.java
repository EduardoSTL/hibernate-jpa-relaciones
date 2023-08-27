package org.hibernate.asociaciones;

import jakarta.persistence.EntityManager;
import org.hibernate.asociaciones.entity.Cliente;
import org.hibernate.asociaciones.util.JpaUtil;

import java.util.List;

public class HibernateFetchResultList {
    public static void main(String[] args) {
        EntityManager manager = JpaUtil.getEntityManager();
        List<Cliente> clientes = manager.createQuery("SELECT  distinct c from Cliente c " +
                "left outer join fetch c.direcciones left outer join fetch c.detalle"
        , Cliente.class).getResultList();

        clientes.forEach(c -> System.out.println(c.getNombre() + ", direcciones: " + c.getDirecciones()));
        manager.close();
    }
}
