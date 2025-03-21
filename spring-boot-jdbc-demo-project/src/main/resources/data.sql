-- the create table command below will automatically create a person table in H2 database
-- this is possible by autoconfiguration feature of spring boot
create table Person
(
    id integer not null,
    name varchar(255) not null,
    location varchar(255),
    dob timestamp,
    primary key(id)
);

-- similarly, the insert into command below will automatically populate tables with data
-- this is possible by autoconfiguration feature of spring boot
INSERT INTO PERSON (ID, NAME, LOCATION, DOB)
VALUES (1001, 'Alex', 'Brisbane', CURRENT_TIMESTAMP);

INSERT INTO PERSON (ID, NAME, LOCATION, DOB)
VALUES (1009, 'Aanders', 'Brisbane', CURRENT_TIMESTAMP);

INSERT INTO PERSON (ID, NAME, LOCATION, DOB)
VALUES (1002, 'Karl', 'Sydney', CURRENT_TIMESTAMP);

INSERT INTO PERSON (ID, NAME, LOCATION, DOB)
VALUES (1003, 'Mark', 'Brisbane', CURRENT_TIMESTAMP);

INSERT INTO PERSON (ID, NAME, LOCATION, DOB)
VALUES (1005, 'Alok', 'Melbourne', CURRENT_TIMESTAMP);

INSERT INTO PERSON (ID, NAME, LOCATION, DOB)
VALUES (1015, 'Sam', 'Melbourne', CURRENT_TIMESTAMP);

INSERT INTO PERSON (ID, NAME)
VALUES (1004, 'Ali');