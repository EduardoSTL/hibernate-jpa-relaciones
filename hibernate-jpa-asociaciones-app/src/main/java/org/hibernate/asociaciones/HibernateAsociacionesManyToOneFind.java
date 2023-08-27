package org.hibernate.asociaciones;

import jakarta.persistence.EntityManager;
import org.hibernate.asociaciones.entity.Cliente;
import org.hibernate.asociaciones.entity.Factura;
import org.hibernate.asociaciones.util.JpaUtil;

public class HibernateAsociacionesManyToOneFind {
    public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();

        try {
            System.out.println("========= START: HibernateAsociacionesManyToOneFind =========");
            em.getTransaction().begin();
            Cliente cliente = em.find(Cliente.class, 9L);

            Factura factura = new Factura("compras de oficina", 1000L);
            factura.setCliente(cliente);
            em.persist(factura);

            System.out.println(factura.getCliente());
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
