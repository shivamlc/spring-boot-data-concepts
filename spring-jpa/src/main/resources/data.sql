-- the create table command below will automatically create a person table in H2 database
-- this is possible by autoconfiguration feature of spring boot
CREATE TABLE IF NOT EXISTS PERSON_TABLE (
    ID INT PRIMARY KEY,
    PERSON_NAME VARCHAR(255),
    LOCATION VARCHAR(255),
    BIRTH_DATE TIMESTAMP
);
-- similarly, the insert into command below will automatically populate tables with data
-- this is possible by autoconfiguration feature of spring boot
INSERT INTO person_table (id, person_name, location, birth_date)
VALUES (1001, 'Alex', 'Brisbane', NOW());

-- INSERT INTO PERSON (ID, NAME, LOCATION, DOB)
-- VALUES (1009, 'Aanders', 'Brisbane', CURRENT_TIMESTAMP);

-- INSERT INTO PERSON (ID, NAME, LOCATION, DOB)
-- VALUES (1002, 'Karl', 'Sydney', CURRENT_TIMESTAMP);

-- INSERT INTO PERSON (ID, NAME, LOCATION, DOB)
-- VALUES (1003, 'Mark', 'Brisbane', CURRENT_TIMESTAMP);

-- INSERT INTO PERSON (ID, NAME, LOCATION, DOB)
-- VALUES (1005, 'Alok', 'Melbourne', CURRENT_TIMESTAMP);

-- INSERT INTO PERSON (ID, NAME, LOCATION, DOB)
-- VALUES (1015, 'Sam', 'Melbourne', CURRENT_TIMESTAMP);

-- INSERT INTO PERSON (ID, NAME)
-- VALUES (1004, 'Ali');