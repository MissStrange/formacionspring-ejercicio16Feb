INSERT INTO clientes (nombre, apellido, email, telefono, created_at) VALUES ("Jose", "Perez", "jp@gmail.com", 678345123, "2022-02-11");
INSERT INTO clientes (nombre, apellido, email, telefono, created_at) VALUES ("Luis", "Ruiz", "lr@gmail.com", 698674532, "2022-02-11");
INSERT INTO clientes (nombre, apellido, email, telefono, created_at) VALUES ("María", "Muñoz", "mm@gmail.com", 645321897, "2022-02-11");
INSERT INTO clientes (nombre, apellido, email, telefono, created_at) VALUES ("Jonathan", "Sánchez", "js@gmail.com", 678652173, "2022-02-11");
INSERT INTO clientes (nombre, apellido, email, telefono, created_at) VALUES ("Mateo", "Lopez", "ml@gmail.com", 623478904, "2022-02-11");
INSERT INTO clientes (nombre, apellido, email, telefono, created_at) VALUES ("Marta", "Salvador", "ms@gmail.com", 677652903, "2022-02-11");
INSERT INTO clientes (nombre, apellido, email, telefono, created_at) VALUES ("Óscar", "Lopez", "ol@gmail.com", 623548321, "2022-02-11");
INSERT INTO clientes (nombre, apellido, email, telefono, created_at) VALUES ("Iraia", "García", "ig@gmail.com", 614236789, "2022-02-11");

insert into usuarios(username, password, enabled) values ("Rolando", "", 1);
insert into usuarios(username, password, enabled) values ("Fermín", "", 1);

insert into roles(nombre) values("ROLE_USER");
insert into roles(nombre) values("ROLE_ADMIN");

insert into usuarios_roles(usuario_id, rol_id) values (1, 1);
insert into usuarios_roles(usuario_id, rol_id) values (2, 2);
insert into usuarios_roles(usuario_id, rol_id) values (2, 1);