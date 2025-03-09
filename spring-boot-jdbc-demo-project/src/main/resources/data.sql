-- the create table command below will automatically create a person table in H2 database
create table Person
(
    id integer not null,
    name varchar(255) not null,
    location varchar(255),
    birth_date timestamp,
    primary key(id)
);