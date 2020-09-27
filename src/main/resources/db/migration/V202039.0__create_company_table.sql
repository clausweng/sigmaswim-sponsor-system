create table company (
    id bigint not null AUTO_INCREMENT,
    ref varchar(50) not null,
    name varchar(255) not null,
    address1 varchar(255),
    address2 varchar(255),
    zip int not null,
    city varchar(255),
    email varchar(255),
    mobile varchar(20),
    primary key (id)
);
ALTER TABLE company AUTO_INCREMENT = 1;