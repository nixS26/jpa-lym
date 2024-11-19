package pe.edu.cibertec.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Libro;

public class JPAFind {

    public static void main(String[] args) {
        //referenciar al ENF Y EM
        //nos piden el nombre de la unidad de persistencia
        //
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager en = emf.createEntityManager();

        //obtener libro
        Libro libro = en.find(Libro.class, "A1");
        System.out.println(libro);


    }
}
