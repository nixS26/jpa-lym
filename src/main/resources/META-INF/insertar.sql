-- Insertar registros en tabla "categoria"
insert into categoria(codigo, nombre) values('C1', 'Romance');
insert into categoria(codigo, nombre) values('C2', 'Novela');
insert into categoria(codigo, nombre) values('C3', 'Ensayo');
insert into categoria(codigo, nombre) values('C4', 'Documentación');
insert into categoria(codigo, nombre) values('C5', 'Poesía');

-- Insertar registros en tabla "libros"
insert into libros(isbn, titulo, autor, fecha, precio, codigo_categoria) values('A1', 'Java Persistence API (JPA)', 'Cesar', '1983-07-28', 50.90, 'C4');
insert into libros(isbn, titulo, autor, fecha, precio, codigo_categoria) values('A2', 'Hibernate', 'Cesar', '1986-05-04', 30.10, 'C4');
insert into libros(isbn, titulo, autor, fecha, precio, codigo_categoria) values('A3', 'Cálculo 01', 'Venero Corrales', '2020-01-30', 70.23, 'C4');
insert into libros(isbn, titulo, autor, fecha, precio, codigo_categoria) values('A4', 'Don Quijote de La Mancha', 'Miguel De Cervantes', '1994-02-20', 110.25, 'C2');
insert into libros(isbn, titulo, autor, fecha, precio, codigo_categoria) values('A5', 'Los Miserables', 'Victor Hugo', '1980-01-30', 102.00, 'C2');
insert into libros(isbn, titulo, autor, fecha, precio, codigo_categoria) values('A6', 'Cuentos Completos', 'Ribeyro', '1992-01-15', 72.60, 'C3');
insert into libros(isbn, titulo, autor, fecha, precio, codigo_categoria) values('A7', 'Terror Nocturno 01', 'Claudia', '1984-01-15', 42.50, 'C1');
insert into libros(isbn, titulo, autor, fecha, precio, codigo_categoria) values('A8', 'Terror Nocturno 02', 'Claudia', '1985-01-04', 42.50, 'C1');
insert into libros(isbn, titulo, autor, fecha, precio, codigo_categoria) values('A9', 'Terror Nocturno 03', 'Claudia', '1989-05-24', 60.00, 'C1');
insert into libros(isbn, titulo, autor, fecha, precio, codigo_categoria) values('A10', 'Cantar de Mio Cid', null, '2001-12-10', 31.00, 'C2');