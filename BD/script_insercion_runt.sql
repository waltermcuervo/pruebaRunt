insert into COLEGIO values (1, 'El colegio del Olimpo');

insert into CURSO values (1, '10', 'A',1);
insert into CURSO values (2, '10', 'B',1);
insert into CURSO values (3, '11', 'A',1);
insert into CURSO values (4, '11', 'B', 1);

insert into ESTUDIANTE values (1, 'Afrodita');
insert into ESTUDIANTE values (2, 'Apolo');
insert into ESTUDIANTE values (3, 'Ares');
insert into ESTUDIANTE values (4, 'Artemisa');
insert into ESTUDIANTE values (5, 'Atenea');
insert into ESTUDIANTE values (6, 'Dionisio');
insert into ESTUDIANTE values (7, 'Hefesto');
insert into ESTUDIANTE values (8, 'Hera');
insert into ESTUDIANTE values (9, 'Hermes');
insert into ESTUDIANTE values (10, 'Hades');
insert into ESTUDIANTE values (11, 'Poseidón');
insert into ESTUDIANTE values (12, 'Zeus');

insert into PROFESOR values (1, 'Némesis');
insert into PROFESOR values (2, 'Príapo');
insert into PROFESOR values (3, 'Iris');

insert into ASIGNATURA values (1, 'Matemáticas', 1, 1 );
insert into ASIGNATURA values (2, 'Español', 1, 2);
insert into ASIGNATURA values (3, 'Ingles básico', 1, 3);
insert into ASIGNATURA values (4, 'Matemáticas', 2, 1);
insert into ASIGNATURA values (5, 'Español', 2, 2);
insert into ASIGNATURA values (6, 'Ingles avanzado', 2, 3);
insert into ASIGNATURA values (7, 'Matemáticas', 3, 1);
insert into ASIGNATURA values (8, 'Pre Icfes', 3, 1);
insert into ASIGNATURA values (9, 'Matemáticas', 4, 1);
insert into ASIGNATURA values (10, 'Pre Icfes', 4, 1);

--10A
insert into ESTUDIANTE_ASIGNATURAS values (1, 1);
insert into ESTUDIANTE_ASIGNATURAS values (1, 2);
insert into ESTUDIANTE_ASIGNATURAS values (1, 3);
insert into ESTUDIANTE_ASIGNATURAS values (2, 1);
insert into ESTUDIANTE_ASIGNATURAS values (2, 2);
insert into ESTUDIANTE_ASIGNATURAS values (2, 3);
insert into ESTUDIANTE_ASIGNATURAS values (3, 1);
insert into ESTUDIANTE_ASIGNATURAS values (3, 2);
insert into ESTUDIANTE_ASIGNATURAS values (3, 3);

--10B
insert into ESTUDIANTE_ASIGNATURAS values (4, 4);
insert into ESTUDIANTE_ASIGNATURAS values (4, 5);
insert into ESTUDIANTE_ASIGNATURAS values (4, 6);
insert into ESTUDIANTE_ASIGNATURAS values (5, 4);
insert into ESTUDIANTE_ASIGNATURAS values (5, 5);
insert into ESTUDIANTE_ASIGNATURAS values (5, 6);
insert into ESTUDIANTE_ASIGNATURAS values (6, 4);
insert into ESTUDIANTE_ASIGNATURAS values (6, 5);
insert into ESTUDIANTE_ASIGNATURAS values (6, 6);

--11A
insert into ESTUDIANTE_ASIGNATURAS values (7, 7);
insert into ESTUDIANTE_ASIGNATURAS values (7, 8);
insert into ESTUDIANTE_ASIGNATURAS values (8, 7);
insert into ESTUDIANTE_ASIGNATURAS values (8, 8);

--11B
insert into ESTUDIANTE_ASIGNATURAS values (9, 9);
insert into ESTUDIANTE_ASIGNATURAS values (9, 10);
insert into ESTUDIANTE_ASIGNATURAS values (10, 9);
insert into ESTUDIANTE_ASIGNATURAS values (10, 10);
insert into ESTUDIANTE_ASIGNATURAS values (11, 9);
insert into ESTUDIANTE_ASIGNATURAS values (11, 10);
insert into ESTUDIANTE_ASIGNATURAS values (12, 9);
insert into ESTUDIANTE_ASIGNATURAS values (12, 10);

