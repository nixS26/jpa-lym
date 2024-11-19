package pe.edu.cibertec.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Libro;

public class JPAMerge {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager en = emf.createEntityManager();

        Libro libro = en.find(Libro.class, "A1");
        libro.setAutor("Gabriel Garcia Marquez");

        en.getTransaction().begin();
        en.merge(libro);
        en.getTransaction().commit();




    }
}
