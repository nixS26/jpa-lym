package pe.edu.cibertec.jpaql;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import pe.edu.cibertec.entity.Libro;

public class JPAQueries {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager en = emf.createEntityManager();


        /*
        * existen dos tipos de querys, uno como query nativo y otro como jpql
        * SELECT*/
       // TypedQuery<Libro> query = en.createQuery("SELECT b FROM Libro b", Libro.class);

        //SELECT - WHERE
        /*
        TypedQuery<Libro> query = en.createQuery("select l from Libro l where l.autor = :autor", Libro.class);
        query.setParameter("autor", "Claudia");
        */

        //SELECT - WHERE - BETWEEN
        //CUANDO QUERAMOS ESTABLECER UN RANGO ENTRE DOS VALORES
        /*
        TypedQuery<Libro> query = en.createQuery("select l from Libro l where l.precio between :inicio and :fin", Libro.class);
        query.setParameter("inicio", 30);
        query.setParameter("fin", 50);
        */

        //SELECT - WHERE - IN
        //cuando queremos traer valores que contengan un dato exacto, como un autor, precio etc
        /*
        TypedQuery<Libro> query = en.createQuery("select l from Libro l where l.autor in ('Claudia','Cesar')", Libro.class);
        */

        //SELECT - VALORES ESCALARES
        //cuando queremos traer a valores
        /*
        TypedQuery<String> query = en.createQuery("select l.autor from Libro l where l.autor in ('Claudia','Cesar')", String.class);
        */

        //SELECT - VALORES ESCALARES - DISTINCT
        /*
        TypedQuery<String> query = en.createQuery("select distinct  upper(l.autor) from Libro l where l.autor in ('Claudia','Cesar')", String.class);
        */

        //SELECT - ORDER BY
        /*
        TypedQuery<Libro> query = en.createQuery("select l from Libro l order by precio desc", Libro.class);
    */

        //SELECT - ORDER BY
        //Se utiliza para representar mas de un valor, es el padre de todos lot ipos de datos, en este caso estamos obteniendo un int y un string
       /* TypedQuery<Object[]> query = en.createQuery("select l.autor, count(l) from Libro l group by l.autor", Object[].class);
        */
        //utilizamos este tipo de impresion, debido a que necesitamos de una var donde se manden los resultados

        //cada elemento del arreglo lo queiro manipular  va a llegar a {}
        /*
        query.getResultList().forEach(elemento ->{
            System.out.println(elemento[0] + "->" + elemento[1]);
        });
        */
        //SELECT - IS NULL
        /*TypedQuery<Libro> query = en.createQuery("select l from Libro l where l.autor is null", Libro.class);
*/
        //SELECT - LIKE
        //Cuando queremos que comience con cierta letra
        TypedQuery<Libro> query = en.createQuery("select l from Libro l where l.titulo like 'c%'", Libro.class);







        //print
  query.getResultList().forEach(System.out::println);



    }
}
