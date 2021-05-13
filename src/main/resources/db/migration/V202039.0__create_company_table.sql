create table company (
    id SERIAL PRIMARY KEY ,
    ref varchar(50) not null,
    name varchar(255) not null,
    address1 varchar(255),
    address2 varchar(255),
    zip int not null,
    city varchar(255),
    email varchar(255),
    mobile varchar(20)
);
