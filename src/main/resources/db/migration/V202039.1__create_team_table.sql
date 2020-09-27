create table team (
    id bigint not null AUTO_INCREMENT,
    ref varchar(10) not null,
    name varchar(255) not null,
    primary key (id)
);
ALTER TABLE team AUTO_INCREMENT = 1;