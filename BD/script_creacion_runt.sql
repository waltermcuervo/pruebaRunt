CREATE TABLE COLEGIO (idColegio number PRIMARY KEY, nombre VARCHAR(100));

CREATE TABLE CURSO (idCurso number PRIMARY KEY, FK_idColegio number, grado VARCHAR(100), salon VARCHAR(100));

CREATE TABLE ASIGNATURA (idAsignatura number PRIMARY KEY, FK_idCurso number, FK_idProfesor number,
                            nombre VARCHAR(100));

CREATE TABLE PROFESOR (idProfesor number PRIMARY KEY, nombre VARCHAR(100));

CREATE TABLE ESTUDIANTE (idEstudiante number PRIMARY KEY, nombre VARCHAR(100));

CREATE TABLE ESTUDIANTE_ASIGNATURA (id number PRIMARY KEY, FK_idEstudiante number, FK_idAsignatura number);


ALTER TABLE CURSO
    ADD FOREIGN KEY (FK_idColegio)
    REFERENCES COLEGIO(idColegio);

ALTER TABLE ASIGNATURA
    ADD FOREIGN KEY (FK_idProfesor)
    REFERENCES PROFESOR(idProfesor);

ALTER TABLE ASIGNATURA
    ADD FOREIGN KEY (FK_idCurso)
    REFERENCES CURSO(idCurso);

ALTER TABLE ESTUDIANTE_ASIGNATURA
    ADD FOREIGN KEY (FK_idEstudiante)
    REFERENCES ESTUDIANTE(idEstudiante);

ALTER TABLE ESTUDIANTE_ASIGNATURA
    ADD FOREIGN KEY (FK_idAsignatura)
    REFERENCES ASIGNATURA(idAsignatura);