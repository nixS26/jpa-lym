-- Crear tabla "categoria" 
CREATE TABLE biblioteca.categoria (
      codigo varchar(100) NOT NULL,
      nombre varchar(100) NULL,
      CONSTRAINT categoria_pk PRIMARY KEY (codigo)
)
    ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4 
COLLATE=utf8mb4_0900_ai_ci;

-- Crear tabla "libros" 
CREATE TABLE biblioteca.libros (
       isbn VARCHAR(100) NOT NULL,
       titulo VARCHAR(100) NULL,
       autor VARCHAR(100) NULL,
       fecha DATE NULL,
       precio DOUBLE NULL,
       codigo_categoria varchar(100) NULL,
       CONSTRAINT libros_pk PRIMARY KEY (isbn),
       CONSTRAINT libros_categoria_FK FOREIGN KEY (codigo_categoria) REFERENCES biblioteca.categoria(codigo)
)
    ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4 
COLLATE=utf8mb4_0900_ai_ci;