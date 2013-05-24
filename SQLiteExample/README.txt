Cómo Crear una BD Sqlite desde la consola:

c:\ruta\proyecto> sqlite3 bdejemplo.db
SQLite version 3.7.3
Enter ".help" for instructions
Enter SQL statements terminated with a ";"
sqlite> create table mitabla (id integer unique primary key, nombre varchar(30));
sqlite> insert into mitabla values (1,"prueba");
sqlite> insert into mitabla values (2,"otra prueba");
sqlite> .q
c:\ruta\proyecto> 