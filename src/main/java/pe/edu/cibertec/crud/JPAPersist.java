package pe.edu.cibertec.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Libro;

import java.util.Date;

public class JPAPersist {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager en = emf.createEntityManager();

        //crear un libro
        Libro libro = new Libro("A100", "titulo", "autor",new Date(),50.45, null);

        //PERSIST
        en.getTransaction().begin();
        en.persist(libro);
        en.getTransaction().commit();


    }
}
