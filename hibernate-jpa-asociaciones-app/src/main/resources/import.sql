INSERT INTO clientes (id, nombre, apellido, forma_pago, creado_en, editado_en) VALUES (1,'Andres','Guzman','debito',NULL,NULL),(2,'John','Doe','credito',NULL,NULL),(4,'Pepa','Doe','debito',NULL,NULL),(5,'Luci','Martinez','credito',NULL,NULL),(6,'Luna','Garcia','debito',NULL,NULL),(9,'John','Roe','paypal',NULL,NULL),(10,'Lou','Loe','paypal',NULL,NULL),(11,'Lalo','Mena','webpay','2021-10-01 10:45:45','2021-10-01 10:47:13'),(12,'Pia','Perez','paypal plus','2021-10-01 11:48:30','2021-10-01 11:49:35');
INSERT INTO alumnos (id, nombre, apellido) VALUES(1, 'Johana', 'Doe');
INSERT INTO alumnos (id, nombre, apellido) VALUES(2, 'Pepe', 'Gon');
INSERT INTO cursos (id, titulo, profesor) VALUES(1, 'Curso Spring', 'Andres');
INSERT INTO cursos (id, titulo, profesor) VALUES(2, 'Curso Java EE 9', 'Andres');
insert into direcciones(calle, numero) values ('vaticano', 123);
insert into direcciones(calle, numero) values ('colon', 456);
insert into tbl_clientes_direcciones (id_cliente, id_direccion) values (1, 1);
insert into tbl_clientes_direcciones (id_cliente, id_direccion) values (1, 2);
insert into clientes_detalles (prime, puntos_acumulados, cliente_detalle_id) values (1, 8000, 1);
insert into tbl_alumnos_cursos (alumno_id, curso_id) values (1, 1);
insert into tbl_alumnos_cursos (alumno_id, curso_id) values (1, 2);






