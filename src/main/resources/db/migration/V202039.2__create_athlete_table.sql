create table athlete (
    id bigint not null AUTO_INCREMENT,
    ref varchar(50) not null,
    team_ref varchar(50) not null,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    year int,
    gender ENUM('WOMAN', 'MAN'),
    team_id bigint,
    primary key (id),
    FOREIGN KEY (team_id) REFERENCES team(id)
);
ALTER TABLE athlete AUTO_INCREMENT = 1;