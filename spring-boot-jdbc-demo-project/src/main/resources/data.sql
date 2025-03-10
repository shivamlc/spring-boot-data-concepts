-- the create table command below will automatically create a person table in H2 database
-- this is possible by autoconfiguration feature of spring boot
create table Person
(
    id integer not null,
    name varchar(255) not null,
    location varchar(255),
    birth_date timestamp,
    primary key(id)
);

-- similarly, the insert into command below will automatically populate tables with data
-- this is possible by autoconfiguration feature of spring boot
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (1001, 'Alex', 'Brisbane', CURRENT_TIMESTAMP);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (1002, 'Karl', 'Sydney', CURRENT_TIMESTAMP);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (1003, 'Mark', 'Brisbane', CURRENT_TIMESTAMP);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (1005, 'Alok', 'Melbourne', CURRENT_TIMESTAMP);

INSERT INTO PERSON (ID, NAME)
VALUES (1004, 'Ali');