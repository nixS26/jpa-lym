package pe.edu.cibertec.generation;

import jakarta.persistence.Persistence;

public class JPAGeneration {
    public static void main(String[] args) {
        //regenerar el schema
        Persistence.generateSchema("biblioteca",null);


    }
}
