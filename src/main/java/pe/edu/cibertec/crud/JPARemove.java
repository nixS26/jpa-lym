package pe.edu.cibertec.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Libro;

public class JPARemove {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager en = emf.createEntityManager();

        //obtener la referencia
        Libro libro = en.find(Libro.class, "A100");
        en.getTransaction().begin();
        en.remove(libro);
        en.getTransaction().commit();


    }
}
